package com.outerspace.porkstew.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.databinding.library.baseAdapters.BR;
import com.outerspace.porkstew.R;
import com.outerspace.porkstew.databinding.ListItemBinding;
import com.outerspace.porkstew.model.Person;
import com.outerspace.porkstew.viewmodel.ListItemViewModel;

import java.util.ArrayList;

public class GenericAdapter extends RecyclerView.Adapter<GenericAdapter.GenericViewHolder>{
    private ListItemViewModel viewModel;
    private ArrayList<IGenericDataItem> dataItems;
    private int layoutId;

    public GenericAdapter(ListItemViewModel viewModel, ArrayList<IGenericDataItem> dataItems, int layoutId) {
        this.viewModel = viewModel;
        this.dataItems = dataItems;
        this.layoutId  = layoutId;
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
        Person person = (Person) dataItems.get(position);
        holder.binding.setVariable(BR.list_item_view_model, viewModel);
        // holder.txtFullname.setText(person.fullName());
    }

    @Override
    public int getItemCount() {
        return dataItems.size();
    }

    public class GenericViewHolder extends RecyclerView.ViewHolder {
        public ListItemBinding binding;
        //public TextView txtFullname;
        public GenericViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
            //txtFullname = (TextView)  itemView.findViewById(R.id.text_fullname);
        }
    }

}
