package com.itsmejimmyg.android.myherocardapp.injection.component;

import dagger.Subcomponent;
import com.itsmejimmyg.android.myherocardapp.injection.PerActivity;
import com.itsmejimmyg.android.myherocardapp.injection.module.ActivityModule;
import com.itsmejimmyg.android.myherocardapp.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
