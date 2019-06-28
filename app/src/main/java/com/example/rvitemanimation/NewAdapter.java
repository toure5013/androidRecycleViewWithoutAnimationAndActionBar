package com.example.rvitemanimation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.NewsViewHolder> {

    Context mContext;
    List<NewsItem> mdata;

    public NewAdapter(Context mContext, List<NewsItem> mdata) {
        this.mContext = mContext;
        this.mdata = mdata;
    }

    //Methode thats use to make Recycle
    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {


        View layout;
        layout = LayoutInflater.from(mContext).inflate(R.layout.item_news, viewGroup, false);

        return new NewsViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int position) {

        //bind data here : ici nous definissons les differents données qui doivent être afficher sur notre vue
        newsViewHolder.tvTitle.setText(mdata.get(position).getTitle()); //On appel la méthode getTitle pour obtenir le titre
        newsViewHolder.tvDescription.setText(mdata.get(position).getContent());
        newsViewHolder.tvDate.setText(mdata.get(position).getDate());
        newsViewHolder.imgUser.setImageResource(mdata.get(position).getUserPhoto());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }






    public class NewsViewHolder extends RecyclerView.ViewHolder{

        private TextView tvTitle;
        private TextView tvDescription;
        private TextView tvDate;
        private ImageView imgUser;


        public NewsViewHolder(@NonNull View itemView){
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvDescription = (TextView) itemView.findViewById(R.id.tv_description);
            tvDate = (TextView) itemView.findViewById(R.id.tv_date);
            imgUser = (ImageView) itemView.findViewById(R.id.img_user);
        }
    }
}
