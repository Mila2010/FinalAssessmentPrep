package com.example.assessment_prep_feb7;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by Millochka on 2/8/17.
 */
public class DrawerAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DrawerViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
