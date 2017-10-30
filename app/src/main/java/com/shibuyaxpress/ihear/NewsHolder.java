package com.shibuyaxpress.ihear;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by paulf on 16-Oct-17.
 */

public class NewsHolder extends RecyclerView.ViewHolder {
    public ImageView imagenNoticias;
    public View root;
    public NewsHolder(View itemView) {
        super(itemView);

        imagenNoticias=itemView.findViewById(R.id.imgNews);
        root=itemView;
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
