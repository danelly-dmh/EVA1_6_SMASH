package com.example.danelly.eva1_6_smash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {
    Intent second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        second= new Intent(this, secondC.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Button btn =(Button) findViewById(R.id.boton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), secondC.class);
                startActivityForResult(intent,0);
            }
        });
    }

}
