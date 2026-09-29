package com.example.notatkikeep3;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Notatka> notatki;
    private ArrayAdapter<Notatka> adapter;

    private EditText editTextTytul;
    private EditText editTextTresc;
    private Button buttonDodaj;
    private ListView listViewNotatki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTytul = findViewById(R.id.editTextTytul);
        editTextTresc = findViewById(R.id.editTextTresc);
        buttonDodaj = findViewById(R.id.buttonDodaj);
        listViewNotatki = findViewById(R.id.listViewNotatki);

        notatki = new ArrayList<>();

        notatki.add(new Notatka(
                "Slopped Out",
                "Beyond recognition"
        ));

        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                notatki
        );

        listViewNotatki.setAdapter(adapter);

        buttonDodaj.setOnClickListener(v -> {

            String tytul = editTextTytul.getText().toString();
            String tresc = editTextTresc.getText().toString();

            Notatka nowaNotatka = new Notatka(tytul, tresc);

            notatki.add(nowaNotatka);

            adapter.notifyDataSetChanged();

            editTextTytul.setText("");
            editTextTresc.setText("");
        });
    }
}