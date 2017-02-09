package com.example.assessment_prep_feb7;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Millochka on 2/8/17.
 */
public class DrawerViewHolder extends RecyclerView.ViewHolder {
    public DrawerViewHolder(ViewGroup itemView) {
        super( InflateView(itemView));
    }

    public static View InflateView(ViewGroup parent){

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());

        return inflater.inflate(R.layout.rec_view_drawer,parent,false);
    }

    public void onDataSet(){


    }
}
