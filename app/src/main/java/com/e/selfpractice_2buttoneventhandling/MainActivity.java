package com.e.selfpractice_2buttoneventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ButtonHandler bh=new ButtonHandler();
        findViewById(R.id.button1).setOnClickListener(bh);
        findViewById(R.id.button2).setOnClickListener(bh);
        findViewById(R.id.button3).setOnClickListener(bh);
    }
    private class ButtonHandler implements View.OnClickListener{
    @Override
        public void onClick(View view){
            switch (view.getId()){
                case R.id.button1:
                    show("Button ONE!");
                    break;
                case R.id.button2:
                    show("Button TWO!");
                    break;
                 case R.id.button3:
                    show("Button THREE!");
                    break;
                default:
                    show("This should not happened!");
            }
        }
    }
    void show(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        Log.i(getClass().getName(),message);
    }
}
