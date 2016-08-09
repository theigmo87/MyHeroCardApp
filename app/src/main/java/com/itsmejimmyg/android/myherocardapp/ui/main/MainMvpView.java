package com.itsmejimmyg.android.myherocardapp.ui.main;

import java.util.List;

import com.itsmejimmyg.android.myherocardapp.data.model.Ribot;
import com.itsmejimmyg.android.myherocardapp.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
