package ues.occ.edu.sv.almacenamientomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Local extends AppCompatActivity {

    private TextView txtTitulo, path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
        txtTitulo = (TextView) findViewById(R.id.txtTitulo);
        path=(TextView)findViewById(R.id.path);
        Bundle datosPrincipal = this.getIntent().getExtras();
        txtTitulo.setText(datosPrincipal.getString("titulo"));
        path.setText(getFilesDir().getAbsolutePath());
    }
}
