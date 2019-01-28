package com.retrofit.administrator.myapplication;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.retrofit.administrator.myapplication.R;

public class MainActivity extends Activity {

    //声明地址  
    private Button btn;
    private ImageView img;
    private String url = "http://imgstore04.cdn.sogou.com/app/a/100520024/877e990117d6a7ebc68f46c5e76fc47a";

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        img = (ImageView) findViewById(R.id.img);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                img.setImageBitmap(getURLimage(url));
            }
        });
    }

    //加载图片  
    public Bitmap getURLimage(String url) {
        Bitmap bmp = null;
        try {
            URL myurl = new URL(url);
            // 获得连接  
            HttpURLConnection conn = (HttpURLConnection) myurl.openConnection();
            conn.setConnectTimeout(6000);//设置超时  
            conn.setDoInput(true);
            conn.setUseCaches(false);//不缓存  
            conn.connect();
            InputStream is = conn.getInputStream();//获得图片的数据流  
            bmp = BitmapFactory.decodeStream(is);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bmp;
    }
}