package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonclick(View view)
    {
        TextView tv = (TextView) findViewById(R.id.textView);
        EditText et = (EditText) findViewById(R.id.editText);
        String enteredText = String.valueOf(et.getText());
        tv.setText(enteredText);
//        Toast.makeText(this,"")
        et.setText("");

    }
}
