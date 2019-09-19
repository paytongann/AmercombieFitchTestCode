package com.example.amercombiefitchtestcode.model;


import java.util.ArrayList;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("?")
    Observable<Response<ResultsData>> getPageData();

}
