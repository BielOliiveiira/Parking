package br.com.etechoracio.parking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtQtdHoras;
    EditText txtValorHora;
    EditText txtHoraAd;
    TextView lblTotal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtQtdHoras = findViewById(R.id.txtQtdHoras);
        txtValorHora = findViewById(R.id.txtValorHora);
        txtHoraAd = findViewById(R.id.txtHoraAd);
        lblTotal2 = findViewById(R.id.lblTotal2);

    }

    public void OnCalcular (View v){
    double qh = Double.parseDouble((txtQtdHoras.getText().toString()));
    double vh = Double.parseDouble((txtValorHora.getText().toString()));
    double ha = Double.parseDouble((txtHoraAd.getText().toString()));

    double total = vh + ha * (qh - 1);
    lblTotal2.setText(String.valueOf(total));

    }
}
