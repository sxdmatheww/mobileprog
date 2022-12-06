package com.example.vaga;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }

    public void openSiz(View v) {
        Intent intent = new Intent(this, siz.class);
        startActivity(intent);
    }

    public void openTools(View v) {
        Intent intent = new Intent(this, tools.class);
        startActivity(intent);
    }

    public void goFlow(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/sxdmatheww/Roboflow/blob/main/README.md"));
        startActivity(browserIntent);
    }










    public void goFlow2(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://demo.roboflow.com/respirators/1?publishable_key=rf_139T3mROOCVywhc2YIo6ZDT4Cgw2"));
        startActivity(browserIntent);
    }

}