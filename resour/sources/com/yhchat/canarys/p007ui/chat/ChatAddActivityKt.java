package com.yhchat.canarys.p007ui.chat;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.ChatAddInfo;
import com.yhchat.canarys.data.model.ChatAddType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatAddActivity.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00a2\u0006\u0002\u0010\r\u001a-\u0010\u000e\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003\u00a2\u0006\u0002\u0010\u0013\u00a8\u0006\u0014\u00b2\u0006\n\u0010\u0015\u001a\u00020\u0011X\u008a\u0084\u0002"}, m169d2 = {"ChatAddScreen", "", "chatAddInfo", "Lcom/yhchat/canarys/data/model/ChatAddInfo;", "shareKey", "", "shareTs", "viewModel", "Lcom/yhchat/canarys/ui/chat/ChatAddViewModel;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/yhchat/canarys/data/model/ChatAddInfo;Ljava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/ui/chat/ChatAddViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChatDetailContent", "chatInfo", "addState", "Lcom/yhchat/canarys/ui/chat/ChatAddUiState;", "onAddClick", "(Lcom/yhchat/canarys/data/model/ChatAddInfo;Lcom/yhchat/canarys/ui/chat/ChatAddUiState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class ChatAddActivityKt {

    /* compiled from: ChatAddActivity.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatAddType.values().length];
            try {
                iArr[ChatAddType.USER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ChatAddType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ChatAddType.BOT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatAddScreen$lambda$4(ChatAddInfo chatAddInfo, String str, String str2, ChatAddViewModel chatAddViewModel, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChatAddScreen(chatAddInfo, str, str2, chatAddViewModel, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatDetailContent$lambda$0(ChatAddInfo chatAddInfo, ChatAddUiState chatAddUiState, Function0 function0, int i, Composer composer, int i2) {
        ChatDetailContent(chatAddInfo, chatAddUiState, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatDetailContent$lambda$2(ChatAddInfo chatAddInfo, ChatAddUiState chatAddUiState, Function0 function0, int i, Composer composer, int i2) {
        ChatDetailContent(chatAddInfo, chatAddUiState, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ChatAddScreen(ChatAddInfo chatAddInfo, String shareKey, String shareTs, final ChatAddViewModel viewModel, final Function0<Unit> onDismiss, Modifier modifier, Composer $composer, final int $changed, final int i) {
        String str;
        String str2;
        final ChatAddInfo chatAddInfo2;
        final Modifier modifier2;
        final String shareKey2;
        final String shareTs2;
        ChatAddInfo chatAddInfo3;
        String shareKey3;
        String shareTs3;
        Modifier modifier3;
        int $dirty;
        ChatAddInfo chatAddInfo4;
        String shareKey4;
        String shareTs4;
        int i2;
        boolean z;
        ChatAddActivityKt$ChatAddScreen$1$1 chatAddActivityKt$ChatAddScreen$1$1;
        Function0 function0;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(-1798978961);
        ComposerKt.sourceInformation($composer2, "C(ChatAddScreen)N(chatAddInfo,shareKey,shareTs,viewModel,onDismiss,modifier)160@5714L7,162@5773L16,165@5858L352,165@5811L399,179@6272L120,179@6235L157,186@6402L3631:ChatAddActivity.kt#kdrqfv");
        int $dirty2 = $changed;
        int i3 = i & 1;
        if (i3 != 0) {
            $dirty2 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changed(chatAddInfo) ? 4 : 2;
        }
        int i4 = i & 2;
        if (i4 != 0) {
            $dirty2 |= 48;
            str = shareKey;
        } else if (($changed & 48) == 0) {
            str = shareKey;
            $dirty2 |= $composer2.changed(str) ? 32 : 16;
        } else {
            str = shareKey;
        }
        int i5 = i & 4;
        if (i5 != 0) {
            $dirty2 |= 384;
            str2 = shareTs;
        } else if (($changed & 384) == 0) {
            str2 = shareTs;
            $dirty2 |= $composer2.changed(str2) ? 256 : 128;
        } else {
            str2 = shareTs;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer2.changedInstance(viewModel) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty2 |= $composer2.changedInstance(onDismiss) ? 16384 : 8192;
        }
        int i6 = i & 32;
        if (i6 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.f207xf2722a21;
        } else if (($changed & ProfileVerifier.CompilationStatus.f207xf2722a21) == 0) {
            $dirty2 |= $composer2.changed(modifier) ? 131072 : 65536;
        }
        if ($composer2.shouldExecute(($dirty2 & 74899) != 74898, $dirty2 & 1)) {
            if (i3 != 0) {
                chatAddInfo3 = null;
            } else {
                chatAddInfo3 = chatAddInfo;
            }
            if (i4 == 0) {
                shareKey3 = str;
            } else {
                shareKey3 = null;
            }
            if (i5 == 0) {
                shareTs3 = str2;
            } else {
                shareTs3 = null;
            }
            if (i6 == 0) {
                modifier3 = modifier;
            } else {
                modifier3 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1798978961, $dirty2, -1, "com.yhchat.canarys.ui.chat.ChatAddScreen (ChatAddActivity.kt:159)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Activity activity = objConsume instanceof Activity ? (Activity) objConsume : null;
            final State uiState$delegate = SnapshotStateKt.collectAsState(viewModel.getUiState(), null, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, 2053051599, "CC(remember):ChatAddActivity.kt#9igjgp");
            boolean zChangedInstance = (($dirty2 & 14) == 4) | $composer2.changedInstance(viewModel) | (($dirty2 & 112) == 32) | (($dirty2 & 896) == 256);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                String str3 = shareKey3;
                $dirty = $dirty2;
                chatAddInfo4 = chatAddInfo3;
                shareKey4 = str3;
                shareTs4 = shareTs3;
                i2 = 16384;
                z = false;
                chatAddActivityKt$ChatAddScreen$1$1 = new ChatAddActivityKt$ChatAddScreen$1$1(chatAddInfo4, viewModel, shareKey4, shareTs4, null);
                $composer2.updateRememberedValue(chatAddActivityKt$ChatAddScreen$1$1);
            } else {
                chatAddActivityKt$ChatAddScreen$1$1 = objRememberedValue;
                shareTs4 = shareTs3;
                String str4 = shareKey3;
                $dirty = $dirty2;
                chatAddInfo4 = chatAddInfo3;
                shareKey4 = str4;
                i2 = 16384;
                z = false;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            int i7 = ($dirty & 14) | ($dirty & 112) | ($dirty & 896);
            final ChatAddInfo chatAddInfo5 = chatAddInfo4;
            int $dirty3 = $dirty;
            String shareKey5 = shareKey4;
            boolean z2 = z;
            EffectsKt.LaunchedEffect(chatAddInfo5, shareKey5, shareTs4, (Function2) chatAddActivityKt$ChatAddScreen$1$1, $composer2, i7);
            Boolean boolValueOf = Boolean.valueOf(ChatAddScreen$lambda$0(uiState$delegate).isAddSuccess());
            ComposerKt.sourceInformationMarkerStart($composer2, 2053064615, "CC(remember):ChatAddActivity.kt#9igjgp");
            boolean zChanged = $composer2.changed(uiState$delegate) | (($dirty3 & 57344) == i2 ? true : z2);
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new ChatAddActivityKt$ChatAddScreen$2$1(onDismiss, uiState$delegate, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer2, 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            String shareTs5 = shareTs4;
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxSize$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i8 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = (i8 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i10 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -950411631, "C194@6659L38,195@6708L3319,190@6510L3517:ChatAddActivity.kt#kdrqfv");
            CardKt.Card(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.9f), null, false, 3, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(8), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-120378009, true, new Function3() { // from class: com.yhchat.canarys.ui.chat.ChatAddActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return ChatAddActivityKt.ChatAddScreen$lambda$3$0(viewModel, chatAddInfo5, onDismiss, uiState$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 196614, 22);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shareTs2 = shareTs5;
            chatAddInfo2 = chatAddInfo5;
            shareKey2 = shareKey5;
            modifier2 = modifier3;
        } else {
            $composer2.skipToGroupEnd();
            chatAddInfo2 = chatAddInfo;
            modifier2 = modifier;
            shareKey2 = str;
            shareTs2 = str2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatAddActivityKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatAddActivityKt.ChatAddScreen$lambda$4(chatAddInfo2, shareKey2, shareTs2, viewModel, onDismiss, modifier2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatAddUiState ChatAddScreen$lambda$0(State<ChatAddUiState> state) {
        return (ChatAddUiState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ChatAddScreen$lambda$3$0(final com.yhchat.canarys.p007ui.chat.ChatAddViewModel r88, final com.yhchat.canarys.data.model.ChatAddInfo r89, kotlin.jvm.functions.Function0 r90, androidx.compose.runtime.State r91, androidx.compose.foundation.layout.ColumnScope r92, androidx.compose.runtime.Composer r93, int r94) {
        /*
            Method dump skipped, instructions count: 2004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatAddActivityKt.ChatAddScreen$lambda$3$0(com.yhchat.canarys.ui.chat.ChatAddViewModel, com.yhchat.canarys.data.model.ChatAddInfo, kotlin.jvm.functions.Function0, androidx.compose.runtime.State, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatAddScreen$lambda$3$0$0$2$0$0$0(ChatAddViewModel $viewModel, ChatAddInfo $info) {
        $viewModel.loadChatInfo($info);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatAddScreen$lambda$3$0$0$3$0(ChatAddViewModel $viewModel) {
        $viewModel.addChat();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x08ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void ChatDetailContent(final com.yhchat.canarys.data.model.ChatAddInfo r113, final com.yhchat.canarys.p007ui.chat.ChatAddUiState r114, kotlin.jvm.functions.Function0<kotlin.Unit> r115, androidx.compose.runtime.Composer r116, final int r117) {
        /*
            Method dump skipped, instructions count: 2548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatAddActivityKt.ChatDetailContent(com.yhchat.canarys.data.model.ChatAddInfo, com.yhchat.canarys.ui.chat.ChatAddUiState, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatDetailContent$lambda$1$2$0$0(Activity $activity) {
        if ($activity != null) {
            $activity.finishAffinity();
        }
        if ($activity != null) {
            $activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatDetailContent$lambda$1$2$1(ChatAddUiState $addState, ChatAddInfo $chatInfo, RowScope Button, Composer $composer, int $changed) {
        String str;
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C410@14401L435:ChatAddActivity.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-759141341, $changed, -1, "com.yhchat.canarys.ui.chat.ChatDetailContent.<anonymous>.<anonymous>.<anonymous> (ChatAddActivity.kt:403)");
            }
            if ($addState.isAdding()) {
                $composer.startReplaceGroup(1718139367);
                ComposerKt.sourceInformation($composer, "404@14158L148,408@14327L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(1704107775);
            }
            $composer.endReplaceGroup();
            if ($addState.isAdding()) {
                str = "\u6dfb\u52a0\u4e2d...";
            } else if ($addState.isAddSuccess()) {
                str = "\u5df2\u6dfb\u52a0";
            } else {
                switch (WhenMappings.$EnumSwitchMapping$0[$chatInfo.getType().ordinal()]) {
                    case 1:
                        str = "\u6dfb\u52a0\u597d\u53cb";
                        break;
                    case 2:
                        str = "\u52a0\u5165\u7fa4\u804a";
                        break;
                    case 3:
                        str = "\u6dfb\u52a0\u673a\u5668\u4eba";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            TextKt.m3359Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
