package com.example.ivanf.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String content = intent.getStringExtra("LANGUAGE_CONTENT");
        String name = intent.getStringExtra("LANGUAGE_NAME");
        Toast.makeText(SecondActivity.this,"You clicked "+name,Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(content);
    }
}
