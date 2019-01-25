package com.example.moez_.maps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class ControlActivity extends AppCompatActivity {

    // On create function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        Spinner spinner = findViewById(R.id.control_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
    }

    // This function starts up thegame
    public void goStart (View view) {
        Intent intent = new Intent(ControlActivity.this, MapsActivity.class);
        Spinner spinner = findViewById(R.id.control_spinner);
        int position =  spinner.getSelectedItemPosition() + 1;
        intent.putExtra("MODE", position);
        startActivity(intent);
    }
}
