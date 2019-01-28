package com.ren.mvpdemo.model;

import com.ren.mvpdemo.bean.Bean;

import rx.Observable;


/**
 * Created by asus on 2018/5/16.
 */

public interface DemoModel {
    Observable<Bean> getMyAddress(String baseUrl, String userId);
}
