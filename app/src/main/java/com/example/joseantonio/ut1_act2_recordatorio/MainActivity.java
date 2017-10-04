package com.example.joseantonio.ut1_act2_recordatorio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    EditText edTxt1, edTxt2;
    Button btn1;
    CheckBox chBox1;
    String nombre, fecha, mensaje;
    int iNom=0, iFec=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTxt1=(EditText)findViewById(R.id.ediTxt1);
        edTxt1.setText("");
        edTxt2=(EditText)findViewById(R.id.ediTxt2);
        edTxt2.setText("");
        btn1=(Button)findViewById(R.id.button1);
        //btn1.setOnClickListener(this);
        chBox1=(CheckBox)findViewById(R.id.checkBox1);
        //chBox1.setOnClickListener(this);
    }

    /** Metodo implenta OnClickListener **/
    @Override
    public void onClick(View v) {

        nombre = edTxt1.getText().toString();
        fecha  = edTxt2.getText().toString();
        mensaje = "Hola "+nombre+" has nacido el "+fecha;

        //iNom = Integer.parseInt(nombre);
       // iFec = Integer.parseInt(fecha);

        if(v.getId()==R.id.button1){
            if (chBox1.isChecked()){
                if ((TextUtils.isEmpty(nombre))&&(TextUtils.isEmpty(fecha))){
                    Toast.makeText(this,"Error campos vacíos",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this,mensaje+" Se ha creado un recordatorio",Toast.LENGTH_SHORT).show();
                }
            }else{
                if (TextUtils.isEmpty(nombre)){
                    Toast.makeText(this,"Error campos vacío",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this,mensaje+" sin recordatorio",Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
