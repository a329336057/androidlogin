package com.ren.mvpdemo;


import com.ren.mvpdemo.bean.Bean;
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

    @GET("idcard/index")
    Observable<sfzBean> getsfz(@Query("userId") String userId,@Query("key")String key);
    
    @GET("toutiao/index")
    Observable<newsBean> getnews(@Query("type") String type,@Query("key")String key );
}
