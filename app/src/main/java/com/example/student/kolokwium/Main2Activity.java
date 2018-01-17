package com.example.student.kolokwium;

/**
 * Created by student on 2018-01-17.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.recyclerView)
    RecyclerView recView;
    String lekarzeText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setLayoutManager(layoutManager);

        final ArrayList<Lekarze> lekarze = new ArrayList<>();

        lekarze.add(new Lekarze("Jan Kowalski","dermatolog" ));
        lekarze.add(new Lekarze("Krystyna Jakaś","chirurg" ));
        lekarze.add(new Lekarze("Paweł Nowak","onkolog" ));



    }
}