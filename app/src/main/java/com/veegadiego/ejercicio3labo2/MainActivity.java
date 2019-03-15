package com.veegadiego.ejercicio3labo2;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout Layout1;
    private LinearLayout Layout2;
    private LinearLayout Layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Layout1=findViewById(R.id.layout1);
        Layout2=findViewById(R.id.layout2);
        Layout3=findViewById(R.id.layout3);

        Layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Layout1.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    @Override
                    public void onClick(View v) {
                        int nume= (int) ((Math.random()* 6) +1);

                        switch(nume){
                            case 1:
                                Layout1.setBackgroundResource(R.color.Principal_red);
                                break;
                            case 2:
                                Layout1.setBackgroundResource(R.color.sec_red);
                                break;
                            case 3:
                                Layout1.setBackgroundResource(R.color.tre_red);
                                break;
                            case 4:
                                Layout1.setBackgroundResource(R.color.cua_red);
                                break;
                            case 5:
                                Layout1.setBackgroundResource(R.color.qui_red);
                                break;
                            case 6:
                                Layout1.setBackgroundResource(R.color.sext_red);
                                break;
                        }
                    }
                });
            }
        });

        Layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Layout2.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    @Override
                    public void onClick(View v) {
                        int nume1= (int) ((Math.random()* 6) +1);

                        switch(nume1){
                            case 1:
                                Layout2.setBackgroundResource(R.color.Principal_green);
                                break;
                            case 2:
                                Layout2.setBackgroundResource(R.color.sec_green);
                                break;
                            case 3:
                                Layout2.setBackgroundResource(R.color.tre_green);
                                break;
                            case 4:
                                Layout2.setBackgroundResource(R.color.cua_green);
                                break;
                            case 5:
                                Layout2.setBackgroundResource(R.color.qui_green);
                                break;
                            case 6:
                                Layout2.setBackgroundResource(R.color.sext_green);
                                break;
                        }
                    }
                });
            }
        });


        Layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Layout3.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    @Override
                    public void onClick(View v) {
                        int nume2= (int) ((Math.random()* 6) +1);

                        switch(nume2){
                            case 1:
                                Layout3.setBackgroundResource(R.color.Principal_blue);
                                break;
                            case 2:
                                Layout3.setBackgroundResource(R.color.sec_blue);
                                break;
                            case 3:
                                Layout3.setBackgroundResource(R.color.tre_blue);
                                break;
                            case 4:
                                Layout3.setBackgroundResource(R.color.cua_blue);
                                break;
                            case 5:
                                Layout3.setBackgroundResource(R.color.qui_blue);
                                break;
                            case 6:
                                Layout3.setBackgroundResource(R.color.sext_blue);
                                break;
                        }
                    }
                });
            }
        });
    }
}
