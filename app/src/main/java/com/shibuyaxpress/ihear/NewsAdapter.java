package com.shibuyaxpress.ihear;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.bumptech.glide.Glide;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import me.toptas.rssconverter.RssItem;

/**
 * Created by paulf on 02-Nov-17.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsHolder> {
    private Context context;
    private List<RssItem> lista;
    private WebView articleView;
    SimpleDateFormat format;
    Date date;

    public void setLista(List<RssItem> lista) {
        this.lista = lista;
    }

    public NewsAdapter(Context context) {
        this.context = context;
        lista= new ArrayList<>();

    }

    @Override
    public NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View c= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_news,parent,false);
        NewsHolder holder=new NewsHolder(c);
        return  holder;
    }

    @Override
    public void onBindViewHolder(NewsHolder holder, final int position) {
        //format=new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ROOT);
        format=new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z",Locale.ROOT);
        SimpleDateFormat nx=new SimpleDateFormat("dd MMMM, yyyy HH:mm a");
        date= null;
        try {
            date = format.parse(lista.get(position).getPublishDate());
            String nex=nx.format(date);
            holder.date.setText(nex);

        } catch (ParseException e) {
            e.printStackTrace();
        }


        holder.title.setText(lista.get(position).getTitle());
        //holder.content.setText(lista.get(position).getDescription());
        Glide.with(context).load(lista.get(position).getImage()).into(holder.imgNews);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
