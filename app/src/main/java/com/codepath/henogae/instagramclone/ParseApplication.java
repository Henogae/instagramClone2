package com.codepath.henogae.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LTBKUoVF0gpi383Hnw6dIewNrYBtdkcb4MCLm4vR")
                .clientKey("wen2scoKxosqnCmDl2nitBhGcx2cNRmjFjAABbfR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
