package com.shibuyaxpress.ihear;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by paulf on 02-Nov-17.
 */

public class NewsHolder extends RecyclerView.ViewHolder {

    public CardView cardNews;
    public TextView title;
    public TextView content;
    public TextView date;
    public TextView link;
    public TextView description;
    public ImageView imgNews;
    public NewsHolder(View view) {
        super(view);
        date=view.findViewById(R.id.txt_fecha);
        title=view.findViewById(R.id.txt_title);
        //description=view.findViewById(R.id.txt_description);
        imgNews=view.findViewById(R.id.img_news);
        cardNews=view.findViewById(R.id.card_view_news);

    }
}
