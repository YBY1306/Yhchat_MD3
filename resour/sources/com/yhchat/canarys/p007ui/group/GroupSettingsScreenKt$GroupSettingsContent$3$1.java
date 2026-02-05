package com.yhchat.canarys.p007ui.group;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GroupSettingsScreen.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class GroupSettingsScreenKt$GroupSettingsContent$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    GroupSettingsScreenKt$GroupSettingsContent$3$1(Object obj) {
        super(0, obj, GroupSettingsViewModel.class, "confirmMessageTypeLimit", "confirmMessageTypeLimit()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GroupSettingsViewModel) this.receiver).confirmMessageTypeLimit();
    }
}
