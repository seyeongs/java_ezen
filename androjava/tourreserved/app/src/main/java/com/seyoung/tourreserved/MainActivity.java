package com.seyoung.tourreserved;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearVisiable;
    LinearLayout linearVisiableRadio;
    LinearLayout linearVisiableConfirm;

    CheckBox checkboxDiscount;
    CheckBox checkboxStart;

    Button btnPrice;
    EditText edtPerson;
    RadioGroup rdoG;
        //rdoKtx,rdoNewtown,rdoNomal

    TextView tvPrice;
    TextView tvResult;

    int personAccount;
    int result;
    int finalResult;
    int vehiclePrice;

    String strString;
    DecimalFormat df;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        df = new DecimalFormat("#,###");

        linearVisiable = findViewById(R.id.linearVisiable);
        linearVisiableRadio = findViewById(R.id.linearVisiableRadio);
        linearVisiableConfirm = findViewById(R.id.linearVisiableConfirm);

        checkboxDiscount = findViewById(R.id.checkboxDiscount);
        checkboxStart = findViewById(R.id.checkboxStart);

        btnPrice = findViewById(R.id.btnPrice);
        edtPerson = findViewById(R.id.edtPerson);
        rdoG = findViewById(R.id.rdoG);

        tvPrice = findViewById(R.id.tvPrice);
        tvResult = findViewById(R.id.tvResult);

        vehiclePrice=0;

        
        //시작함 체크 박스처리
        checkboxStart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    linearVisiable.setVisibility(View.VISIBLE);
                    linearVisiableRadio.setVisibility(View.VISIBLE);
                    linearVisiableConfirm.setVisibility(View.VISIBLE);
                }else{
                    linearVisiable.setVisibility(View.INVISIBLE);
                    linearVisiableRadio.setVisibility(View.INVISIBLE);
                    linearVisiableConfirm.setVisibility(View.INVISIBLE);
                }
            }
        });
        
        //라디오 버튼 처리
        rdoG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rdoKtx:
                        vehiclePrice = 100000;
                        break;
                    case R.id.rdoNewtown:
                        vehiclePrice = 70000;
                        break;
                    case R.id.rdoNomal:
                        vehiclePrice = 50000;
                        break;

                }
                personAccount = Integer.parseInt(edtPerson.getText().toString());
                result = personAccount*vehiclePrice;
                finalResult = result;
//                tvPrice.setText((String)df.format(result)+"원");
                tvPrice.setText((String)df.format(vehiclePrice)+"원");

            }
        });
        
        //할인카드 체크 처리
        checkboxDiscount.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    finalResult = (int) (result * 0.8);
                }
                else{
                    finalResult = result;
                }
            }
        });
        
        //요금 계산 버튼 처리
        btnPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edtPerson.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(), "인원수를 입력해 주세요", Toast.LENGTH_SHORT).show();
                }else if(vehiclePrice==0){
                    Toast.makeText(getApplicationContext(), "기차를 선택해 주세요", Toast.LENGTH_SHORT).show();
                }else{
                    tvResult.setText("총 지불 요금은 "+(String)df.format(finalResult)+"원 입니다.");
                    tvResult.setVisibility(View.VISIBLE);
                }

            }
        });


    }
}