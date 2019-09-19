package com.example.amercombiefitchtestcode.presenter;

import android.util.Log;

import com.example.amercombiefitchtestcode.model.ApiInterface;
import com.example.amercombiefitchtestcode.model.PageDataPojo;
import com.example.amercombiefitchtestcode.model.ResultsData;
import com.example.amercombiefitchtestcode.view.ResultsContract;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.ArrayList;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class Presenter implements PresenterContract {

    private ResultsContract view;

    @Override
    public void onBindView(ResultsContract view) {
        this.view = view;
    }

    @Override
    public void unBindView() {
        view = null;
    }

    @Override
    public void initNetworkCall() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.abercrombie.com/anf/nativeapp/qa/codetest/codeTest_exploreData.json/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        apiInterface.getPageData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Response<ResultsData>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<ResultsData> pageDataPojoResponse) {
                        if (pageDataPojoResponse.isSuccessful()){
                            Log.d(TAG, "onNext: " + pageDataPojoResponse.body().RelatedTopics);
                            view.onDataPopulated(pageDataPojoResponse.body().RelatedTopics);
                        } else {
                            Log.d(TAG, "bad code: " + pageDataPojoResponse.body());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        onErrorDataCharacter(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void onSuccessDataCharacter(ArrayList<PageDataPojo> data) {
        view.onDataPopulated(data);
    }

    @Override
    public void onErrorDataCharacter(String errorMessage) {
        view.onErrorDataCharacter(errorMessage);
    }
}
