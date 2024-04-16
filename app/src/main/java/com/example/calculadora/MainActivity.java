package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txtNum1;
    EditText txtNum2;
    Button btnSuma;
    Button btnResta;
    Button btnDivision;
    Button btnMultiplicacion;
    TextView lblRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnDivision = findViewById(R.id.btnDivision);
        lblRespuesta = findViewById(R.id.lblRespuesta);

    }

    public void btnSuma_onClick(View v) {
        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        lblRespuesta.setText(String.valueOf(num1 + num2));
    }

    public void btnResta_onClick(View v) {
        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        lblRespuesta.setText(String.valueOf(num1 - num2));
    }

    public void btnMultiplicacion_onClick(View v) {
        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        lblRespuesta.setText(String.valueOf(num1 * num2));
    }

    public void btnDivision_onClick(View v) {
        double num1 = Double.parseDouble(txtNum1.getText().toString());
        double num2 = Double.parseDouble(txtNum2.getText().toString());
        lblRespuesta.setText(String.valueOf(num1 / num2));
    }

}