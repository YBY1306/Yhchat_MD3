package com.yhchat.canarys.p007ui.sticker;

import com.yhchat.canarys.data.repository.StickerRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes13.dex */
public final class StickerPackDetailViewModel_Factory implements Factory<StickerPackDetailViewModel> {
    private final Provider<StickerRepository> stickerRepositoryProvider;

    private StickerPackDetailViewModel_Factory(Provider<StickerRepository> stickerRepositoryProvider) {
        this.stickerRepositoryProvider = stickerRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public StickerPackDetailViewModel get() {
        return newInstance(this.stickerRepositoryProvider.get());
    }

    public static StickerPackDetailViewModel_Factory create(Provider<StickerRepository> stickerRepositoryProvider) {
        return new StickerPackDetailViewModel_Factory(stickerRepositoryProvider);
    }

    public static StickerPackDetailViewModel newInstance(StickerRepository stickerRepository) {
        return new StickerPackDetailViewModel(stickerRepository);
    }
}
