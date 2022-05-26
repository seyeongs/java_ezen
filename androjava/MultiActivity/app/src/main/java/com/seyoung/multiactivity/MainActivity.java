package com.seyoung.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnResultScore;
    Button btnFinish;

    EditText edtKor;
    EditText edtEng;
    String memo;
    int[] scores = new int[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("test","onCreate메소드 실행됨");
        btnResultScore = findViewById(R.id.btnResultScore);
        btnFinish = findViewById(R.id.btnFinish);
        edtEng = findViewById(R.id.edtEng);
        edtKor = findViewById(R.id.edtKor);

        btnResultScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scores[0]= Integer.parseInt(edtEng.getText().toString());
                scores[1]= Integer.parseInt(edtKor.getText().toString());
                Intent mkIntent = new Intent(getApplicationContext(), ResultActivity.class);
                mkIntent.putExtra("KorScore", scores[0]);
                mkIntent.putExtra("EngScore", scores[1]);

                startActivity(mkIntent);


            }
        });

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
    }//onCreate()

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("test","onStart메소드 실행됨");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("test","onResume메소드 실행됨");
        
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("test","onPause메소드 실행됨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("test","onStop메소드 실행됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("test","onDestroy메소드 실행됨");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("test","onRestart메소드 실행됨");
    }

}