package com.itsmejimmyg.android.myherocardapp.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import com.itsmejimmyg.android.myherocardapp.data.DataManager;
import com.itsmejimmyg.android.myherocardapp.data.SyncService;
import com.itsmejimmyg.android.myherocardapp.data.local.DatabaseHelper;
import com.itsmejimmyg.android.myherocardapp.data.local.PreferencesHelper;
import com.itsmejimmyg.android.myherocardapp.data.remote.RibotsService;
import com.itsmejimmyg.android.myherocardapp.injection.ApplicationContext;
import com.itsmejimmyg.android.myherocardapp.injection.module.ApplicationModule;
import com.itsmejimmyg.android.myherocardapp.util.RxEventBus;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
