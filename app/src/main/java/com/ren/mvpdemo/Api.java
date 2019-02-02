package com.ren.mvpdemo;


import com.ren.mvpdemo.activity.Login;
import com.ren.mvpdemo.bean.Bean;
import com.ren.mvpdemo.bean.UserBean;
import com.ren.mvpdemo.bean.newsBean;
import com.ren.mvpdemo.bean.sfzBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by asus on 2018/5/16.
 */

public interface Api {

    @GET("userInfo/myAddress.json")
    Observable<Bean> getMyAddress(@Query("userId") String userId );


    
    @GET("login")
    Observable<newsBean> getnews(@Query("username")String username,@Query("password")String password);

    @GET("l")
    Observable<UserBean> getlogin(@Query("username")String username,@Query("password")String password );


}
