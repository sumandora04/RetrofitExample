package com.jackfruitsoftware.retrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        GetDataServices services = RetrofitClientInstance.getRetrofitInstance().create(GetDataServices.class);

        Call<List<RetrofitMarvelHeroesModelClass>> call = services.getAllHeroes();
        call.enqueue(new Callback<List<RetrofitMarvelHeroesModelClass>>() {
            @Override
            public void onResponse(Call<List<RetrofitMarvelHeroesModelClass>> call, Response<List<RetrofitMarvelHeroesModelClass>> response) {
                RecyclerAdapter radp = new RecyclerAdapter(response.body(),MainActivity.this);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(radp);
            }

            @Override
            public void onFailure(Call<List<RetrofitMarvelHeroesModelClass>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Error...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
