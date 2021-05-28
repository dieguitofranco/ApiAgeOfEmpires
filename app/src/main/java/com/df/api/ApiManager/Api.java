package com.df.api.ApiManager;

import com.df.api.models.Civilization;
import com.df.api.models.Civilizations;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {
    String BASE_URL = "https://age-of-empires-2-api.herokuapp.com/api/v1/";

    @GET("civilizations")
    Call<Civilizations> getCivilizations();

    @GET("civilization/{id}")
    Call<Civilization> getCivilization(@Path("id") String id);

}
