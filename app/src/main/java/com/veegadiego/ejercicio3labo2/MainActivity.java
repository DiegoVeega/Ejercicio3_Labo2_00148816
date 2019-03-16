package com.veegadiego.ejercicio3labo2;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Button Boton1;
    private Button Boton2;
    private Button Boton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Boton1=findViewById(R.id.boton1);
        Boton2=findViewById(R.id.boton2);
        Boton3=findViewById(R.id.boton3);

        Boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Boton1.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    @Override
                    public void onClick(View v) {
                        int nume= (int) ((Math.random()* 6) +1);

                        switch(nume){
                            case 1:
                                Boton1.setBackgroundResource(R.color.Principal_red);
                                break;
                            case 2:
                                Boton1.setBackgroundResource(R.color.sec_red);
                                break;
                            case 3:
                                Boton1.setBackgroundResource(R.color.tre_red);
                                break;
                            case 4:
                                Boton1.setBackgroundResource(R.color.cua_red);
                                break;
                            case 5:
                                Boton1.setBackgroundResource(R.color.qui_red);
                                break;
                            case 6:
                                Boton1.setBackgroundResource(R.color.sext_red);
                                break;
                        }
                    }
                });
            }
        });

        Boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Boton2.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    @Override
                    public void onClick(View v) {
                        int nume1= (int) ((Math.random()* 6) +1);

                        switch(nume1){
                            case 1:
                                Boton2.setBackgroundResource(R.color.Principal_green);
                                break;
                            case 2:
                                Boton2.setBackgroundResource(R.color.sec_green);
                                break;
                            case 3:
                                Boton2.setBackgroundResource(R.color.tre_green);
                                break;
                            case 4:
                                Boton2.setBackgroundResource(R.color.cua_green);
                                break;
                            case 5:
                                Boton2.setBackgroundResource(R.color.qui_green);
                                break;
                            case 6:
                                Boton2.setBackgroundResource(R.color.sext_green);
                                break;
                        }
                    }
                });
            }
        });


        Boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Boton3.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    @Override
                    public void onClick(View v) {
                        int nume2= (int) ((Math.random()* 6) +1);

                        switch(nume2){
                            case 1:
                                Boton3.setBackgroundResource(R.color.Principal_blue);
                                break;
                            case 2:
                                Boton3.setBackgroundResource(R.color.sec_blue);
                                break;
                            case 3:
                                Boton3.setBackgroundResource(R.color.tre_blue);
                                break;
                            case 4:
                                Boton3.setBackgroundResource(R.color.cua_blue);
                                break;
                            case 5:
                                Boton3.setBackgroundResource(R.color.qui_blue);
                                break;
                            case 6:
                                Boton3.setBackgroundResource(R.color.sext_blue);
                                break;
                        }
                    }
                });
            }
        });
    }
}
