package com.shibuyaxpress.ihear;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by paulf on 02-Nov-17.
 */

public class CategoryHolder extends RecyclerView.ViewHolder {

    public TextView titleCategory;
    public ImageView imageCategory;

    public CategoryHolder(View view) {
        super(view);
        titleCategory=view.findViewById(R.id.title_category);
        imageCategory=view.findViewById(R.id.img_category);
    }
}
