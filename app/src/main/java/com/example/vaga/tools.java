package com.example.vaga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class tools extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
    }
    public void goBack(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openFlow(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://demo.roboflow.com/respirators/1?publishable_key=rf_139T3mROOCVywhc2YIo6ZDT4Cgw2"));
        startActivity(browserIntent);
    }
}






















