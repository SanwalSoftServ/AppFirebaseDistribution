package com.shree.appfirebasedistribution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textId = findViewById(R.id.text_id);

        if (BuildConfig.DEBUG) {
            textId.setText("This is Debug APK");
        }else{
            textId.setText("This is Release APK");
        }

    }
}