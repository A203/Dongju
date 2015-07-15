package com.example.administrator.bmi1;

import java.text.DecimalFormat;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(calcBMI);
    }

    OnClickListener calcBMI = new OnClickListener(){
        public void onClick(View v) {
            EditText fieldHeight = (EditText) findViewById(R.id.height);
            EditText fieldWeight = (EditText) findViewById(R.id.weight);
            double height = Double.parseDouble(fieldHeight.getText().toString())/100;
            double weight = Double.parseDouble(fieldWeight.getText().toString());
            double BMI = weight/(height*height);
            DecimalFormat nf = new DecimalFormat("0.00");
            TextView show = (TextView) findViewById(R.id.result);
            show.setText("ÄãµÄBMIÖµÊÇ"+nf.format(BMI));
            TextView fieldsuggest=(TextView) findViewById(R.id.suggest);
            if(BMI>25){
                fieldsuggest.setText(R.string.advice_heavy);
            }
            else if(BMI<20){
                fieldsuggest.setText(R.string.advice_light);
            }
            else
                fieldsuggest.setText(R.string.advice_average);
        }
    };
}
