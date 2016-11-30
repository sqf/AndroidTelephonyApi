package com.example.samir.myapplication5n;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainBlockingActivity extends BroadcastReceiver {

    public static final String ABORT_PHONE_NUMBER = "799243290";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("myTag", "jestem w onReceive");
        if (intent.getAction().equals(
                Intent.ACTION_NEW_OUTGOING_CALL)) {
            String phoneNumber =
                    intent.getExtras().getString(Intent.EXTRA_PHONE_NUMBER);
            if ((phoneNumber != null)
                    && phoneNumber.equals(
                    MainBlockingActivity.ABORT_PHONE_NUMBER)) {
                Toast.makeText(context,
                        "NEW_OUTGOING_CALL intercepted to number "
                                + "799-243-290 - aborting call",
                        Toast.LENGTH_LONG).show();
                this.abortBroadcast();
            }
        }
    }
}
