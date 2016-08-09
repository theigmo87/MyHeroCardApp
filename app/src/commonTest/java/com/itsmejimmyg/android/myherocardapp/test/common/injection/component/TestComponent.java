package com.itsmejimmyg.android.myherocardapp.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import com.itsmejimmyg.android.myherocardapp.injection.component.ApplicationComponent;
import com.itsmejimmyg.android.myherocardapp.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
