package com.example.kaio.findpackrecycler.Activitys;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.kaio.findpackrecycler.Adapter.KaioAdapter;
import com.example.kaio.findpackrecycler.Helpers.ModeloBase;
import com.example.kaio.findpackrecycler.R;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    String FindPack[] = {"Novo", "Enviados", "Pendentes", "Entregues"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = (CircleMenu) findViewById(R.id.circlemenu);

        circleMenu.setMainMenu(Color.parseColor("#ffffff"), R.drawable.icon_menu, R.drawable.icon_menu)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.icon_novo)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.icon_enviados)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.icon_pendentes)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.icon_entregues)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {

                    @Override
                    public void onMenuSelected(int i) {

                        //                Toast.makeText(MainActivity.this, "Rastreamento de encomendas : " +FindPack[i], Toast.LENGTH_LONG).show();

                        try {


                            switch (i) {

                                case 0:
                                    new Timer().schedule(new TimerTask() {
                                        @Override
                                        public void run() {

                                            // this code will be executed after 2 seconds
                                            startActivity(new Intent(MainActivity.this, NovaEncomenda.class));

                                        }
                                    }, 1000);

                                    return;

                                case 1:

                                    new Timer().schedule(new TimerTask() {
                                        @Override
                                        public void run() {

                                            // this code will be executed after 2 seconds
                                            startActivity(new Intent(MainActivity.this, EntregasActivity.class));

                                        }
                                    }, 1000);

                                    return;

                                case 2:
                                    new Timer().schedule(new TimerTask() {
                                        @Override
                                        public void run() {

                                            // this code will be executed after 2 seconds
                                            startActivity(new Intent(MainActivity.this, PendentesActivity.class));

                                        }
                                    }, 1000);


                                    return;

                                case 3:
                                    new Timer().schedule(new TimerTask() {
                                        @Override
                                        public void run() {

                                            // this code will be executed after 2 seconds
                                            startActivity(new Intent(MainActivity.this, EntregasActivity.class));

                                        }
                                    }, 1000);


                                    return;

                            }

                        } catch (Exception e) {

                            Log.e("Deu erro", e.getMessage());

                        }

                    }


                });

    }
}