package com.example.week3tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView name;
    private TextView symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Coin coin = new Coin();

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        coin = Coin.searchCoin(message);

        name = findViewById(R.id.txvName);
        name.setText(coin.getName());

        symbol = findViewById(R.id.txvSymbol);
        symbol.setText(coin.getSymbol());



    }
}
