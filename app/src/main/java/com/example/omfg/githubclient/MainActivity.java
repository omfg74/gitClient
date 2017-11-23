package com.example.omfg.githubclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.pag_list);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("Https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create());
    Retrofit retrofit = builder.build();
    GItHubClient client = retrofit.create(GItHubClient.class);
    Call<List<GItHubRepo>> call = client.reposForUser("fs-opensource");

    call.enqueue(new Callback<List<GItHubRepo>>() {
        @Override
        public void onResponse(Call<List<GItHubRepo>> call, Response<List<GItHubRepo>> response) {

        }

        @Override
        public void onFailure(Call<List<GItHubRepo>> call, Throwable t) {

        }
    });

    }
}
