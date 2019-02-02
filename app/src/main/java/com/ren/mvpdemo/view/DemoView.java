package com.ren.mvpdemo.view;


import com.ren.mvpdemo.bean.Bean;
import com.ren.mvpdemo.bean.UserBean;
import com.ren.mvpdemo.bean.newsBean;
import com.ren.mvpdemo.bean.sfzBean;

/**
 * Created by asus on 2018/5/16.
 */

public interface DemoView {
    void getDataSuccess(Bean bean);
    void getDatanews(newsBean bean);
    void getDataFailed(Throwable d);
    void loginBean(UserBean userBean);

}
