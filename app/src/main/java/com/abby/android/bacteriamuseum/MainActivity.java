package com.abby.android.bacteriamuseum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void theMuseum(View view) {
       Intent i = new Intent(this, TheMuseumActivity.class);
       startActivity(i);

       //this i we use it like the directions
    }
}
