package com.rajiv.newsproject.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/rajiv/newsproject/di/module/NetComponent;", "", "inject", "", "activity", "Lcom/rajiv/newsproject/view/MainActivity;", "app_debug"})
@dagger.Component(modules = {com.rajiv.newsproject.di.module.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface NetComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.rajiv.newsproject.view.MainActivity activity);
}