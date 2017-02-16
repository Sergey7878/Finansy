package com.example.sergey.finansy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sergey on 13.02.2017.
 */

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        textView = (TextView)findViewById(R.id.textView);
    }

    public void onClickTest1(View view) {
        Toast toast = Toast.makeText(this,"You on click",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
        textView.setText("Нажата кнопка 1");
    }

    public void onClickTest2(View view) {
        textView.setText("Нажата кнопка 2");
    }
}
