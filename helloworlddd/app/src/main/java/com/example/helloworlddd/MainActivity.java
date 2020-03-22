package com.example.helloworlddd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn1 = findViewById(R.id.button);
        final ImageButton imgBtn1 = findViewById(R.id.imageButton);
        Switch switch1 = findViewById(R.id.switch1);
        CheckBox checkBox = findViewById(R.id.checkBox);

        final TextView textView = findViewById(R.id.textView);
        final TextView textView1;

        btn1.setOnClickListener(new View.OnClickListener(){
        @Override
                public void onClick(View v){
                textView.setText("What a wonderful world!");
            }
        });

        imgBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView.setText("The image was clicked!");
            }
        });

        switch1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){



                if(i%2!=0){
                    btn1.setEnabled(false);
                    textView.setText("The button and switch was shut down");
                    Log.v("MainActivity","btn1 shutdown");

                }
                else {
                    btn1.setEnabled(true);
                    textView.setText("The button and switch was restarted");
                    Log.v("MainActivity","btn1 restart");
                }

                i++;
            }
        });

        checkBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                System.out.println("println输入日志信息");
            }

        });


//        Log.d(msg, "The onCreate() event");
    }




    }


