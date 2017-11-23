package com.example.omfg.githubclient;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by omfg on 23.11.17.
 */

public interface  GItHubClient {

    @GET("/users/fs-opensource/repos")
    Call<List<GItHubRepo>> reposForUser(@Path("user") String user);

}
