package com.drdistributor.dr;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    public static Retrofit retrofit;

    public static Retrofit getRetrofitInstance(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://www.drdistributor.com/new_api/api_mobile46/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
