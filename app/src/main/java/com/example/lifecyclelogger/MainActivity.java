package com.example.trial;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifecycleDemo", "onStart called");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifecycleDemo", "onResume called");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifecycleDemo", "onPause called");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifecycleDemo", "onStop called");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifecycleDemo", "onDestroy called");
    }

}
