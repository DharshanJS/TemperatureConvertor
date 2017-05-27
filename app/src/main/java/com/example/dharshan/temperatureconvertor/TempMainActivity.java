package com.example.dharshan.temperatureconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.dharshan.temperatureconvertor.R.id.editText1;

public class TempMainActivity extends AppCompatActivity {

    private EditText text;
    TextView valview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_main);
        text=(EditText)findViewById(R.id.editText1);
        valview=(TextView)findViewById(R.id.textView3);
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                RadioButton celsiusButton = (RadioButton) findViewById(R.id.radio0);
                RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radio1);
                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }


                float inputValue = Float.parseFloat(text.getText().toString());

                if (celsiusButton.isChecked()) {
                    valview.setText(String
                            .valueOf(ConvertorUtil.convertFahrenheitToCelsius(inputValue)));
                    celsiusButton.setChecked(false);
                    fahrenheitButton.setChecked(true);
                } else {
                    valview.setText(String
                            .valueOf(ConvertorUtil.convertCelsiusToFahrenheit(inputValue)));
                    fahrenheitButton.setChecked(false);
                    celsiusButton.setChecked(true);
                }

                break;
        }
    }

    }













