package com.jackfruitsoftware.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataServices {

    @GET("marvel/")
    Call<List<RetrofitMarvelHeroesModelClass>>getAllHeroes();
}
