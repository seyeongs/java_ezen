package com.seyoung.bmicheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText heightEt;
    EditText weightEt;
    Button checkBtn;
    TextView resultBox;
    ImageView resultImg;
    double height;
    double weight;
    double standardWeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heightEt = findViewById(R.id.heightEt);
        weightEt = findViewById(R.id.weightEt);
        checkBtn = findViewById(R.id.checkBtn);
        resultBox = findViewById(R.id.resultBox);
        resultImg = findViewById(R.id.resultImg);
        
        //비만도체크버튼 클릭 메소드
        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strHeight = heightEt.getText().toString();
                String strWeight = weightEt.getText().toString();
                if (strHeight.equals("") || strWeight.equals("")) {
                    Toast.makeText(getApplicationContext(), "(IF)입력값이 비어있습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    try {
                        height = Double.parseDouble(strHeight);
                        weight = Double.parseDouble(strWeight);

                        //표준 몸무게 공식 (자신의 키-100)*0.9
                        //표준 마이너스+-5 면 정상
                        //표준 초과 비만
                        //표준 미만 마른체형
                        standardWeight = (height - 100) * 0.9;

                        if (weight > standardWeight + 5) {
                            resultBox.setText("비만입니다. 운동하세요.\n표준 몸무게: " + standardWeight);
                            resultImg.setImageResource(R.drawable.ob);
                            resetEt();
                        } else if (weight < standardWeight - 5) {
                            resultBox.setText("체중미달입니다. 잘 먹으세요.\n표준 몸무게: " + standardWeight);
                            resultImg.setImageResource(R.drawable.thin);
                            resetEt();
                        } else {
                            resultBox.setText("정상입니다. 유지하세요.\n표준 몸무게: " + standardWeight);
                            resultImg.setImageResource(R.drawable.good);
                            resetEt();
                        }
                    } catch (ArithmeticException e) {
                        Toast.makeText(getApplicationContext(), "0은 입력할 수 없습니다", Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException e) {
                        Toast.makeText(getApplicationContext(), "입력값이 비어있습니다.", Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "개발자에게 문의하세요.sdjkgd21@google " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }//onCreate

    private void resetEt(){
        heightEt.setText("");
        weightEt.setText("");
    }
}