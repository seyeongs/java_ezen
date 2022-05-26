package com.seyoung.numbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //선언부
    EditText edtNumber;
    Button btnGameStart;
    Button btnConfirm;
    Button btnMenuAuto;
    Button btnFinish;
    TextView tvHint;
    ImageView imgGame;
    int comNum; //1~100 사이의 난수
    int count; // 시도 횟수
    int myNum; // 사용자가 입력한 숫자
    String[] menu={"커피", "떡볶이", "순대", "어묵", "자장면"};
    int choice; // 메뉴 랜덤 선택 변수
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("숫자맞추기 게임");
        //선언된 객체를 xml 위젯과 연결(casting)
        edtNumber = findViewById(R.id.edtNumber);
        btnConfirm = findViewById(R.id.btnConfirm);
        btnGameStart = findViewById(R.id.btnGameStart);
        btnMenuAuto = findViewById(R.id.btnMenuAuto);
        btnFinish = findViewById(R.id.btnFinish);
        tvHint = findViewById(R.id.tvHint);
        imgGame = findViewById(R.id.imgGame);
        tvHint.setText("게임시작 버튼을 누르시면 게임이 시작돼요");
        InputMethodManager inputmm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        //메소드로 기능 처리
        //게임시작 버튼 메소드 처리
        btnGameStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comNum = (int)(Math.random()*100)+1;
                count=0;
                tvHint.setText("게임이 시작되었습니다");
                btnConfirm.setEnabled(true);
                btnGameStart.setEnabled(false);
                btnMenuAuto.setVisibility(View.INVISIBLE);
                imgGame.setImageResource(R.drawable.number);
            }
        });
        //확인버튼 메소드
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    count++;
                    myNum = Integer.parseInt(edtNumber.getText().toString());
                    if (myNum < comNum) {
                        tvHint.setText("당신의 숫자가 작습니다 \n시도횟수 : " + count);
                        imgGame.setImageResource(R.drawable.wrong);
                    } else if (myNum > comNum) {
                        tvHint.setText("당신의 숫자가 큽니다 \n시도횟수 : " + count);
                        imgGame.setImageResource(R.drawable.wrong);
                    } else {
                        tvHint.setText("축하합니다 시도횟수 : " + count);
                        imgGame.setImageResource(R.drawable.good);
                        btnGameStart.setEnabled(true);
                        btnConfirm.setEnabled(false);
                        inputmm.hideSoftInputFromWindow(edtNumber.getWindowToken(),0);
                        btnMenuAuto.setVisibility(View.VISIBLE);
                    }
                    edtNumber.setText("");
                }catch(NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"숫자를 입력해주세요",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //복불복 메뉴 선택 버튼 메소드
        btnMenuAuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice = (int)(Math.random()*menu.length)-1;
                tvHint.setText("당첨 복불복 내기 메뉴는 " + menu[choice] +"가(이) 선택되었습니다");
            }
        });

        //앱종료 버튼 메소드
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }//onCreate

}//MainActivity