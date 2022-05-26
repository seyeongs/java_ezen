package com.seyoung.fourbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFinish;
    Button btnNaver;
    Button btn119;
    Button btnGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn119 = findViewById(R.id.btn119);
        btnNaver = findViewById(R.id.btnNaver);
        btnGallery = findViewById(R.id.btnGallery);
        btnFinish = findViewById(R.id.btnfinish);
        btnNaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                startActivity(nintent);
            }
        });
        btn119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nintent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/119"));
                startActivity(nintent);
            }
        });
    }
}