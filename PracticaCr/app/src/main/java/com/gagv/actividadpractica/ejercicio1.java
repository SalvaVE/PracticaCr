package com.gagv.actividadpractica;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ejercicio1 extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv, tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        et1= (EditText) findViewById(R.id.edt1);
        et2= (EditText) findViewById(R.id.edt2);
        tv= (TextView) findViewById(R.id.ttv1);
        tv1= (TextView) findViewById(R.id.ttv2);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.Ejercicioonclick){
            finish();
            Intent ejercicioonclick = new Intent(this, MainActivity.class);
            startActivity(ejercicioonclick);
        }else if (id == R.id.Ejercicio1){
            finish();
            Intent ejercicio1 = new Intent(this, ejercicio1.class);
            startActivity(ejercicio1);
        }else if (id == R.id.Ejercicio2){
            finish();
            Intent ejercicio2 = new Intent(this, ejercicio2.class);
            startActivity(ejercicio2);
        }else if (id == R.id.Ejercicio3){
            finish();
            Intent ejercicio3 = new Intent(this, Ejercicio_acerca_de1.class);
            startActivity(ejercicio3);
        }else if (id == R.id.Ejercicio4){
            finish();
            Intent ejercicio3 = new Intent(this, salir.class);
            startActivity(ejercicio3);
        }
        return super.onOptionsItemSelected(item);
    }
    public void calcular (View v){
        String edad1 = et1.getText().toString();
        String edad2 = et2.getText().toString();
        int edadF1 =Integer.parseInt(edad1);
        int edadF2 =Integer.parseInt(edad2);
        int mediaD;
        int mediaDF;
             if(edadF1>edadF2){
                 tv.setText(String.valueOf("La edad mayor es del primer hermano con: "+edad1+" años"));

             }else{
                 tv.setText(String.valueOf("La edad mayor es del segundo hermano con: "+edad2+" años"));
             }
         if (edadF1 > edadF2){
             mediaD = edadF1 - edadF2;
             tv1.setText(String.valueOf("La diferencia de edad es: "+mediaD+" años"));
         }else{
             mediaDF = edadF2 - edadF1;
             tv1.setText(String.valueOf("La diferencia de edad es: "+mediaDF+" años"));
         }
    }
}
