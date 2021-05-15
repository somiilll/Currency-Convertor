package com.example.currencyconvertor;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void covertFun (View view){
        EditText currency = (EditText) findViewById(R.id.currency);
        Double currencyDouble = Double.parseDouble(currency.getText().toString());  //to covert string to decimals
        Double Amount = currencyDouble * 0.01;

        Toast.makeText(MainActivity.this, "€ " + Amount.toString(), Toast.LENGTH_SHORT).show();
        //Log.i("info",currency.getText().toString());
    }

    public void convertD(View view){
        EditText currency = (EditText) findViewById(R.id.currency);
        Double currencyD = Double.parseDouble(currency.getText().toString());
        Double Amount$ = currencyD * 0.75;
        Toast.makeText(MainActivity.this, "$ " + Amount$.toString(), Toast.LENGTH_SHORT).show();

    }


    @Override    //we know on create exist not duplicating it again, adding other codes
    protected void onCreate(Bundle savedInstanceState) {    //it is run whenever the app is run
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
