package mx.ipn.bdalexisponce_alejandroramos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    TextView muestraDatos;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        muestraDatos = (TextView)findViewById(R.id.Datos);

        Bundle traer = new Bundle();
        traer = this.getIntent().getExtras();
        nombre = traer.getString("nombre");

        muestraDatos.setText("Nombre: " + nombre);
    }
}
