package com.example.alc_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private Button website;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        website = (Button)findViewById(R.id.about);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://andela.com/alc/"));
                startActivity(i2);
            }
        });
    }

    public void profile(View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
}
