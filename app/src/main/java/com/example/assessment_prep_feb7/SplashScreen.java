package com.example.assessment_prep_feb7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Millochka on 2/7/17.
 */

public class SplashScreen extends Activity{

        /** Called when the activity is first created. */
        Thread splashTread;
@Override
public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);




    }

    @Override
    protected void onResume(){
        super.onResume();
        splashTread = new Thread() {

            public void run()
            {
                try
                {
                    //Display for 3 seconds
                    sleep(5000);
                }
                catch (InterruptedException e)
                {
                    // TODO: handle exception
                    e.printStackTrace();
                }
                finally
                {

                    Intent openstartingpoint=new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(openstartingpoint);
                }
            }
        };
        splashTread.start();

    }
    }


