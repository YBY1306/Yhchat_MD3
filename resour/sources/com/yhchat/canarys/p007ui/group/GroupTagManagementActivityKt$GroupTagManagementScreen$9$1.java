package com.yhchat.canarys.p007ui.group;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GroupTagManagementActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class GroupTagManagementActivityKt$GroupTagManagementScreen$9$1 extends FunctionReferenceImpl implements Function0<Unit> {
    GroupTagManagementActivityKt$GroupTagManagementScreen$9$1(Object obj) {
        super(0, obj, GroupTagManagementViewModel.class, "dismissDialog", "dismissDialog()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GroupTagManagementViewModel) this.receiver).dismissDialog();
    }
}
