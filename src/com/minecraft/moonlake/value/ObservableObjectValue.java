package com.minecraft.moonlake.value;

/**
 * Created by MoonLake on 2016/9/11.
 */
public interface ObservableObjectValue<T> extends ObservableValue<T> {

    T get();
}
