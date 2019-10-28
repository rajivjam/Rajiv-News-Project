package com.rajiv.newsproject.di.module;

import com.rajiv.newsproject.view.MainActivity;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerNetComponent implements NetComponent {
  private DaggerNetComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static NetComponent create() {
    return new Builder().build();
  }

  @Override
  public void inject(MainActivity activity) {}

  public static final class Builder {
    private Builder() {}

    public NetComponent build() {
      return new DaggerNetComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }
  }
}
