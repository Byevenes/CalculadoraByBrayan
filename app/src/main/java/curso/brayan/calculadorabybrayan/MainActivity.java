package curso.brayan.calculadorabybrayan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int sumar;
    private int restar;
    private int multiplicar;
    private int dividir;
    private int operacion = 0;
    private String concatenar = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        sumar = 0;
        restar = 0;
        multiplicar = 0;
        dividir = 0;


        // Instanciar_todo_los_Button

        final Button butonSiete = (Button) findViewById(R.id.butonSiete);
        final Button butonOcho = (Button) findViewById(R.id.butonOcho);
        final Button butonNueve = (Button) findViewById(R.id.butonNueve);
        final Button butonLimpiarparte = (Button) findViewById(R.id.butonLimpiarparte);
        final Button butonLimpiartodo = (Button) findViewById(R.id.butonLimpiartodo);

        final Button butonCuatro = (Button) findViewById(R.id.butonCuatro);
        final Button butonCinco = (Button) findViewById(R.id.butonCinco);
        final Button butonSeis = (Button) findViewById(R.id.butonSeis);
        final Button butonMultiplicar = (Button) findViewById(R.id.butonMultiplicar);
        final Button butonDividir = (Button) findViewById(R.id.butonDividir);

        final Button butonUno = (Button) findViewById(R.id.butonUno);
        final Button butonDos = (Button) findViewById(R.id.butonDos);
        final Button butonTres = (Button) findViewById(R.id.butonTres);
        final Button butonSumar = (Button) findViewById(R.id.butonSumar);
        final Button butonRestar = (Button) findViewById(R.id.butonRestar);

        final Button butonCero = (Button) findViewById(R.id.butonCero);
        final Button butonPunto = (Button) findViewById(R.id.butonPunto);
        final Button butonPotencia = (Button) findViewById(R.id.butonPotencia);
        final Button butonValoranterior = (Button) findViewById(R.id.butonValoranterior);
        final Button butonIgual = (Button) findViewById(R.id.butonIgual);

        final TextView resultadofinal = (TextView) findViewById(R.id.resultadofinal);

        butonSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar += "7";
                resultadofinal.setText(concatenar);
            }
        });

        butonOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar += "8";
                resultadofinal.setText(concatenar);
            }
        });

        butonNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar += "9";
                resultadofinal.setText(concatenar);
            }
        });

        butonLimpiarparte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar = "0";
                resultadofinal.setText(concatenar);
            }
        });

        butonLimpiartodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar = "";
                resultadofinal.setText(concatenar);
            }
        });

        butonCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar += "4";
                resultadofinal.setText(concatenar);
            }
        });

        butonCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar += "5";
                resultadofinal.setText(concatenar);
            }
        });

        butonSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar += "6";
                resultadofinal.setText(concatenar);
            }
        });

        butonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = resultadofinal.getText().toString();
                concatenar = "";
                multiplicar = Integer.parseInt(res) * multiplicar;
                operacion = 3;
            }
        });

        butonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = resultadofinal.getText().toString();
                concatenar = "";
                dividir = Integer.parseInt(res) / dividir;
                operacion = 4;
            }
        });

        butonUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar += "1";
                resultadofinal.setText(concatenar);
            }
        });

        butonDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar += "2";
                resultadofinal.setText(concatenar);
            }
        });

        butonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar += "3";
                resultadofinal.setText(concatenar);
            }
        });

        butonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = resultadofinal.getText().toString();
                concatenar = "";
                sumar = Integer.parseInt(res) + sumar;
                operacion = 1;
            }
        });

        butonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = resultadofinal.getText().toString();
                concatenar = "";
                restar = Integer.parseInt(res) - restar;
                operacion = 2;
            }
        });

        butonCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar += "0";
                resultadofinal.setText(concatenar);
            }
        });

        butonPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar += ".";
                resultadofinal.setText(concatenar);
            }
        });

        butonPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar += "x10^x";
                resultadofinal.setText(concatenar);
            }
        });

        butonValoranterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar += "Ans";
                resultadofinal.setText(concatenar);
            }
        });

        butonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = resultadofinal.getText().toString();
                String res = "";

                switch (operacion){
                    case 1:
                        res = Integer.toString((sumar + Integer.parseInt(result)));
                        sumar = 0;
                        break;
                    case 2:
                        res = Integer.toString((restar - Integer.parseInt(result)));
                        restar = 0;
                        break;
                    case 3:
                        res = Integer.toString((multiplicar * Integer.parseInt(result)));
                        multiplicar = 0;
                        break;
                    case 4:
                        res = Integer.toString((dividir / Integer.parseInt(result)));
                        dividir = 0;
                        break;
                }
                resultadofinal.setText(res);
            }
        });

    }
}
