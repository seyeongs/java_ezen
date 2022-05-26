package com.seyoung.choiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    ImageView imgCat;
    RadioGroup radioGroup;
//    RadioButton rdoCat, rdoDog, rdoRabit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        rdoCat=findViewById(R.id.rdoCat);
//        rdoDog=findViewById(R.id.rdoDog);
//        rdoRabit=findViewById(R.id.rdoRabit);
        radioGroup = findViewById(R.id.radioGro);
        imgCat = findViewById(R.id.imgCat);
        imgCat.setVisibility(View.INVISIBLE);
        checkBox = findViewById(R.id.checkBox);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rdoCat:
                        imgCat.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rdoDog:
                        imgCat.setImageResource(R.drawable.dog);
                        break;
                    case R.id.rdoRabit:
                        imgCat.setImageResource(R.drawable.rabbit);
                        break;
                }

            }
        });


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imgCat.setVisibility(View.VISIBLE);
                }else{
                    imgCat.setVisibility(View.INVISIBLE);

                }
            }
        });
    }
}