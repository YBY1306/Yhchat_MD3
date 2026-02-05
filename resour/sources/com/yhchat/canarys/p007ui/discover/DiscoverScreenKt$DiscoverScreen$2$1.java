package com.yhchat.canarys.p007ui.discover;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.exifinterface.media.ExifInterface;
import com.yhchat.canarys.data.model.RecommendGroup;
import com.yhchat.canarys.data.repository.DiscoverRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DiscoverScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1", m185f = "DiscoverScreen.kt", m186i = {}, m187l = {113}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes6.dex */
final class DiscoverScreenKt$DiscoverScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Integer> $currentGroupPage$delegate;
    final /* synthetic */ DiscoverRepository $discoverRepo;
    final /* synthetic */ MutableState<List<RecommendGroup>> $groups$delegate;
    final /* synthetic */ MutableState<Boolean> $hasMoreGroups$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoadingMoreGroups$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ CoroutineScope $scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverScreenKt$DiscoverScreen$2$1(LazyListState lazyListState, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, DiscoverRepository discoverRepository, MutableState<Integer> mutableState3, MutableState<List<RecommendGroup>> mutableState4, Continuation<? super DiscoverScreenKt$DiscoverScreen$2$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$scope = coroutineScope;
        this.$isLoadingMoreGroups$delegate = mutableState;
        this.$hasMoreGroups$delegate = mutableState2;
        this.$discoverRepo = discoverRepository;
        this.$currentGroupPage$delegate = mutableState3;
        this.$groups$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DiscoverScreenKt$DiscoverScreen$2$1(this.$listState, this.$scope, this.$isLoadingMoreGroups$delegate, this.$hasMoreGroups$delegate, this.$discoverRepo, this.$currentGroupPage$delegate, this.$groups$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DiscoverScreenKt$DiscoverScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                final LazyListState lazyListState = this.$listState;
                final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DiscoverScreenKt$DiscoverScreen$2$1.invokeSuspend$lambda$0(lazyListState);
                    }
                }));
                final Flow flow = new Flow<Pair<? extends Integer, ? extends Integer>>() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, m169d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
                    /* renamed from: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
                        @DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$1$2", m185f = "DiscoverScreen.kt", m186i = {0, 0, 0, 0, 0}, m187l = {219}, m188m = "emit", m189n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1\\1\\49\\0"}, m191s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
                        /* renamed from: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
                            /*
                                r12 = this;
                                boolean r0 = r14 instanceof com.yhchat.canarys.p007ui.discover.C3783xb89dba54.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L14
                                r0 = r14
                                com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.yhchat.canarys.p007ui.discover.C3783xb89dba54.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r1 = r1 & r2
                                if (r1 == 0) goto L14
                                int r1 = r0.label
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L19
                            L14:
                                com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$1$2$1
                                r0.<init>(r14)
                            L19:
                                java.lang.Object r1 = r0.result
                                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r3 = r0.label
                                switch(r3) {
                                    case 0: goto L3e;
                                    case 1: goto L2c;
                                    default: goto L24;
                                }
                            L24:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                                r0.<init>(r1)
                                throw r0
                            L2c:
                                int r2 = r0.I$0
                                java.lang.Object r3 = r0.L$3
                                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                                java.lang.Object r4 = r0.L$2
                                java.lang.Object r5 = r0.L$1
                                com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$1$2$1 r5 = (com.yhchat.canarys.p007ui.discover.C3783xb89dba54.AnonymousClass2.AnonymousClass1) r5
                                java.lang.Object r13 = r0.L$0
                                kotlin.ResultKt.throwOnFailure(r1)
                                goto L83
                            L3e:
                                kotlin.ResultKt.throwOnFailure(r1)
                                kotlinx.coroutines.flow.FlowCollector r3 = r12.$this_unsafeFlow
                                r5 = r0
                                r4 = r13
                                r6 = 0
                                r7 = r0
                                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                                r8 = r4
                                kotlin.Pair r8 = (kotlin.Pair) r8
                                r9 = 0
                                java.lang.Object r8 = r8.component2()
                                java.lang.Number r8 = (java.lang.Number) r8
                                int r8 = r8.intValue()
                                r10 = 1
                                if (r8 <= 0) goto L5c
                                r11 = r10
                                goto L5d
                            L5c:
                                r11 = 0
                            L5d:
                                if (r11 == 0) goto L84
                                java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
                                r0.L$0 = r7
                                java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
                                r0.L$1 = r7
                                java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
                                r0.L$2 = r7
                                java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
                                r0.L$3 = r7
                                r0.I$0 = r6
                                r0.label = r10
                                java.lang.Object r7 = r3.emit(r4, r0)
                                if (r7 != r2) goto L82
                                return r2
                            L82:
                                r2 = r6
                            L83:
                                goto L85
                            L84:
                            L85:
                                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.C3783xb89dba54.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Pair<? extends Integer, ? extends Integer>> flowCollector, Continuation $completion) {
                        Object objCollect = flowDistinctUntilChanged.collect(new AnonymousClass2(flowCollector), $completion);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                final Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation $completion) {
                        Object objCollect = flow.collect(new C37852(flowCollector), $completion);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, m169d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
                    /* renamed from: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C37852<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
                        @DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$map$1$2", m185f = "DiscoverScreen.kt", m186i = {0, 0, 0, 0, 0}, m187l = {219}, m188m = "emit", m189n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, m191s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
                        /* renamed from: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C37852.this.emit(null, this);
                            }
                        }

                        public C37852(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
                            /*
                                r13 = this;
                                boolean r0 = r15 instanceof com.yhchat.canarys.p007ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$map$1.C37852.AnonymousClass1
                                if (r0 == 0) goto L14
                                r0 = r15
                                com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.yhchat.canarys.p007ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$map$1.C37852.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r1 = r1 & r2
                                if (r1 == 0) goto L14
                                int r1 = r0.label
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L19
                            L14:
                                com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r15)
                            L19:
                                java.lang.Object r1 = r0.result
                                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r3 = r0.label
                                switch(r3) {
                                    case 0: goto L3e;
                                    case 1: goto L2c;
                                    default: goto L24;
                                }
                            L24:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                                r0.<init>(r1)
                                throw r0
                            L2c:
                                int r2 = r0.I$0
                                java.lang.Object r3 = r0.L$3
                                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                                java.lang.Object r4 = r0.L$2
                                java.lang.Object r5 = r0.L$1
                                com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$map$1$2$1 r5 = (com.yhchat.canarys.p007ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$map$1.C37852.AnonymousClass1) r5
                                java.lang.Object r14 = r0.L$0
                                kotlin.ResultKt.throwOnFailure(r1)
                                goto L91
                            L3e:
                                kotlin.ResultKt.throwOnFailure(r1)
                                kotlinx.coroutines.flow.FlowCollector r3 = r13.$this_unsafeFlow
                                r5 = r0
                                r4 = r14
                                r6 = 0
                                r7 = r0
                                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                                r8 = r4
                                kotlin.Pair r8 = (kotlin.Pair) r8
                                r9 = 0
                                java.lang.Object r10 = r8.component1()
                                java.lang.Number r10 = (java.lang.Number) r10
                                int r10 = r10.intValue()
                                java.lang.Object r8 = r8.component2()
                                java.lang.Number r8 = (java.lang.Number) r8
                                int r8 = r8.intValue()
                                int r11 = r8 + (-3)
                                r12 = 1
                                if (r10 < r11) goto L68
                                r11 = r12
                                goto L69
                            L68:
                                r11 = 0
                            L69:
                                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r11)
                                java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
                                r0.L$0 = r8
                                java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
                                r0.L$1 = r8
                                java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
                                r0.L$2 = r8
                                java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
                                r0.L$3 = r8
                                r0.I$0 = r6
                                r0.label = r12
                                java.lang.Object r7 = r3.emit(r7, r0)
                                if (r7 != r2) goto L90
                                return r2
                            L90:
                                r2 = r6
                            L91:
                                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$map$1.C37852.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }
                });
                this.label = 1;
                if (FlowKt.collectLatest(new Flow<Boolean>() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation $completion) {
                        Object objCollect = flowDistinctUntilChanged2.collect(new AnonymousClass2(flowCollector), $completion);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, m169d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
                    /* renamed from: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
                        @DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$2$2", m185f = "DiscoverScreen.kt", m186i = {0, 0, 0, 0, 0}, m187l = {219}, m188m = "emit", m189n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1\\1\\49\\0"}, m191s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
                        /* renamed from: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$2$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
                            /*
                                r10 = this;
                                boolean r0 = r12 instanceof com.yhchat.canarys.p007ui.discover.C3784xb89dba55.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L14
                                r0 = r12
                                com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$2$2$1 r0 = (com.yhchat.canarys.p007ui.discover.C3784xb89dba55.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r1 = r1 & r2
                                if (r1 == 0) goto L14
                                int r1 = r0.label
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L19
                            L14:
                                com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$2$2$1 r0 = new com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$2$2$1
                                r0.<init>(r12)
                            L19:
                                java.lang.Object r1 = r0.result
                                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r3 = r0.label
                                switch(r3) {
                                    case 0: goto L3e;
                                    case 1: goto L2c;
                                    default: goto L24;
                                }
                            L24:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                                r0.<init>(r1)
                                throw r0
                            L2c:
                                int r2 = r0.I$0
                                java.lang.Object r3 = r0.L$3
                                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                                java.lang.Object r4 = r0.L$2
                                java.lang.Object r5 = r0.L$1
                                com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$invokeSuspend$$inlined$filter$2$2$1 r5 = (com.yhchat.canarys.p007ui.discover.C3784xb89dba55.AnonymousClass2.AnonymousClass1) r5
                                java.lang.Object r11 = r0.L$0
                                kotlin.ResultKt.throwOnFailure(r1)
                                goto L79
                            L3e:
                                kotlin.ResultKt.throwOnFailure(r1)
                                kotlinx.coroutines.flow.FlowCollector r3 = r10.$this_unsafeFlow
                                r5 = r0
                                r4 = r11
                                r6 = 0
                                r7 = r0
                                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                                r8 = r4
                                java.lang.Boolean r8 = (java.lang.Boolean) r8
                                boolean r8 = r8.booleanValue()
                                r9 = 0
                                if (r8 == 0) goto L7a
                                java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
                                r0.L$0 = r7
                                java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
                                r0.L$1 = r7
                                java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
                                r0.L$2 = r7
                                java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
                                r0.L$3 = r7
                                r0.I$0 = r6
                                r7 = 1
                                r0.label = r7
                                java.lang.Object r7 = r3.emit(r4, r0)
                                if (r7 != r2) goto L78
                                return r2
                            L78:
                                r2 = r6
                            L79:
                                goto L7b
                            L7a:
                            L7b:
                                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.C3784xb89dba55.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }
                }, new C37945(this.$scope, this.$isLoadingMoreGroups$delegate, this.$hasMoreGroups$delegate, this.$discoverRepo, this.$currentGroupPage$delegate, this.$groups$delegate, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair invokeSuspend$lambda$0(LazyListState $listState) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) $listState.getLayoutInfo().getVisibleItemsInfo());
        int lastVisibleIndex = lazyListItemInfo != null ? lazyListItemInfo.getIndex() : 0;
        int total = $listState.getLayoutInfo().getTotalItemsCount();
        return TuplesKt.m176to(Integer.valueOf(lastVisibleIndex), Integer.valueOf(total));
    }

    /* compiled from: DiscoverScreen.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "", "it", ""}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$5", m185f = "DiscoverScreen.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$2$1$5 */
    static final class C37945 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Integer> $currentGroupPage$delegate;
        final /* synthetic */ DiscoverRepository $discoverRepo;
        final /* synthetic */ MutableState<List<RecommendGroup>> $groups$delegate;
        final /* synthetic */ MutableState<Boolean> $hasMoreGroups$delegate;
        final /* synthetic */ MutableState<Boolean> $isLoadingMoreGroups$delegate;
        final /* synthetic */ CoroutineScope $scope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37945(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, DiscoverRepository discoverRepository, MutableState<Integer> mutableState3, MutableState<List<RecommendGroup>> mutableState4, Continuation<? super C37945> continuation) {
            super(2, continuation);
            this.$scope = coroutineScope;
            this.$isLoadingMoreGroups$delegate = mutableState;
            this.$hasMoreGroups$delegate = mutableState2;
            this.$discoverRepo = discoverRepository;
            this.$currentGroupPage$delegate = mutableState3;
            this.$groups$delegate = mutableState4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C37945(this.$scope, this.$isLoadingMoreGroups$delegate, this.$hasMoreGroups$delegate, this.$discoverRepo, this.$currentGroupPage$delegate, this.$groups$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((C37945) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    DiscoverScreenKt.DiscoverScreen$loadMoreGroups(this.$scope, this.$isLoadingMoreGroups$delegate, this.$hasMoreGroups$delegate, this.$discoverRepo, this.$currentGroupPage$delegate, this.$groups$delegate);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
