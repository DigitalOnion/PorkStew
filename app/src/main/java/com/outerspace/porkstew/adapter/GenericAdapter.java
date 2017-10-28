package com.outerspace.porkstew.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class GenericAdapter extends RecyclerView.Adapter<GenericAdapter.GenericViewHolder>{

    @Override
    public GenericViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(GenericViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class GenericViewHolder extends RecyclerView.ViewHolder {
        public GenericViewHolder(View itemView) {
            super(itemView);
        }
    }

}
