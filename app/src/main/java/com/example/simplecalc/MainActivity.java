package com.example.simplecalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText number1, number2;
    Button add, subtract, divide, multiply;
    float result_num;
    Integer num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);

        add = findViewById(R.id.Add);
        subtract = findViewById(R.id.Subtract);
        multiply = findViewById(R.id.Multiply);
        divide = findViewById(R.id.Divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result_num = num1 + num2;
                result.setText(String.valueOf(result_num));
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().length() != 0 && number2.getText().length() != 0) {
                    num1 = Integer.parseInt(number1.getText().toString());
                    num2 = Integer.parseInt(number2.getText().toString());
                    result_num = num1 - num2;
                    result.setText(String.valueOf(result_num));
                } else {
                    result.setText("Invalid input");
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().length() != 0 && number2.getText().length() != 0) {
                    num1 = Integer.parseInt(number1.getText().toString());
                    num2 = Integer.parseInt(number2.getText().toString());
                    result_num = num1 * num2;
                    result.setText(String.valueOf(result_num));
                } else {
                    result.setText("Invalid input");
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().length() != 0 && number2.getText().length() != 0) {
                    num1 = Integer.parseInt(number1.getText().toString());
                    num2 = Integer.parseInt(number2.getText().toString());
                    result_num = num1 / num2;
                    result.setText(String.valueOf(result_num));
                } else {
                    result.setText("Invalid input");
                }
            }
        });
    }
}
