package com.casasw.appportfolio;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private Integer[] mAppsThumbs = {
            R.drawable.popular_movies, R.drawable.underconstruction,
            R.drawable.underconstruction,R.drawable.underconstruction,
            R.drawable.underconstruction,R.drawable.underconstruction
    };



    ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mAppsThumbs.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (view==null){
            imageView = new ImageView(mContext);
            //imageView.setLayoutParams(new GridView.LayoutParams(1,1));
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //imageView.setPadding(8,8,8,8);

        } else {
            imageView = (ImageView) view;
        }
        imageView.setImageResource(mAppsThumbs[i]);
        return imageView;
    }




}