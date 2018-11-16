package com.jackfruitsoftware.retrofitexample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    private static Retrofit retrofitInstance;
    private static final String BASE_URL ="https://simplifiedcoding.net/demos/";

    public static Retrofit getRetrofitInstance() {

        if (retrofitInstance==null){
            retrofitInstance = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofitInstance;
    }
}
