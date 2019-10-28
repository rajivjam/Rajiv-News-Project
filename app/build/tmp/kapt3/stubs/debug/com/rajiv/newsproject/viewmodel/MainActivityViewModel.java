package com.rajiv.newsproject.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006H\u0002R\u001f\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R(\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001a"}, d2 = {"Lcom/rajiv/newsproject/viewmodel/MainActivityViewModel;", "Lcom/rajiv/newsproject/base/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allArticle", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/rajiv/newsproject/model/Article;", "getAllArticle", "()Landroidx/lifecycle/MutableLiveData;", "apiKey", "", "mutableLiveData", "getMutableLiveData$app_debug", "setMutableLiveData$app_debug", "(Landroidx/lifecycle/MutableLiveData;)V", "newsApiKey", "newsServiceApi", "Lcom/rajiv/newsproject/service/NewsServiceApi;", "getNewsServiceApi", "()Lcom/rajiv/newsproject/service/NewsServiceApi;", "setNewsServiceApi", "(Lcom/rajiv/newsproject/service/NewsServiceApi;)V", "getMutableLiveData", "Companion", "app_debug"})
public final class MainActivityViewModel extends com.rajiv.newsproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.rajiv.newsproject.service.NewsServiceApi newsServiceApi;
    private final java.lang.String apiKey = "aba316dfdc8746d58065e6d492d6659f";
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.rajiv.newsproject.model.Article>> mutableLiveData;
    private final java.lang.String newsApiKey = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://newsapi.org/v2/";
    public static final com.rajiv.newsproject.viewmodel.MainActivityViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.rajiv.newsproject.service.NewsServiceApi getNewsServiceApi() {
        return null;
    }
    
    public final void setNewsServiceApi(@org.jetbrains.annotations.NotNull()
    com.rajiv.newsproject.service.NewsServiceApi p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.rajiv.newsproject.model.Article>> getMutableLiveData$app_debug() {
        return null;
    }
    
    public final void setMutableLiveData$app_debug(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.util.List<com.rajiv.newsproject.model.Article>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.rajiv.newsproject.model.Article>> getAllArticle() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.rajiv.newsproject.model.Article>> getMutableLiveData() {
        return null;
    }
    
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/rajiv/newsproject/viewmodel/MainActivityViewModel$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}