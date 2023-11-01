package com.example.adpole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.adpole.sdk.InterstitialActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (InterstitialActivity.isLoaded())
                            InterstitialActivity.show();
                        else
                            Toast.makeText(MainActivity.this, "Loading ...", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}