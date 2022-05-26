package com.seyoung.voteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Integer[] renoirImagesID = {R.id.img1, R.id.img2, R.id.img3, R.id.img4, R.id.img5, R.id.img6, R.id.img7, R.id.img8, R.id.img9};
    ImageView[] renoirImages = new ImageView[9];
    Button btnVote;
    int[] voteNum = new int[renoirImages.length];
    String[] imgName={"독서하는 소녀", "꽃장식 모자소녀", "부채를 든 소녀", "이레느깡 단 베르앙", "잠자는 소녀",
            "테라스의 두 자매", "피아노 레슨", "피아노 앞의 소녀들", "해변에서"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("르누아르 명화 인기투표");

        btnVote = findViewById(R.id.btnVote);
        for(int i=0; i<renoirImages.length; i++){
            renoirImages[i] = findViewById(renoirImagesID[i]);
            //명화 클릭 처리
            final int idx = i;
            renoirImages[idx].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    voteNum[idx]++;
                    Toast.makeText(getApplicationContext(), imgName[idx]+" 총 "+ voteNum[idx] + "표", Toast.LENGTH_SHORT).show();
                }
            });
        }


        btnVote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent voteResultIntent = new Intent(getApplicationContext(), VoteResultActivity.class);
            for (int i = 0; i<renoirImages.length; i++) {
                voteResultIntent.putExtra("voteNum"+i, voteNum[i]);
                voteResultIntent.putExtra("imgName"+i, imgName[i]);
            } // for문 안쓰고 그냥 배열 형태로 넘겨줘도 된다
            startActivity(voteResultIntent);
            
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        for(int i = 0; i<voteNum.length; i++){
            voteNum[i] = 0;
        }
    }
}