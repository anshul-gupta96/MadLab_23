package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    SharedPreferences sharedPreferences;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.eng:{
                textView.setText("English");
                Toast.makeText(this,"English",Toast.LENGTH_SHORT).show();
                sharedPreferences.edit().putString("title","English").apply();
                break;
            }
            case R.id.hin:{
                textView.setText("Hindi");
                Toast.makeText(this,"Hindi",Toast.LENGTH_SHORT).show();
                sharedPreferences.edit().putString("title","Hindi").apply();
                break;
            }
            case R.id.dev:{
                textView.setText("Devnagri");
                Toast.makeText(this,"Devnagri",Toast.LENGTH_SHORT).show();
                sharedPreferences.edit().putString("title","Devnagri").apply();
                break;
            }
            case R.id.fre:{
                textView.setText("French");
                Toast.makeText(this,"French",Toast.LENGTH_SHORT).show();
                sharedPreferences.edit().putString("title","French").apply();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        sharedPreferences = this.getSharedPreferences("com.example.menus", 0);
        String pref = sharedPreferences.getString("title", "English");
        textView.setText(pref);
    }
}