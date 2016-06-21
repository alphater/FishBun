package com.sangcomz.albumsample;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * Created by sangc on 2015-11-06.
 */
public class MainController {
    Context context;
    ImageView imgMain;

    MainController(Context context, ImageView imgMain) {
        this.context = context;
        this.imgMain = imgMain;
    }

    public void setImgMain(String path) {
        Picasso.with(context).load(path).fit().centerCrop().into(imgMain);
    }
}
