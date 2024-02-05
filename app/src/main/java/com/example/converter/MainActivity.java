package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void convert(View view) {
        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);
        CheckBox checkBox = findViewById(R.id.checkBox);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        boolean checked = checkBox.isChecked();
        boolean checked2 = checkBox2.isChecked();
        if (editText.getText().toString().isEmpty()) {
            textView.setText("Please enter a value");
        } else {
            double amount = Double.parseDouble(editText.getText().toString());
            if (checked) {
                textView.setText(String.format("%.2f", amount / 3.38) + " EUR");
            } else if (checked2){
                textView.setText(String.format("%.2f", amount * 3.38) + " TND");
            } else {
                textView.setText("Please select a currency");
            }
        }
    }
    public void uncheck1(View view) {
        CheckBox checkBox = findViewById(R.id.checkBox);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        checkBox.setChecked(false);
        checkBox2.setChecked(true);
    }
    public void uncheck2(View view) {
        CheckBox checkBox = findViewById(R.id.checkBox);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        checkBox2.setChecked(false);
        checkBox.setChecked(true);
    }
}