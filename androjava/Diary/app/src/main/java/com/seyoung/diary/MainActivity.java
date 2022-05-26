package com.seyoung.diary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    CalendarView calView;

    EditText edtDiary;
    String fileName; //저장될 파일 이름
    String content;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calView = findViewById(R.id.calView);
        btnSave = findViewById(R.id.btnSave);
        edtDiary = findViewById(R.id.edtDiary);

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        fileName = year+"_"+month+"_"+day+".txt";
        edtDiary.setText(readDate(fileName));

        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                fileName = year+"_"+(month+1)+"_"+dayOfMonth+".txt";
                edtDiary.setText(readDate(fileName));
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileOutputStream saveF = openFileOutput(fileName,MODE_PRIVATE);
                    content = edtDiary.getText().toString();
                    saveF.write(content.getBytes());
                    saveF.close();
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private String readDate(String fileName){
        String diaryStr = null;
        try {
            FileInputStream importF = openFileInput(fileName);
            byte[] strb = new byte[importF.available()];
            importF.read(strb);
            content = new String(strb);
            diaryStr = new String(strb).trim();
            btnSave.setText("수정하기");
            importF.close();

        } catch (IOException e) {
            edtDiary.setText("");
            btnSave.setText("저장하기");
        }
        return diaryStr;
    }
}