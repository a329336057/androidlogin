package com.ren.mvpdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.ren.mvpdemo.R;
import com.ren.mvpdemo.Unitle.LoadingFrame;
import com.ren.mvpdemo.adapter.HTTP;
import com.ren.mvpdemo.adapter.MyAdapter;
import com.ren.mvpdemo.bean.Bean;
import com.ren.mvpdemo.bean.UserBean;
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
    private String s;
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
                demoPresenter.getnews(HTTP.ADDRESS,"apdr","asda");
            }
        });




        myAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, l.get(position).getAuthor_name(), Toast.LENGTH_SHORT).show();
            }
        });

        

    }
  public void login(View v){
      Intent i=new Intent(MainActivity.this,Login.class);
      startActivity(i);
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
    public void getDataFailed(Throwable e) {
        l.clear();
        Toast.makeText(this,"failed",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginBean(UserBean userBean) {

    }




}
