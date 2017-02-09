package com.example.assessment_prep_feb7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Millochka on 2/7/17.
 */
public class NextScreen extends AppCompatActivity{
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_screen);
         recyclerView=(RecyclerView)findViewById(R.id.drawe_rec_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new DrawerAdapter());



    }

    @Override
    protected void onResume() {
        super.onResume();
//        mLeft=(TextView) findViewById(R.id.left_rec);
//        mRight=(TextView) findViewById(R.id.right_rec);
//        final LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) mLeft.getLayoutParams();
//
//        // Set width in LayoutParams in pixels
//        lp.width = 10;
//
//        // Apply the updated layout parameters to TextView
//        mLeft.setLayoutParams(lp);
//        mRight.setLayoutParams(lp);


    }
}
