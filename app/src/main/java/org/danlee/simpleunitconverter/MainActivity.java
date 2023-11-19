package org.danlee.simpleunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textview);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();

                double kilos = Double.parseDouble(inputText);

                double pounds = makeConversion(kilos);

                textView.setText("" + pounds);
            }
        });
    }

    public double makeConversion(double kilos) {
        return kilos * 2.20462;
    }
}