package com.example.young.androidweek3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class KobeBryant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kobe_bryant);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<KobeMoment> KobeMoments = new ArrayList<KobeMoment>();
        //<KobeMoment> sets the type of object in the ArrayList

        KobeMoment Achilles = new KobeMoment("Kobe's legacy", "Kobe managed to sink two free throws in the clutch after tearing his Achilles.", R.drawable.achilles);
        KobeMoments.add(Achilles);

        KobeMoment CelticsFinals = new KobeMoment("'10 Finals","Kobe celebrates the Laker's Game 7 win over the Boston Celtics.",R.drawable.celticsfinals);
        KobeMoments.add(CelticsFinals);

        KobeMoment Oop = new KobeMoment("Kobe-to-Shaq Alley-oop", "Kobe throws the oop to Shaq in the Western Conference Finals.", R.drawable.oop);
        KobeMoments.add(Oop);

        KobeAdapter kobeAdapter = new KobeAdapter(getApplicationContext(), KobeMoments);
        recyclerView.setAdapter(kobeAdapter);
    }
}
