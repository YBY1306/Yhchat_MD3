package com.yhchat.canarys.p007ui.group;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GroupSettingsScreen.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class GroupSettingsScreenKt$GroupSettingsContent$1$1$2$1$1$4$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    GroupSettingsScreenKt$GroupSettingsContent$1$1$2$1$1$4$1(Object obj) {
        super(1, obj, GroupSettingsViewModel.class, "updateEditedCategoryName", "updateEditedCategoryName(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((GroupSettingsViewModel) this.receiver).updateEditedCategoryName(p0);
    }
}
