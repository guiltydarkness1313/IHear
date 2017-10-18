package com.shibuyaxpress.ihear;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by paulf on 16-Oct-17.
 */

public class NoticiasAdapter extends RecyclerView.Adapter<NoticiasHolder> {
    private List<Noticias> listNews;
    private Context context;

    public NoticiasAdapter(List<Noticias> listNews, Context context) {
        this.listNews = listNews;
        this.context = context;
    }

    @Override
    public NoticiasHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_noticias,parent,false);
        NoticiasHolder holder=new NoticiasHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(NoticiasHolder holder, int position) {
        Glide.with(context).load(listNews.get(position).getImagenURL()).into(holder.imagenNoticias);
    }

    @Override
    public int getItemCount() {
        return listNews.size();
    }
}
