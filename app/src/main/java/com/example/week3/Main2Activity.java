package com.example.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Click1(View v){
        show(1);
    }

    public void Click2(View v){
        show(2);
    }

    public void Click3(View v){
        show(3);
    }

    public void Click4(View v){
        txv= findViewById(R.id.textView4);
        txv.setText("0");
    }

    private void show(int i){
        txv= findViewById(R.id.textView4);
        String score=txv.getText().toString();
        int oldScore= Integer.parseInt(score);
        int newScore= oldScore+i;
        txv.setText(String.valueOf(newScore));
    }
}
