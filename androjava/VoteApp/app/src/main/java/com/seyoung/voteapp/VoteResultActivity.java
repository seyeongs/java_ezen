package com.seyoung.voteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.Arrays;

public class VoteResultActivity extends AppCompatActivity {
    Integer[] imgsrces = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.pic9};
    Integer[] tvNamesID={R.id.tvName1, R.id.tvName2, R.id.tvName3, R.id.tvName4,R.id.tvName5,R.id.tvName6,R.id.tvName7,R.id.tvName8,R.id.tvName9};
    Integer[] rBarsID = {R.id.rBar1,R.id.rBar2,R.id.rBar3,R.id.rBar4,R.id.rBar5,R.id.rBar6,R.id.rBar7,R.id.rBar8,R.id.rBar9};
    TextView[] tvNames = new TextView[tvNamesID.length];
    TextView tvTop;
    ImageView imgTop;
    RatingBar[] rBars = new RatingBar[rBarsID.length];
    Button btnVoteReturn;
    int[] voteNums = new int[tvNamesID.length];
    int maxIdx;
    int bufferIdx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_result);
        setTitle("르누아르 명화 인기투표 결과");

        tvTop = findViewById(R.id.tvTop);
        imgTop = findViewById(R.id.imgTop);
        btnVoteReturn = findViewById(R.id.btnVoteReturn);

        Intent gIntent = getIntent();//mainActivity로 부터 받은

        for(int i =0; i<tvNamesID.length; i++){
            tvNames[i] = findViewById(tvNamesID[i]);
            tvNames[i].setText(gIntent.getStringExtra("imgName"+i)+" ("+gIntent.getIntExtra("voteNum"+i, 0)+"표)");

            rBars[i] = findViewById(rBarsID[i]);
            rBars[i].setRating((float)(gIntent.getIntExtra("voteNum"+i, 0)));

            voteNums[i] = gIntent.getIntExtra("voteNum"+i, 0);
        } //mainActivity에서 Intent를 통해 배열을 받은 경우 getIntArrayExtra(배열이름)메소드를 통해 배열 변수를 만들어 사용

        for(int j=1; j<voteNums.length; j++){
            if(voteNums[maxIdx] < voteNums[j]){
                maxIdx = j;
            }
        }


        imgTop.setImageResource(imgsrces[maxIdx]);
        tvTop.setText("최고의 명화는 "+gIntent.getStringExtra("imgName"+maxIdx));

        btnVoteReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}