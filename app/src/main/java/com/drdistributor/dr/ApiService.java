package com.drdistributor.dr;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {

    @FormUrlEncoded
    @POST("test")
    Call<ResponseBody> testing(@Field("test") String test);

    @FormUrlEncoded
    @POST("get_login_api")
    Call<ResponseBody> get_login_api(@Field("api_key") String api_key, @Field("user_name") String user_name, @Field("password") String password, @Field("firebase_token") String firebase_token);

    @FormUrlEncoded
    @POST("medicine_search_api")
    Call<ResponseBody> medicine_search_api(
            @Field("api_key") String api_key,
            @Field("keyword") String keyword);

    //Call<ResponseBody> postData(@Body RequestBody requestBody);
}
