package com.yhchat.canarys.p007ui.settings;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.yhchat.canarys.data.model.NavigationConfig;
import com.yhchat.canarys.data.model.NavigationItem;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NavigationSettingsActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$NavigationSettingsScreen$1$1", m185f = "NavigationSettingsActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes8.dex */
final class NavigationSettingsActivityKt$NavigationSettingsScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $hasChanges$delegate;
    final /* synthetic */ MutableState<List<NavigationItem>> $items$delegate;
    final /* synthetic */ State<NavigationConfig> $navigationConfig$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSettingsActivityKt$NavigationSettingsScreen$1$1(State<NavigationConfig> state, MutableState<List<NavigationItem>> mutableState, MutableState<Boolean> mutableState2, Continuation<? super NavigationSettingsActivityKt$NavigationSettingsScreen$1$1> continuation) {
        super(2, continuation);
        this.$navigationConfig$delegate = state;
        this.$items$delegate = mutableState;
        this.$hasChanges$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NavigationSettingsActivityKt$NavigationSettingsScreen$1$1(this.$navigationConfig$delegate, this.$items$delegate, this.$hasChanges$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NavigationSettingsActivityKt$NavigationSettingsScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$items$delegate.setValue(CollectionsKt.sortedWith(NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$0(this.$navigationConfig$delegate).getItems(), new Comparator() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$NavigationSettingsScreen$1$1$invokeSuspend$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(((NavigationItem) t).getOrder()), Integer.valueOf(((NavigationItem) t2).getOrder()));
                    }
                }));
                NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$6(this.$hasChanges$delegate, false);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
