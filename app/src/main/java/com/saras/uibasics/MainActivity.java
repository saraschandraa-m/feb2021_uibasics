package com.saras.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        TextView mTvSetupWizard = findViewById(R.id.tv_setup_wizard);
        ImageView mIvPieImage = findViewById(R.id.iv_pie_chart);


    }
}