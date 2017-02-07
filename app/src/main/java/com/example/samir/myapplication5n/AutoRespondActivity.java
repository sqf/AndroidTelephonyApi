package com.example.samir.myapplication5n;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AutoRespondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_respond_activity);

        final Button autoSmsButton = (Button) findViewById(R.id.autoSmsButton);
        autoSmsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("myTag", "jestem w AutoRespondActivity.setOnClickListener");
            }
        });
    }
}