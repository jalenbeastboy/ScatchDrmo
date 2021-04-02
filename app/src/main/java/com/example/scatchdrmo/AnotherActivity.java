package com.example.scatchdrmo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {
    TextView title, overview;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        title = findViewById(R.id.titleText);
        overview = findViewById(R.id.overveiwText);
        // set the array so when you click on course it will go to right design
        int i[] = new int[52];
            if (i[position] >= i[position]) {

                Intent intent = getIntent();
                Bundle bundle = this.getIntent().getExtras();
                String aTitle = intent.getStringExtra("title");
                String aOverview = intent.getStringExtra("overview");
                title.setText(aTitle);
                overview.setText(aOverview);
    
                actionBar.setTitle(aTitle);
            }
    }
}