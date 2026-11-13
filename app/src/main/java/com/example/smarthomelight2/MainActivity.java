package com.example.smarthomelight2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layoutRaiz;
    private TextView tvEstadoLuz;
    private Button btnInterruptor;

    // Estado del interruptor
    private boolean luzEncendida = false;

    // TODO RAMA feature/contador-luces: Declarar variable contador y referencia a tvContador

    // TODO RAMA feature/modo-noche: Declarar referencia a switchModoNoche

    // TODO RAMA feature/boton-panico: Declarar referencia a btnPanico

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutRaiz = findViewById(R.id.layoutRaiz);
        tvEstadoLuz = findViewById(R.id.tvEstadoLuz);
        btnInterruptor = findViewById(R.id.btnInterruptor);

        btnInterruptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Alternamos el estado
                luzEncendida = !luzEncendida;

                if (luzEncendida) {
                    tvEstadoLuz.setText(R.string.estado_luz_encendida);
                    tvEstadoLuz.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.estado_encendido));
                } else {
                    tvEstadoLuz.setText(R.string.estado_luz_apagada);
                    tvEstadoLuz.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.estado_apagado));
                }

                // TODO RAMA feature/contador-luces: Incrementar contador y actualizar interfaz
            }
        });

        // TODO RAMA feature/modo-noche: Configurar listener del switch para cambiar color de fondo

        // TODO RAMA feature/boton-panico: Configurar listener del botón de pánico
    }
}