package com.br.cursotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrir(View view){

         /*
        TextView textView = new TextView(getApplicationContext());
        textView.setText("Olá Toast");
        textView.setBackgroundResource(R.color.verde);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(textView);
        toast.show();
          */

        ImageView image = new ImageView(getApplicationContext());
        image.setImageResource(R.drawable.joia);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(image);
        toast.show();


        /*
        Toast.makeText(getApplicationContext(),
                "Acão realizada com Sucesso",
                Toast.LENGTH_SHORT)
                .show();

         */
    }

    public void abrirToast(View view){

        Toast.makeText(getApplicationContext(),
                "Seja bem-vindo!",
                Toast.LENGTH_SHORT).show();
    }
}