package com.example.impar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView numA;
    private TextView numB;
    private TextView resultado;
    private Button btCalc, btImpar, btPar;
    private Random rnd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalc = findViewById(R.id.btCalc);
        btImpar = findViewById(R.id.btImpar);
        btPar = findViewById(R.id.btPar);
        numA =  findViewById(R.id.numA);
        numB =  findViewById(R.id.numB);
        resultado = findViewById(R.id.resultado);
        rnd = new Random();


        btImpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "ÍMPAR SELECIONADO", Toast.LENGTH_LONG).show();

                btCalc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int numCel = rnd.nextInt(5);
                        numB.setText(String.valueOf(numCel));

                        int calc = Integer.parseInt(numA.getText().toString())+numCel;
                        if(calc %2 ==0){
                            resultado.setText("Celular");
                            Toast.makeText(getApplicationContext(), "PAR", Toast.LENGTH_LONG).show();
                        }
                        else if(Integer.parseInt(numA.getText().toString())>5){
                            Toast.makeText(getApplicationContext(), "NÃO PODE SER MAIOR QUE 5", Toast.LENGTH_LONG).show();
                        }
                        else{
                            resultado.setText("Jogador");
                            Toast.makeText(getApplicationContext(), "ÍMPAR", Toast.LENGTH_LONG).show();
                        }
                    }
                });

            }
        });


        btPar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "PAR SELECIONADO", Toast.LENGTH_LONG).show();

                btCalc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int numCel = rnd.nextInt(5);
                        numB.setText(String.valueOf(numCel));

                        int calc = Integer.parseInt(numA.getText().toString())+numCel;
                        if(calc %2 ==0){
                            resultado.setText("Jogador");
                            Toast.makeText(getApplicationContext(), "PAR", Toast.LENGTH_LONG).show();
                        }
                        else if(Integer.parseInt(numA.getText().toString())>5) {
                            Toast.makeText(getApplicationContext(), "NÃO PODE SER MAIOR QUE 5", Toast.LENGTH_LONG).show();
                        }
                        else{
                            resultado.setText("Celular");
                            Toast.makeText(getApplicationContext(), "ÍMPAR", Toast.LENGTH_LONG).show();
                        }
                    }
                });

            }
        });

      /*  btCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numCel = rnd.nextInt(5);
                numB.setText(String.valueOf(numCel));
                //Integer.parseInt(numA.getText().toString())+/Integer.parseInt(numB.getText().toString());
                int calc = Integer.parseInt(numA.getText().toString())+numCel;
                if(calc %2 ==0){
                    resultado.setText("Jogador");
                    Toast.makeText(getApplicationContext(), "PAR", Toast.LENGTH_LONG).show();
                }else{
                    resultado.setText("Celular");
                    Toast.makeText(getApplicationContext(), "ÍMPAR", Toast.LENGTH_LONG).show();
                }
            }
        });
       */

    }
}