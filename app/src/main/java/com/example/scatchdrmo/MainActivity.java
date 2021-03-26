package com.example.scatchdrmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button CS;
    private Button IT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CS = (Button) findViewById(R.id.CS);
        IT = (Button) findViewById(R.id.IT);

        CS.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               ComputerSciencePage();
           }
        });
        IT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                InformationTechPage();
            }
        });
    }
    public void ComputerSciencePage() {
        Intent intent = new Intent(this, ComputerSciencePage.class);
                startActivity(intent);
    }
    public void InformationTechPage() {
        Intent intent = new Intent(this, InformationTechPage.class);
        startActivity(intent);
    }
}