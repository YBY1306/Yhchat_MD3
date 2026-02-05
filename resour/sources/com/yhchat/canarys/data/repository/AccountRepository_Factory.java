package com.yhchat.canarys.data.repository;

import android.content.Context;
import com.yhchat.canarys.data.local.SavedAccountDao;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class AccountRepository_Factory implements Factory<AccountRepository> {
    private final Provider<Context> contextProvider;
    private final Provider<SavedAccountDao> savedAccountDaoProvider;

    private AccountRepository_Factory(Provider<SavedAccountDao> savedAccountDaoProvider, Provider<Context> contextProvider) {
        this.savedAccountDaoProvider = savedAccountDaoProvider;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AccountRepository get() {
        return newInstance(this.savedAccountDaoProvider.get(), this.contextProvider.get());
    }

    public static AccountRepository_Factory create(Provider<SavedAccountDao> savedAccountDaoProvider, Provider<Context> contextProvider) {
        return new AccountRepository_Factory(savedAccountDaoProvider, contextProvider);
    }

    public static AccountRepository newInstance(SavedAccountDao savedAccountDao, Context context) {
        return new AccountRepository(savedAccountDao, context);
    }
}
