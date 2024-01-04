package com.example.mygittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "dddds043", Toast.LENGTH_SHORT).show();

        Log.e("TAG", "onCreate: ");
        Log.e("TAG", "onCreate: 2");
        Log.e("TAG", "onCreate: 3");
        Log.e("TAG", "onCreate: 4");
        Log.e("TAG", "onCreate: 4 新分支");
        Log.e("TAG", "onCreate: 5 切换到新分支");
    }
}
