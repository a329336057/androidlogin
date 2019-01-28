package com.ren.mvpdemo.Unitle;

public class newsinters {
    //第一步 定义接口
    public interface Onnewsinters {
        void onClick(int position);
    }

    private Onnewsinters listener;

    //第二步， 写一个公共的方法
    public void setOnItemClickListener(Onnewsinters listener) {
        this.listener = listener;
    }




    public interface OnItemLongClickListener {
        void onClick(int position);
    }

    private OnItemLongClickListener longClickListener;

    public void setOnItemLongClickListener(OnItemLongClickListener longClickListener) {
        this.longClickListener = longClickListener;
    }
}
