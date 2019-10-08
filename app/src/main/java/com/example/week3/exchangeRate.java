package com.example.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class exchangeRate extends AppCompatActivity {

    EditText et;
    TextView txv;
    double dollar=0;
    double euro=0;
    double won=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_rate);
        //Intent intent=getIntent();
        //onActivityResult(1,2,intent);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu); //加载布局
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.item1){
            Toast.makeText(this, "You are already on the home page", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent config = new Intent(this,Config.class);
            config.putExtra("dollar",dollar);
            config.putExtra("euro",euro);
            config.putExtra("won",won);
            startActivityForResult(config,1);
        }
        return super.onOptionsItemSelected(item);
    }

    public void Click_d(View v){
        et=findViewById(R.id.editText2);
        if(et.getText().toString().equals("")){
            Toast.makeText(this, "Pls input the amount of rmb", Toast.LENGTH_SHORT).show();
        }
        else {
            double rmb = Double.parseDouble(et.getText().toString());
            String result = String.format("%.2f", dollar * rmb);
            txv = findViewById(R.id.textView7);
            txv.setText("Dollar:" + result);
        }

    }

    public void Click_e(View v){
        et=findViewById(R.id.editText2);
        if(et.getText().toString().equals("")){
            Toast.makeText(this, "Pls input the amount of rmb", Toast.LENGTH_LONG).show();
        }
        else{
            double rmb= Double.parseDouble(et.getText().toString());
            String result= String.format("%.2f",euro * rmb);
            txv=findViewById(R.id.textView7);
            txv.setText("Euro:"+result);
        }
    }

    public void Click_w(View v){
        et=findViewById(R.id.editText2);
        if(et.getText().toString().equals("")){
            Toast.makeText(this, "Pls input the amount of rmb", Toast.LENGTH_SHORT).show();
        }
        else {
            double rmb = Double.parseDouble(et.getText().toString());
            String result = String.format("%.2f", won * rmb);
            txv = findViewById(R.id.textView7);
            txv.setText("Won:" + result);
        }
    }

    public void Click_c(View v){
        Intent config = new Intent(this,Config.class);
        config.putExtra("dollar",dollar);
        config.putExtra("euro",euro);
        config.putExtra("won",won);
        startActivityForResult(config,1);
    }

    protected void onActivityResult(int requstCode, int resultCode, Intent data){
        if(requstCode==1&&resultCode==2){
            dollar=data.getDoubleExtra("dollar",0.0);
            euro=data.getDoubleExtra("euro",0.0);
            won=data.getDoubleExtra("won",0.0);
        }
        super.onActivityResult(requstCode,resultCode,data);
    }
}
