package com.takecare.thomas.takecare;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static String ACTIVITYNAME = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view)
    {
        Log.d(ACTIVITYNAME, "Login");

        startActivity(new Intent(this, HomeActivity.class));
    }

    public void Register(View view)
    {
        Log.d(ACTIVITYNAME, "Register");

    }
}
