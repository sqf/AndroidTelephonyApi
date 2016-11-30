package com.example.samir.myapplication5n;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button buttonBasicInfo = (Button) findViewById(R.id.buttonBasicInfo);
        buttonBasicInfo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BasicInfoActivity.class));
            }
        });
        final Button buttonBlocking = (Button) findViewById(R.id.buttonBlocking);
        buttonBlocking.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("myTag", "jestem w buttonBlocking.setOnClickListener");
                final IntentFilter theFilter = new IntentFilter();
                theFilter.addAction(TelephonyManager.ACTION_PHONE_STATE_CHANGED);
                theFilter.addAction(Intent.ACTION_NEW_OUTGOING_CALL);
//                mBroadcastReceiver = new MainBlockingActivity();
//                mService.registerReceiver(mBroadcastReceiver, theFilter);

                Intent intent = new Intent();
                intent.setAction("onReceive");
                intent.putExtra("value", 1000);
                sendBroadcast(intent);
            }
        });



    }


}



