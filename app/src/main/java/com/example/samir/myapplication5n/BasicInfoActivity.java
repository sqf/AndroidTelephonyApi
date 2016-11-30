package com.example.samir.myapplication5n;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BasicInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info);
        final Button button1 = (Button) findViewById(R.id.buttonGetData);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("myTag", "jestem w basic info get");
                TelephonyManager tele = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
                int callState = tele.getCallState();
                final TextView textViewCallState = (TextView) findViewById(R.id.textViewCallState);
                textViewCallState.setText(Integer.toString(callState));
                int PhoneType = tele.getPhoneType();
                final TextView textViewPhoneType = (TextView) findViewById(R.id.textViewPhoneType);
                textViewPhoneType.setText(Integer.toString(PhoneType));
                int NetworkType = tele.getNetworkType();
                final TextView textViewNetworkType = (TextView) findViewById(R.id.textViewNetworkType);
                textViewNetworkType.setText(Integer.toString(NetworkType));
                String SimId = tele.getSubscriberId();
                final TextView textViewSimId = (TextView) findViewById(R.id.textViewSimId);
                textViewSimId.setText(SimId);
            }
        });
    }
}
