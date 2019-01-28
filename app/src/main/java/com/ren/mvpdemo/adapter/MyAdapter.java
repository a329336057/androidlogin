package com.ren.mvpdemo.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.ren.mvpdemo.R;
import com.ren.mvpdemo.Unitle.image;
import com.ren.mvpdemo.bean.Bean;
import com.ren.mvpdemo.bean.newsBean;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2018/5/16.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> implements View.OnClickListener {
    private Context mContext;
    private OnItemClickListener mOnItemClickListener = null;
    private List<newsBean.ResultBean.DataBean> list = new ArrayList<>();

    public MyAdapter(Context context,List<newsBean.ResultBean.DataBean> list){
        this.mContext = context;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        view.setOnClickListener(this);
        return myViewHolder;
        
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.author_name.setText(list.get(position).getAuthor_name());
        holder.toutiao_title.setText(list.get(position).getTitle());
        holder.date.setText(list.get(position).getDate());
        String g=list.get(position).getThumbnail_pic_s();
        String url = "http://img1.dzwww.com:8080/tupian_pl/20150813/16/7858995348613407436.jpg";
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,position+list.get(position).getAuthor_name(),Toast.LENGTH_SHORT);
            }
        });
        Glide.with(mContext)
                .load(list.get(position).getThumbnail_pic_s())
                .into(holder.imageView);
        holder.itemView.setTag(position);   
    }

    @Override
    public int getItemCount() {
        return null == list ? 0 : list.size() ;
    }
    
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView author_name;
        private TextView toutiao_title;
        private TextView date;
        private ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            toutiao_title = itemView.findViewById(R.id.toutiao_title);
            author_name = itemView.findViewById(R.id.author_name);
            date = itemView.findViewById(R.id.date);
            imageView = itemView.findViewById(R.id.images);
            
        }
    }



    public static interface OnItemClickListener {
        void onItemClick(View view , int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            //注意这里使用getTag方法获取position
            mOnItemClickListener.onItemClick(v,(int)v.getTag());
        }
    }
}
