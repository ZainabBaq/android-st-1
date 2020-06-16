package com.example.bmical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


import android.widget.EditText;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText height ;
    EditText weight ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.height1);
        weight = findViewById(R.id.weight);



    }

    public void cal(View v ){

        TextView r = findViewById(R.id.result);

        String h1 = height.getText().toString(); // taking the text from the view and asving it to h1
        float hf = Float.parseFloat(h1);

        String w1 = weight.getText().toString();
        float wf = Float.parseFloat(w1);

        float bmi = wf / (hf * hf);


        String bmiLabel = "";


        if (Float.compare(bmi, 16f) > 0  &&  Float.compare(bmi, 18.5f) <= 0) {
            bmiLabel = "Under weight ";
        } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
            bmiLabel = "Normal";
        } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
            bmiLabel = "Overweight";
        }

        r.setText(bmi + bmiLabel);

    }


}
