package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("xTon8ikd6G2nxO6lcZQNoUdmZUCNts6RrpBm8sWJ")
                .clientKey("Mj9qMqoMrUA4eEgH1gYP5Hn2huRkkVraFJJCFjHr")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
