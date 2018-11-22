package com.llewis.lorilewis.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
    Log.i( "Info", "Button Pressed!" );

    EditText editText = (EditText) findViewById(R.id.editText);

    String amountInPounds = editText.getText().toString();

    double amountInPoundsDouble = Double.parseDouble(amountInPounds);

    double amountInDollarsDouble = amountInPoundsDouble * 1.3;

    String amountInDollarsString = Double.toString(amountInDollarsDouble);

    Log.i( "Amount in dollars", amountInDollarsString);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
