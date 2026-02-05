package com.yhchat.canarys.p007ui.settings;

import com.yhchat.canarys.data.repository.UpdateRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes8.dex */
public final class UpdateViewModel_Factory implements Factory<UpdateViewModel> {
    private final Provider<UpdateRepository> updateRepositoryProvider;

    private UpdateViewModel_Factory(Provider<UpdateRepository> updateRepositoryProvider) {
        this.updateRepositoryProvider = updateRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public UpdateViewModel get() {
        return newInstance(this.updateRepositoryProvider.get());
    }

    public static UpdateViewModel_Factory create(Provider<UpdateRepository> updateRepositoryProvider) {
        return new UpdateViewModel_Factory(updateRepositoryProvider);
    }

    public static UpdateViewModel newInstance(UpdateRepository updateRepository) {
        return new UpdateViewModel(updateRepository);
    }
}
