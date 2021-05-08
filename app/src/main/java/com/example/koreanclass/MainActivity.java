package com.example.koreanclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //    변수선언
    private ImageButton btn_pagemove;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        버튼모음
        btn_pagemove = (ImageButton) findViewById(R.id.btn_pagemove);

        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_pagemove:
                        intent = new Intent(MainActivity.this, page.class);
// 페이지 이동시 페이지넘버 넘기기
//                        intent.putExtra("pagenum", pagenum);
                        startActivity(intent);
                        finish();
                        break;
                }
            }
        };
        btn_pagemove.setOnClickListener(Listener);
    }
}
