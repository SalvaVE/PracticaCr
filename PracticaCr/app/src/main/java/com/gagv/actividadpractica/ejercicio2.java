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

public class ejercicio2 extends AppCompatActivity {
    private EditText et1;
    private TextView  tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        et1=(EditText) findViewById(R.id.editText);
        tv1 = (TextView) findViewById(R.id.tv1);



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
 public void ingresar (View v){
String gigabytes= et1.getText().toString();
double gigas = Double.parseDouble(gigabytes);
double Total;
 gigas = gigas * 1024;
 Total = gigas /1.44;
     tv1.setText(String.valueOf("La copia de seguridad necesita la capacidad de: "+Total+" MB"));


}
}
