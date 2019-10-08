package com.example.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void Click1(View v){
        showA(1);
    }

    public void Click2(View v){
        showA(2);
    }

    public void Click3(View v){
        showA(3);
    }

    public void Click4(View v){
        txv=findViewById(R.id.textView4);
        txv.setText("0");
        txv=findViewById(R.id.textView6);
        txv.setText("0");
    }
    private void showA(int i){
        txv=findViewById(R.id.textView6);
        String res=txv.getText().toString();
        int oldscore=Integer.parseInt(res);
        int newscore=oldscore+i;
        txv.setText(String.valueOf(newscore));
    }

    public void Click11(View v){
        showB(1);
    }

    public void Click22(View v){
        showB(2);
    }

    public void Click33(View v){
        showB(3);
    }


    private void showB(int i){
        txv=findViewById(R.id.textView4);
        String res=txv.getText().toString();
        int oldscore=Integer.parseInt(res);
        int newscore=oldscore+i;
        txv.setText(String.valueOf(newscore));
    }
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        String scorea=((TextView)findViewById(R.id.textView6)).getText().toString();
        String scoreb=((TextView)findViewById(R.id.textView4)).getText().toString();
        outState.putString("teama_score",scorea);
        outState.putString("teamb_score",scoreb);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        String scorea=savedInstanceState.getString("teama_score");
        String scoreb=savedInstanceState.getString("teamb_score");
        ((TextView)findViewById(R.id.textView6)).setText(scorea);
        ((TextView)findViewById(R.id.textView4)).setText(scoreb);
    }

}
