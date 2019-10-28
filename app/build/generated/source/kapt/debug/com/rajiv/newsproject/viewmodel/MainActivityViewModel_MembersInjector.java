package com.rajiv.newsproject.viewmodel;

import com.rajiv.newsproject.service.NewsServiceApi;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivityViewModel_MembersInjector
    implements MembersInjector<MainActivityViewModel> {
  private final Provider<NewsServiceApi> newsServiceApiProvider;

  public MainActivityViewModel_MembersInjector(Provider<NewsServiceApi> newsServiceApiProvider) {
    this.newsServiceApiProvider = newsServiceApiProvider;
  }

  public static MembersInjector<MainActivityViewModel> create(
      Provider<NewsServiceApi> newsServiceApiProvider) {
    return new MainActivityViewModel_MembersInjector(newsServiceApiProvider);
  }

  @Override
  public void injectMembers(MainActivityViewModel instance) {
    injectNewsServiceApi(instance, newsServiceApiProvider.get());
  }

  public static void injectNewsServiceApi(
      MainActivityViewModel instance, NewsServiceApi newsServiceApi) {
    instance.newsServiceApi = newsServiceApi;
  }
}
