package com.yhchat.canarys.p007ui.discover;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.RecommendGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DiscoverGroupsActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$DiscoverGroupsScreen$searchGroups$1", m185f = "DiscoverGroupsActivity.kt", m186i = {0, 0, 1, 1, 1, 1, 1}, m187l = {112, 116}, m188m = "invokeSuspend", m189n = {"$this$launch", "apiService", "$this$launch", "apiService", "token", "$this$invokeSuspend_u24lambda_u240\\1", "$i$a$-runCatching-DiscoverGroupsActivityKt$DiscoverGroupsScreen$searchGroups$1$1\\1\\115\\0"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
/* loaded from: classes6.dex */
final class DiscoverGroupsActivityKt$DiscoverGroupsScreen$searchGroups$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Boolean> $isSearchLoading$delegate;
    final /* synthetic */ String $keyword;
    final /* synthetic */ MutableState<String> $searchError$delegate;
    final /* synthetic */ MutableState<List<RecommendGroup>> $searchResults$delegate;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverGroupsActivityKt$DiscoverGroupsScreen$searchGroups$1(Context context, MutableState<Boolean> mutableState, MutableState<String> mutableState2, String str, MutableState<List<RecommendGroup>> mutableState3, Continuation<? super DiscoverGroupsActivityKt$DiscoverGroupsScreen$searchGroups$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$isSearchLoading$delegate = mutableState;
        this.$searchError$delegate = mutableState2;
        this.$keyword = str;
        this.$searchResults$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DiscoverGroupsActivityKt$DiscoverGroupsScreen$searchGroups$1 discoverGroupsActivityKt$DiscoverGroupsScreen$searchGroups$1 = new DiscoverGroupsActivityKt$DiscoverGroupsScreen$searchGroups$1(this.$context, this.$isSearchLoading$delegate, this.$searchError$delegate, this.$keyword, this.$searchResults$delegate, continuation);
        discoverGroupsActivityKt$DiscoverGroupsScreen$searchGroups$1.L$0 = obj;
        return discoverGroupsActivityKt$DiscoverGroupsScreen$searchGroups$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DiscoverGroupsActivityKt$DiscoverGroupsScreen$searchGroups$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.DiscoverGroupsActivityKt$DiscoverGroupsScreen$searchGroups$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
