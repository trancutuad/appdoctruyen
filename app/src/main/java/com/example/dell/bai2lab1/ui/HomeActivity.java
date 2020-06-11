package com.example.dell.bai2lab1.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.dell.bai2lab1.R;

public class HomeActivity extends AppCompatActivity {

    private LinearLayout gioithieu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        ;
        gioithieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, NguoidungActivity.class);
                startActivity(intent);
            }
        });

    }


    private void initView() {
        gioithieu = (LinearLayout) findViewById(R.id.gioithieu);

    }
}
