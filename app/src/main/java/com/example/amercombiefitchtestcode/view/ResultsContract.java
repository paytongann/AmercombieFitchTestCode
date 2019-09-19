package com.example.amercombiefitchtestcode.view;

import com.example.amercombiefitchtestcode.model.PageDataPojo;

import java.util.ArrayList;

public interface ResultsContract {

    void onBindPresenter();
    void initUI();
    void onDataPopulated(ArrayList<PageDataPojo> data);
    void onErrorDataCharacter(String errorMessage);

}
