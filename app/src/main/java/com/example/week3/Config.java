package com.example.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Config extends AppCompatActivity {
    double dollar;
    double euro;
    double won;
    EditText et_d;
    EditText et_e;
    EditText et_w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        Intent intent = getIntent();
        dollar=intent.getDoubleExtra("dollr",0.0);
        euro=intent.getDoubleExtra("eruo",0.0);
        won=intent.getDoubleExtra("won",0.0);
        et_d=findViewById(R.id.editText3);
        et_e=findViewById(R.id.editText4);
        et_w=findViewById(R.id.editText5);
        et_d.setText(String.valueOf(dollar));
        et_e.setText(String.valueOf(euro));
        et_w.setText(String.valueOf(won));
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.item1){
            Intent save=new Intent();
            et_d=findViewById(R.id.editText3);
            et_e=findViewById(R.id.editText4);
            et_w=findViewById(R.id.editText5);
            save.putExtra("dollar",Double.parseDouble(et_d.getText().toString()));
            save.putExtra("euro",Double.parseDouble(et_e.getText().toString()));
            save.putExtra("won",Double.parseDouble(et_w.getText().toString()));
            setResult(2,save);
            finish();
        }
        else{
            Toast.makeText(this, "You are already on the settings page", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    public void Click_save(View v){
        Intent save=new Intent();
        et_d=findViewById(R.id.editText3);
        et_e=findViewById(R.id.editText4);
        et_w=findViewById(R.id.editText5);
        save.putExtra("dollar",Double.parseDouble(et_d.getText().toString()));
        save.putExtra("euro",Double.parseDouble(et_e.getText().toString()));
        save.putExtra("won",Double.parseDouble(et_w.getText().toString()));
        setResult(2,save);
        finish();
    }

}
