package com.ren.mvpdemo.model;

import com.ren.mvpdemo.bean.Bean;
import com.ren.mvpdemo.bean.UserBean;
import com.ren.mvpdemo.bean.sfzBean;

import rx.Observable;


/**
 * Created by asus on 2018/5/16.
 */

public interface DemoModel {
    Observable<Bean> getMyAddress(String baseUrl, String userId);
    Observable<UserBean> getlogins(String baseUrl, String username, String password);
}
