package com.example.amercombiefitchtestcode.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.amercombiefitchtestcode.R;
import com.example.amercombiefitchtestcode.model.PageDataPojo;
import com.example.amercombiefitchtestcode.presenter.Presenter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ResultsContract {

    RecyclerView recyclerView;
    CustomAdapter adapter;
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        onBindPresenter();
    }

    @Override
    public void onBindPresenter() {
        presenter = new Presenter();
        presenter.onBindView(this);
        presenter.initNetworkCall();
    }

    @Override
    public void initUI() {
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onDataPopulated(ArrayList<PageDataPojo> data) {
        adapter.setDataSet(data);
    }

    @Override
    public void onErrorDataCharacter(String errorMessage) {
        onErrorDataCharacter(errorMessage);
    }
}
