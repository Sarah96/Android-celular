package com.sarah.datos;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public int year,month,day;
    public Button mPickDate;
    public DatePicker datePicker;
    public Calendar calendar;
    public TextView dateView;


    //new DatePickerDialog.OnDateSetListener();
    String fecha = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // dateView =findViewById(R.id.)
        dateView = (TextView) findViewById(R.id.textView3);
        calendar = Calendar.getInstance();

        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        //showDate(year, month+1, day);


    }

    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
        Toast.makeText(getApplicationContext(), "ca", Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this, myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            // TODO Auto-generated method stub
            // arg1 = year
            // arg2 = month
            // arg3 = day
            //showDate(arg1, arg2+1, arg3);
            Toast.makeText(getApplicationContext(), arg1 + "/" + arg2 + "/" +arg3 , Toast.LENGTH_SHORT)
                    .show();
            fecha = arg1 + "/" +arg2 +"/ "+ arg3 ;
        }
    };



   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/


    private void showDate(int year, int month, int day) {
        dateView.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }



    public void irSiguiente(View v){
        EditText edtNombreUsuario = (EditText) findViewById(R.id.edtNombreUsuario);
        EditText edtNumero = (EditText) findViewById(R.id.edtNumero);
        EditText edtcorreo = (EditText) findViewById(R.id.edtCorreo);
        EditText edtcoment = (EditText) findViewById(R.id.edtComent);

        String nombre= edtNombreUsuario.getText().toString();
        String numero = edtNumero.getText().toString();
        String correo = edtcorreo.getText().toString();
        String coment = edtcoment.getText().toString();



        Intent i=new Intent(this, MainActivity2.class);
        i.putExtra(getString(R.string.nombre_usuario),nombre);
        i.putExtra(getString(R.string.numero_usuario),numero);
        i.putExtra(getString(R.string.correo_usuario),correo);
        i.putExtra(getString(R.string.coment_usuario),coment);
        i.putExtra(getString(R.string.date_view_set),fecha);
        startActivity(i);

        //mPickDate.setOnClickListener(new View.OnClickListener()
    }







}

