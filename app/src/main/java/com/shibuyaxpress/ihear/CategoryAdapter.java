package com.shibuyaxpress.ihear;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by paulf on 02-Nov-17.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryHolder>{

    private List<News> categories;
    private Context context;

    public CategoryAdapter(List<News> categories, Context context) {
        this.categories = categories;
        this.context = context;
    }

    @Override
    public CategoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_categories,parent,false);
        return new CategoryHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoryHolder holder, int position) {
        holder.titleCategory.setText(categories.get(position).getCategoria());
        Glide.with(context).load(categories.get(position).getImagenURL()).into(holder.imageCategory);
    }

    @Override
    public int getItemCount() {
        return this.categories.size();
    }

    public News getItem(int position) {
        return this.categories.get(position);
    }
}
