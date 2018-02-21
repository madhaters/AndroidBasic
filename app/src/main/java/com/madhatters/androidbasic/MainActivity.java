package com.madhatters.androidbasic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvChangeView;
    private float numberOne = 0;
    private float numberTwo = 0;
    private String expression = "";
    private char operation;
    private EditText calculatorPanel;
    private String panelText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculatorPanel = findViewById(R.id.etPanel);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btnOne:
                expression += 1;
                panelText += 1;
                break;
            case R.id.btnTwo:
                expression += 2;
                panelText += 2;
                break;
            case R.id.btnThree:
                expression += 3;
                panelText += 3;
                break;
            case R.id.btnFour:
                expression += 4;
                panelText += 4;
                break;
            case R.id.btnFive:
                expression += 5;
                panelText += 5;
                break;
            case R.id.btnSix:
                expression += 6;
                panelText += 6;
                break;
            case R.id.btnSeven:
                expression += 7;
                panelText += 7;
                break;
            case R.id.btnEight:
                expression += 8;
                panelText += 8;
                break;
            case R.id.btnNine:
                expression += 9;
                panelText += 9;
                break;
            case R.id.btnZero:
                expression += 0;
                panelText += 0;
                break;
            case R.id.btnPoint:
                expression += ".";
                panelText += ".";
                break;
            case R.id.btnPlus:
                try {
                    numberOne = Float.parseFloat(expression);
                    expression = "";
                    operation = '+';
                    panelText += "+";
                } catch (NumberFormatException ex) {
                    Toast.makeText(this, "Invalid number.", Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.btnEqual:
                try {

                    numberTwo = Float.parseFloat(expression);
                    float result = calculate(numberOne, numberTwo, operation);
                    expression = String.valueOf(result);
                    panelText = expression;
                } catch (NumberFormatException ex) {
                    Toast.makeText(this, "Invalid number.", Toast.LENGTH_LONG).show();
                }

                break;

        }
        calculatorPanel.setText(panelText);
    }

    private float calculate(float numberOne, float numberTwo, char operation) {
        switch (operation) {
            case '+':
                return numberOne + numberTwo;
        }
        return 0;
    }
}
