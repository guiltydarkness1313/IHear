package com.shibuyaxpress.ihear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MenuActivity extends AppCompatActivity {
    RecyclerView recycler;
    GridLayoutManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //obtener datos de las noticias
        Noticias e=new Noticias();
        List<Noticias> lista=e.getData();
        manager=new GridLayoutManager(this,2);
        recycler=findViewById(R.id.reciclador);

        recycler.setHasFixedSize(true);
        NoticiasAdapter adapter=new NoticiasAdapter(lista,this);

        recycler.setLayoutManager(manager);
        recycler.setAdapter(adapter);
    }
}
