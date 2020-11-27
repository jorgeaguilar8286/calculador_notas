package com.example.miapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mt1;
    private EditText fs1;
    private EditText qm1;
    private TextView nf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mt1 = (EditText)findViewById(R.id.txt_mate);
        fs1 = (EditText)findViewById(R.id.txt_fisi);
        qm1 = (EditText)findViewById(R.id.txt_quimi);
        nf1 = (TextView)findViewById(R.id.textViewNotas);


    }
    public void evalua(View view) {
      String Matematicas_String = mt1.getText().toString();
      String Fisica_String = fs1.getText().toString();
      String Quimica_String = qm1.getText().toString();

      int Matematicas_int = Integer.parseInt(Matematicas_String);
      int Fisica_int = Integer.parseInt(Fisica_String);
      int Quimica_int = Integer.parseInt(Quimica_String);

      int promedio = (Matematicas_int + Fisica_int + Quimica_int) / 3;

      if (promedio >= 6) {
          nf1.setText("Notas Aprobado con" + promedio);
      }else if (promedio <= 5) {
          nf1.setText("Notas Reprobado con" + promedio);
      }





    }



}