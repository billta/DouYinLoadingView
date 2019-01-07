package com.ld.douyinloadingview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    DYLoadingView dy1;
    DYLoadingView dy2;
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dy1= (DYLoadingView) findViewById(R.id.dy1);
        dy2= (DYLoadingView) findViewById(R.id.dy2);
        btn1= (Button) findViewById(R.id.button1);
        btn2= (Button) findViewById(R.id.button2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.button1:
             dy1.setColors(Color.YELLOW,Color.GREEN,Color.RED);
             dy1.start();
             dy2.start();
             break;
         case R.id.button2:
             dy1.stop();
             dy2.stop();
             break;
         default:
             break;
     }
    }
}
