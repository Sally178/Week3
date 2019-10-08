package com.example.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    EditText tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt=findViewById(R.id.button);
        tv=findViewById(R.id.editText);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = tv.getText().toString();
                float temp=Float.parseFloat(s);
                double result= temp*1.8+32;
                String res=String.format("%.2f",result);
                TextView tv2=findViewById(R.id.textView2);
                tv2.setText(res);
            }
        });
    }
}
