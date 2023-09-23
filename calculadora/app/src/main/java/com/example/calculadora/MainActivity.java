package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;

    private TextView text_respuesta;
    private EditText edit_numerouno;
    private EditText edit_numerodos;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        text_respuesta=findViewById(R.id.respuesta);
        edit_numerouno=findViewById(R.id.numerouno);
        edit_numerodos=findViewById(R.id.numerodos);



        btn_suma=findViewById(R.id.sumabutton);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             text_respuesta.setText(  suma(Integer.parseInt(edit_numerouno.getText().toString()),Integer.parseInt(edit_numerodos.getText().toString()) )+"");
            }
        });
        btn_resta=findViewById(R.id.restabutton);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(  resta(Integer.parseInt(edit_numerouno.getText().toString()),Integer.parseInt(edit_numerodos.getText().toString()) )+"");
            }
        });
        btn_multiplicacion=findViewById(R.id.multiplicacionbutton);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(  multiplicacion(Integer.parseInt(edit_numerouno.getText().toString()),Integer.parseInt(edit_numerodos.getText().toString()) )+"");
            }
        });
        btn_division=findViewById(R.id.divisionbutton);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(  division(Integer.parseInt(edit_numerouno.getText().toString()),Integer.parseInt(edit_numerodos.getText().toString()) )+"");
            }
        });




    }
    public int suma (int a, int b){
    return a+b;}

    public int resta (int a, int b){
        return a-b;}


    public int multiplicacion (int a, int b){
        return a*b;}


    public int division (int a, int b){
        return a/b;}
}