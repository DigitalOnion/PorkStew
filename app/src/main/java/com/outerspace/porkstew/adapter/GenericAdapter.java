package com.outerspace.porkstew.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.databinding.library.baseAdapters.BR;
import com.outerspace.porkstew.databinding.ListItemBinding;
import com.outerspace.porkstew.viewmodel.ListItemViewModel;

import java.util.ArrayList;

public class GenericAdapter extends RecyclerView.Adapter<GenericAdapter.GenericViewHolder>{
    private ListItemViewModel viewModelFactory;
    private ArrayList<IGenericDataItem> dataItems;
    private int layoutId;
    private int variableId;

    public GenericAdapter(ListItemViewModel viewModelFactory,
                          ArrayList<IGenericDataItem> dataItems,
                          int layoutId,
                          int variableId) {
        this.viewModelFactory = viewModelFactory;
        this.dataItems        = dataItems;
        this.layoutId         = layoutId;
        this.variableId       = variableId;
    }

    @Override
    public GenericViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(layoutId, parent, false);
        GenericViewHolder holder = new GenericViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(GenericViewHolder holder, int position) {
        ListItemViewModel viewModel = (ListItemViewModel) viewModelFactory.getInstance();
        viewModel.setDataItem(dataItems.get(position));
        holder.binding.setVariable(variableId, viewModel);
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return dataItems.size();
    }

    public class GenericViewHolder extends RecyclerView.ViewHolder {
        public ListItemBinding binding;
        public GenericViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }

}
