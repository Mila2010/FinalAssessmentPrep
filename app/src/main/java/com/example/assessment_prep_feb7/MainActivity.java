package com.example.assessment_prep_feb7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements ViewGroup.OnClickListener{

    Button mLogIn;
    Button mLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLogIn=(Button) findViewById(R.id.login);
        mLogOut=(Button) findViewById(R.id.logout);
        mLogIn.setOnClickListener(this);
        mLogOut.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login:

                Intent forward = new Intent(getApplicationContext(), NextScreen.class);
                startActivity(forward);

                break;
            case R.id.logout:
                finish();
                break;
        }

    }
}
