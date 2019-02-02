package com.ren.mvpdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ren.mvpdemo.R;
import com.ren.mvpdemo.adapter.HTTP;
import com.ren.mvpdemo.bean.Bean;
import com.ren.mvpdemo.bean.UserBean;
import com.ren.mvpdemo.bean.newsBean;
import com.ren.mvpdemo.model.DemoModelImpl;
import com.ren.mvpdemo.presenter.DemoPresenter;
import com.ren.mvpdemo.presenter.DemoPresenterImpl;
import com.ren.mvpdemo.view.DemoView;

public class Login extends AppCompatActivity implements DemoView {
    EditText username;
    EditText password;
    Button button;
    DemoPresenter presenter;
    String s;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        presenter=new DemoPresenterImpl(this);
        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        button=(Button)findViewById(R.id.btn);
        t=(TextView)findViewById(R.id.t);
    }
    public void  bts(View v){  //登陆
        String user=username.getText().toString();
        String pass=password.getText().toString();
        Toast.makeText(this,"你好",Toast.LENGTH_SHORT).show();
  presenter.getlogin(HTTP.ADDRESS,user,pass);

    }

    @Override
    public void getDataSuccess(Bean bean) {

    }

    @Override
    public void getDatanews(newsBean bean) {

    }

    @Override
    public void getDataFailed(Throwable e) {
           Log.v("el",e.getMessage());
    }

    @Override
    public void loginBean(UserBean bean) {
            bean=bean;
            Toast.makeText(this,bean.getMessage()+bean.getCode()+bean.getReslut().getPassword()+bean.getReslut().getUsername(),Toast.LENGTH_SHORT).show();
            s=bean.getMessage();
            t.setText(s);
    }
}
