package com.seyoung.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.xml.transform.Result;

public class ResultActivity extends AppCompatActivity {
    Button btnReturn;
    TextView tvResult;
    int korScore;
    int engScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        btnReturn = findViewById(R.id.btnReturn);
        tvResult = findViewById(R.id.tvResult);
        Intent gIntent = getIntent();

        korScore = gIntent.getExtras().getInt("KorScore");
        engScore = gIntent.getExtras().getInt("EngScore");

        tvResult.setText("**성적 결과**\n국어 : " + korScore + "\n영어 : " + engScore +
                "\n총점 : " +(korScore+engScore)+"\n평균 : " + ((korScore+engScore)/2)+"\n이상입니다.");

        Log.i("result","결과 값"+korScore);
        Log.i("result","결과 값"+engScore);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}