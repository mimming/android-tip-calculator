package com.example.studentcompsci.tipcalculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button button10percent;
    Button button15percent;
    Button button20percent;
    EditText billInput;
    TextView tipAmtTextDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button10percent = (Button) findViewById(R.id.button10percent);
        button15percent = (Button) findViewById(R.id.button15percent);
        button20percent = (Button) findViewById(R.id.button20percent);
        billInput = (EditText) findViewById(R.id.billAmtInput);
        tipAmtTextDisplay = (TextView)findViewById(R.id.textViewDisplay);


        button10percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateTenPercent();
            }
        });


        button15percent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calculateFifteenPercent();
                }


        });


        button20percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateTwentyPercent();
            }


        });

    }

    public void calculateTenPercent() {
        double billAmt = Double.parseDouble(billInput.getText().toString());
        double tipAmt = .10 * billAmt;
        tipAmtTextDisplay.setText(String.valueOf(tipAmt));
    }


    public void calculateFifteenPercent() {
        double billAmt = Double.parseDouble(billInput.getText().toString());
        double tipAmt = .15 * billAmt;
        tipAmtTextDisplay.setText(String.valueOf(tipAmt));
    }


    public void calculateTwentyPercent() {
        double billAmt = Double.parseDouble(billInput.getText().toString());
        double tipAmt = .20 * billAmt;
        tipAmtTextDisplay.setText(String.valueOf(tipAmt));
    }
}
