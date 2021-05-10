package com.example.koreanclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;

public class page extends AppCompatActivity {

    private ConstraintLayout pageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        pageview = (ConstraintLayout)findViewById(R.id.pageview);
        Button btn = new Button(this);
        btn.setId(Integer.parseInt("1"));
        btn.setText("버튼");
        btn.setX(250);
        btn.setY(250);
        pageview.addView(btn);
    }
}