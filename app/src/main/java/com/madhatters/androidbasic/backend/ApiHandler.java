package com.madhatters.androidbasic.backend;

import android.support.annotation.NonNull;

import com.madhatters.androidbasic.domain.BaseResponse;

import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Url;

public class ApiHandler {
    private static ApiHandler instance;
    private EndPoints endPoints;

    private ApiHandler() {
        endPoints = new Retrofit.Builder()
                .baseUrl("http://example.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(EndPoints.class);
    }

    public void getTodayAyah(final MyCallback completion) {
        int ayahNumber = new Random().nextInt(6236) + 1;
        String url = "http://api.alquran.cloud/ayah/" + ayahNumber;
        Call<BaseResponse> call = endPoints.getTodayAyah(url);
        call.enqueue(new Callback<BaseResponse>() {
            @Override
            public void onResponse(@NonNull Call<BaseResponse> call,
                                   @NonNull Response<BaseResponse> response) {
                BaseResponse body = response.body();
                if (body != null) {
                    completion.onSuccess(body);
                }

            }

            @Override
            public void onFailure(@NonNull Call<BaseResponse> call, @NonNull Throwable t) {
                completion.onError(t.getMessage());
                t.printStackTrace();
            }
        });
    }

    public static ApiHandler getInstance() {
        if (instance == null) {
            instance = new ApiHandler();
        }
        return instance;
    }

    public interface EndPoints {
        @GET
        Call<BaseResponse> getTodayAyah(@Url String url);
    }

    public interface MyCallback {
        void onSuccess(BaseResponse baseResponse);

        void onError(String message);
    }
}
