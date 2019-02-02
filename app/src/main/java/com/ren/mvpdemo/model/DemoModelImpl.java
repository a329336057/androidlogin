package com.ren.mvpdemo.model;


import com.ren.mvpdemo.RetrofitFactory;
import com.ren.mvpdemo.bean.Bean;
import com.ren.mvpdemo.bean.UserBean;
import com.ren.mvpdemo.bean.newsBean;
import com.ren.mvpdemo.bean.sfzBean;

import rx.Observable;


/**
 * Created by asus on 2018/5/16.
 */

public class DemoModelImpl implements DemoModel {

    private static DemoModelImpl instance;

    public synchronized static DemoModelImpl getInstance() {

        if (null == instance) {
            synchronized (DemoModelImpl.class) {
                instance = new DemoModelImpl();
            }
        }

        return instance;
    }

    @Override
    public Observable<Bean> getMyAddress(String baseUrl, String userId) {
        return RetrofitFactory.getInstance().getCustomHaierAPi(baseUrl).getMyAddress(userId);
    }

    @Override
    public Observable<UserBean> getlogins(String baseUrl, String username, String password) {
        return RetrofitFactory.getInstance().getCustomHaierAPi(baseUrl).getlogin(username,password);
    }


    public Observable<newsBean> getnews(String baseUrl, String key,String type) {
        return RetrofitFactory.getInstance().getCustomHaierAPi(baseUrl).getnews(type,key);
    }
}
