package com.tplink.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button testButton1;
    private Button testButton2;
    private Button testButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        testButton1 = (Button) findViewById(R.id.test1);
        testButton1.setOnClickListener(this);
        testButton2 = (Button) findViewById(R.id.test2);
        testButton2.setOnClickListener(this);
        testButton3 = (Button) findViewById(R.id.test3);
        testButton3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.test1:
                Toast.makeText(this, "Test1", Toast.LENGTH_LONG).show();

                break;
            case R.id.test2:
                Toast.makeText(this, "Test2", Toast.LENGTH_LONG).show();

                break;
            case R.id.test3:
                Toast.makeText(this, "Test3", Toast.LENGTH_LONG).show();

                break;


        }
    }


}
