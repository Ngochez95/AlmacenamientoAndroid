package ues.occ.edu.sv.almacenamientomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Externo extends AppCompatActivity {
    private TextView txtTitulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externo);
        txtTitulo=(TextView)findViewById(R.id.txtTitulo);
        Bundle datosPrincipal = this.getIntent().getExtras();
        txtTitulo.setText(datosPrincipal.getString("titulo"));
    }
}
