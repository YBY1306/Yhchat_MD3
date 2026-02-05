package com.yhchat.canarys.p007ui.group;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GroupSettingsScreen.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class GroupSettingsScreenKt$GroupSettingsContent$2$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    GroupSettingsScreenKt$GroupSettingsContent$2$1(Object obj) {
        super(1, obj, GroupSettingsViewModel.class, "toggleMessageType", "toggleMessageType(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int p0) {
        ((GroupSettingsViewModel) this.receiver).toggleMessageType(p0);
    }
}
