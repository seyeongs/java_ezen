package com.seyoung.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button[] btnNumpad = new Button[10];
Button[] btnClac = new Button[4];
Integer[] btnClacId = {R.id.btnSum,R.id.btnSub,R.id.btnMulti,R.id.btnDivid};

EditText edtNum1;
EditText edtNum2;

Button btnSum;
Button btnSub;
Button btnMulti;
Button btnDivid;

int result;

TextView tvResult;

String strNum1, strNum2;
Integer[] btnNumPadId={R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
        R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDivid = findViewById(R.id.btnDivid);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);

        tvResult = findViewById(R.id.tvResult);

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);

        for (int i=0; i<btnNumpad.length; i++){
            btnNumpad[i] = findViewById(btnNumPadId[i]);

            final int idx=i; //매번 선언과 초기화로 상수를 바꾸는 듯한 효과
            btnNumpad[idx].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(edtNum1.isFocused()){
                        strNum1 = edtNum1.getText().toString()+btnNumpad[idx].getText().toString();
                        edtNum1.setText(strNum1);
                    }else if(edtNum2.isFocused()){
                        strNum2 = edtNum2.getText().toString()+btnNumpad[idx].getText().toString();
                        edtNum2.setText(strNum2);
                    }else{
                        Toast.makeText(getApplicationContext(), "입력칸을 선택해주세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        for (int i=0; i<btnClac.length; i++){
            btnClac[i] = findViewById(btnClacId[i]);
            final int idx = i; //매번 선언과 초기화로 상수를 바꾸는 듯한 효과
            btnClac[idx].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(edtNum1.getText().toString().equals("") || edtNum2.getText().toString().equals("")) {
                            Toast.makeText(getApplicationContext(), "입려칸이 비어있습니다", Toast.LENGTH_SHORT).show();
                        }else {
                            if (idx == 0) {
                                result = Integer.parseInt(edtNum1.getText().toString()) + Integer.parseInt(edtNum2.getText().toString());
                                tvResult.setText("계산결과 : " + String.valueOf(result));
                            } else if (idx == 1) {
                                result = Integer.parseInt(edtNum1.getText().toString()) - Integer.parseInt(edtNum2.getText().toString());
                                tvResult.setText("계산결과 : " + String.valueOf(result));
                            } else if (idx == 2) {
                                result = Integer.parseInt(edtNum1.getText().toString()) * Integer.parseInt(edtNum2.getText().toString());
                                tvResult.setText("계산결과 : " + String.valueOf(result));
                            } else if (idx == 3) {
                                if (edtNum2.getText().toString().equals("0")) {
                                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다", Toast.LENGTH_SHORT).show();
                                } else {
                                    result = Integer.parseInt(edtNum1.getText().toString()) / Integer.parseInt(edtNum2.getText().toString());
                                    tvResult.setText("계산결과 : " + String.valueOf(result));
                                }
                            }
                        }
                    }
            });
        }
    }
}