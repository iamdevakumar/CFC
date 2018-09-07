package com.app.chendhurfinecorpclient.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.chendhurfinecorpclient.Others.Model_Class;
import com.app.chendhurfinecorpclient.R;

import java.util.ArrayList;
import java.util.List;

import static com.app.chendhurfinecorpclient.Activity.Home.menu_tit;

public class RecyclerviewAdapter  extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder> {
    Context context;
    List<Model_Class> iconlist;

    public RecyclerviewAdapter(Context context, List<Model_Class> iconlist) {
        this.context = context;
        this.iconlist = iconlist;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;

        public MyViewHolder(View v){
            super(v);
            imageView = (ImageView) v.findViewById(R.id.menuimage);

        }
    }

    @NonNull
    @Override
    public RecyclerviewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adaptor_recycler_menu, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model_Class model_class=iconlist.get(position);
        holder.imageView.setImageResource(model_class.imageId);
        menu_tit.setText(model_class.txt);
    }

    @Override
    public int getItemCount()
    {
        return iconlist.size();
    }
}
