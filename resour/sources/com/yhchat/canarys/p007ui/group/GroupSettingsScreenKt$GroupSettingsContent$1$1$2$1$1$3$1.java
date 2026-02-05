package com.yhchat.canarys.p007ui.group;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GroupSettingsScreen.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class GroupSettingsScreenKt$GroupSettingsContent$1$1$2$1$1$3$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    GroupSettingsScreenKt$GroupSettingsContent$1$1$2$1$1$3$1(Object obj) {
        super(1, obj, GroupSettingsViewModel.class, "updateEditedPrivate", "updateEditedPrivate(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean p0) {
        ((GroupSettingsViewModel) this.receiver).updateEditedPrivate(p0);
    }
}
