package com.example.deepa.collegefinder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity_3 extends AppCompatActivity {
    ImageButton g_eng, g_med, g_mana, g_hotel, g_arch, g_law;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_3);
        g_eng = (ImageButton) findViewById(R.id.engineering);
        g_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://a4academics.com/careers-guidance-jobs/50-career-guidance-engineering-jobs"));
                startActivity(i);
            }
        });
    }
}