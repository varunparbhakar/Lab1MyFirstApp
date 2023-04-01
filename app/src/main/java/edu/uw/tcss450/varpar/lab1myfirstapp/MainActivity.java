package edu.uw.tcss450.varpar.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

//This is the main activity. It's the entry point for your app. When you build and run your app,
//        the system launches an instance of this Activity and loads its layout.
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("OnStart", "DEBUGGING: Calling from onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "INFORMATION: Calling from onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("onPause", "WARNING: Calling from onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("onStop", "Verbose: Calling from onStop");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy","ERROR: Calling from onDestroy" );

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart","ERROR: Calling from onRestart" );

    }

}