package com.sarah.datos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        String nombre= extras.getString(getString(R.string.nombre_usuario));
        String numero= extras.getString(getString(R.string.numero_usuario));
        String correo= extras.getString(getString(R.string.correo_usuario));
        String coment= extras.getString(getString(R.string.coment_usuario));
       String fecha= extras.getString(getString(R.string.date_view_set));


        TextView secondtext = (TextView) findViewById(R.id.Secontext);
        secondtext.append(nombre);
        TextView secondnum = (TextView) findViewById(R.id.secondnumero);
        secondnum.append(numero);

        TextView secondcore = (TextView) findViewById(R.id.secondcorreo);
        secondcore.append(correo);
        TextView secondcoment = (TextView) findViewById(R.id.seconcoment);
        secondcoment.append(coment);


        TextView setView = (TextView) findViewById(R.id.textView2);
        setView.append(fecha);

    }
    //dateView = (TextView) findViewById(R.id.textView3);
   /* private void showDate(int year, int month, int day) {
        dateView.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }*/






}
