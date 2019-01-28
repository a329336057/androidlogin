package com.ren.mvpdemo.presenter;

/**
 * Created by asus on 2018/5/16.
 */

public interface DemoPresenter {
    void getMyAddress(String baseUrl, String userId);
    void getnews(String baseUrl, String key,String type);
}
