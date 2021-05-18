package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends BaseActivity {


    public static void actionStart(Context context,String data1,String data2){
       Intent intent = new Intent(context,MainActivity2.class);
       intent.putExtra("param1",data1);
       intent.putExtra("param2",data2);
       context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity2","Task id is" + getTaskId());
        setContentView(R.layout.activity_main2);

        Button button2 = (Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });



    }
}