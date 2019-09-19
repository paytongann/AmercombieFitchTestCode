package com.example.amercombiefitchtestcode.presenter;

import com.example.amercombiefitchtestcode.model.PageDataPojo;
import com.example.amercombiefitchtestcode.view.ResultsContract;

import java.util.ArrayList;

public interface PresenterContract {

    void onBindView(ResultsContract view);
    void unBindView();
    void initNetworkCall();
    void onSuccessDataCharacter(ArrayList<PageDataPojo> data);
    void onErrorDataCharacter(String errorMessage);

}
