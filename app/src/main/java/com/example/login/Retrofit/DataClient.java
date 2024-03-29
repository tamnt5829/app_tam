package com.example.login.Retrofit;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DataClient {
    @GET("api/get/")
    Call<String> get();
    @GET("android")
    Call<String> getJson();
    @GET("android/array")
    Call<ArrayList<String>> getArray();

    @GET("api/login")
    Call<String> login( @Query("mahv") String mahv, @Query("password") String password);

    @FormUrlEncoded
    @POST("api/login")
    Call<String> signin(@Field("mahv") String mahv, @Field("password") String password);

    @FormUrlEncoded
    @POST("api/reset")
    Call<String> reset(@Field("mahv") String mahv);


}
