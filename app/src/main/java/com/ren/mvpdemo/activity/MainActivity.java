package com.ren.mvpdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.ren.mvpdemo.R;
import com.ren.mvpdemo.Unitle.LoadingFrame;
import com.ren.mvpdemo.adapter.MyAdapter;
import com.ren.mvpdemo.bean.Bean;
import com.ren.mvpdemo.bean.newsBean;
import com.ren.mvpdemo.presenter.DemoPresenterImpl;
import com.ren.mvpdemo.view.DemoView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements DemoView {
    private RecyclerView recyclerView;

    private List<Bean.DataBean> list = new ArrayList<>();
    private List<newsBean.ResultBean.DataBean> l=new ArrayList<>();
    private MyAdapter myAdapter;

    private DemoPresenterImpl demoPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        demoPresenter = new DemoPresenterImpl(this);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(this,l);
        recyclerView.setAdapter(myAdapter);
        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoPresenter.getnews("http://v.juhe.cn/","3b507c656ea3555b7e8830ef43e72a11","top");
            }
        });
        myAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, l.get(position).getAuthor_name(), Toast.LENGTH_SHORT).show();
            }
        });
      
        

    }

    @Override
    public void getDataSuccess(Bean bean) {
        list.clear();
        if(null != bean && bean.getCode() == 0){
            list.addAll(bean.getData());
            myAdapter.notifyDataSetChanged();
        }else{
            Toast.makeText(this,bean.getMsg(),Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void getDatanews(newsBean bean) {
        l.clear();
            l.addAll(bean.getResult().getData());
            myAdapter.notifyDataSetChanged();
       
    }

    @Override
    public void getDataFailed() {
        l.clear();
        Toast.makeText(this,"failed",Toast.LENGTH_SHORT).show();
    }
}
