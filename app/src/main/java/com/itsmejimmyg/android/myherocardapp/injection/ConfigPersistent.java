package com.itsmejimmyg.android.myherocardapp.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

import com.itsmejimmyg.android.myherocardapp.injection.component.ConfigPersistentComponent;

/**
 * A scoping annotation to permit dependencies conform to the life of the
 * {@link ConfigPersistentComponent}
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigPersistent {
}
