package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_yt)
                        .setTitle("Be Alert!")
                                .setMessage("Follow Social Distancing")
                                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                Toast.makeText(getApplicationContext(), "Hello",Toast.LENGTH_SHORT).show();
                                            }
                                        }).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}