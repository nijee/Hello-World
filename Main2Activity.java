package com.example.nijee.hellonijee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(
                        R.color.green));

            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grab the text the user inputted
               String newText = ((EditText)findViewById(R.id.editText)).getText().toString();
if(TextUtils.isEmpty(newText)) {
    ((TextView) findViewById(R.id.textView)).setText("Hello from Nijee");

}else {

    ((TextView) findViewById(R.id.textView)).setText(newText);
    //put the text into our text view once the 'change text' button is clicked
}

            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset the text color back background_dark
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.background_dark));
                //reset background color colorAccent
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(
                        R.color.colorAccent));
                //reset the text back to 'Hello from Nijee'
                ((TextView) findViewById(R.id.textView)).setText("Hello from Nijee");

            }
        });

    }}