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
    EditText customTip;
    Button customTipBtn;
    TextView billTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button10percent = (Button) findViewById(R.id.button10percent);
        button15percent = (Button) findViewById(R.id.button15percent);
        button20percent = (Button) findViewById(R.id.button20percent);
        billInput = (EditText) findViewById(R.id.billAmtInput);
        tipAmtTextDisplay = (TextView)findViewById(R.id.textViewDisplay);
        customTip = (EditText) findViewById(R.id.custom_tip);
        customTipBtn = (Button) findViewById(R.id.custom_tip_btn);
        billTotal = (TextView) findViewById(R.id.bill_total);


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


        customTipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateCustomTip();
            }
        });
    }

    public void calculateTenPercent() {
        double billAmt = Double.parseDouble(billInput.getText().toString());
        double tipAmt = .10 * billAmt;
        tipAmtTextDisplay.setText(String.valueOf(tipAmt));
        updateTotal();
    }


    public void calculateFifteenPercent() {
        double billAmt = Double.parseDouble(billInput.getText().toString());
        double tipAmt = .15 * billAmt;
        tipAmtTextDisplay.setText(String.valueOf(tipAmt));
        updateTotal();
    }


    public void calculateTwentyPercent() {
        double billAmt = Double.parseDouble(billInput.getText().toString());
        double tipAmt = .20 * billAmt;
        tipAmtTextDisplay.setText(String.valueOf(tipAmt));
        updateTotal();
    }

    public void calculateCustomTip() {
        try {
            double customTipAmt = Double.parseDouble(customTip.getText().toString());
            double billAmt = Double.parseDouble(billInput.getText().toString());
            double tipAmt = (customTipAmt / 100) * billAmt;
            tipAmtTextDisplay.setText(String.valueOf(tipAmt));
            updateTotal();
        }catch(NumberFormatException e){
            //TODO: Do Something Here
        }

    }

    public void updateTotal() {
        String theTip = tipAmtTextDisplay.getText().toString();
        double tip = Double.parseDouble(theTip);
        double bill = Double.parseDouble(billInput.getText().toString());
        billTotal.setText(String.valueOf(tip+bill));
    }
}
