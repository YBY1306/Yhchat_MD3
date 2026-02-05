package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material.icons.filled.CodeKt;
import androidx.compose.material.icons.filled.EmojiEmotionsKt;
import androidx.compose.material.icons.filled.FolderKt;
import androidx.compose.material.icons.filled.MicKt;
import androidx.compose.material.icons.filled.MicOffKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.focus.FocusRequester;
import androidx.compose.p000ui.focus.FocusState;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.SoftwareKeyboardController;
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
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yhchat.canarys.data.model.Expression;
import com.yhchat.canarys.data.model.Instruction;
import com.yhchat.canarys.data.model.StickerItem;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ChatInputBar.kt */
@Metadata(m168d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a\u00ff\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030$2\u001c\b\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010&2(\b\u0002\u0010'\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0001\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010+\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u0007\u00a2\u0006\u0002\u0010.\u001a#\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a2\u0006\u0002\u00101\u00a8\u00062\u00b2\u0006\n\u00103\u001a\u00020\"X\u008a\u008e\u0002\u00b2\u0006\n\u00104\u001a\u00020\"X\u008a\u008e\u0002\u00b2\u0006\n\u00105\u001a\u00020\"X\u008a\u008e\u0002\u00b2\u0006\n\u00106\u001a\u00020\"X\u008a\u008e\u0002\u00b2\u0006\n\u00107\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u00108\u001a\u00020\"X\u008a\u008e\u0002\u00b2\u0006\n\u00109\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010:\u001a\u00020\u0003X\u008a\u0084\u0002\u00b2\u0006\u0010\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u008a\u0084\u0002\u00b2\u0006\u0018\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005X\u008a\u0084\u0002\u00b2\u0006\n\u0010=\u001a\u00020\u0011X\u008a\u0084\u0002\u00b2\u0006\n\u0010>\u001a\u00020\"X\u008a\u0084\u0002\u00b2\u0006\n\u0010?\u001a\u00020\u0011X\u008a\u0084\u0002"}, m169d2 = {"ChatInputBar", "", "text", "", "onTextChange", "Lkotlin/Function1;", "onSendMessage", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "placeholder", "onImageClick", "onFileClick", "onCameraClick", "onVideoClick", "onDraftChange", "selectedMessageType", "", "onMessageTypeChange", "quotedMessageText", "onClearQuote", "onExpressionClick", "Lcom/yhchat/canarys/data/model/Expression;", "onStickerClick", "Lcom/yhchat/canarys/data/model/StickerItem;", "onInstructionClick", "Lcom/yhchat/canarys/data/model/Instruction;", "groupId", "botId", "selectedInstruction", "onClearInstruction", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "shouldShowKeyboard", "", "mentionedUsers", "", "onAddMentionUser", "Lkotlin/Function2;", "onVoiceMessageSend", "Lkotlin/Function4;", "", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "voiceViewModel", "Lcom/yhchat/canarys/ui/components/VoiceMessageViewModel;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/data/model/Instruction;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/focus/FocusRequester;ZLjava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;Ljava/lang/String;JLcom/yhchat/canarys/ui/components/VoiceMessageViewModel;Landroidx/compose/runtime/Composer;IIII)V", "InstructionBar", "instruction", "(Lcom/yhchat/canarys/data/model/Instruction;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "showAttachMenu", "showExpressionPicker", "showInstructionPicker", "isVoiceMode", "defaultSendMessageType", "longPressSendMarkdownEnabled", "longPressSendMarkdownSeconds", "currentText", "currentOnSendMessage", "currentMtc", "currentSelectedMessageType", "currentLongPressSendMarkdownEnabled", "currentLongPressSendMarkdownSeconds"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ChatInputBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$33(String str, Function1 function1, Function0 function0, Modifier modifier, String str2, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function12, int i, Function1 function13, String str3, Function0 function06, Function1 function14, Function1 function15, Function1 function16, String str4, String str5, Instruction instruction, Function0 function07, FocusRequester focusRequester, boolean z, Map map, Function2 function2, Function4 function4, String str6, long j, VoiceMessageViewModel voiceMessageViewModel, int i2, int i3, int i4, int i5, Composer composer, int i6) {
        ChatInputBar(str, function1, function0, modifier, str2, function02, function03, function04, function05, function12, i, function13, str3, function06, function14, function15, function16, str4, str5, instruction, function07, focusRequester, z, map, function2, function4, str6, j, voiceMessageViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionBar$lambda$1(Instruction instruction, Function0 function0, int i, Composer composer, int i2) {
        InstructionBar(instruction, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:445:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0b08  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0c08  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0c1a  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0c70  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0dab  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0de9  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0e77  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0f70  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0f98  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0fa9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:630:0x104a  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x1075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ChatInputBar(final java.lang.String r122, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r123, final kotlin.jvm.functions.Function0<kotlin.Unit> r124, androidx.compose.p000ui.Modifier r125, java.lang.String r126, kotlin.jvm.functions.Function0<kotlin.Unit> r127, kotlin.jvm.functions.Function0<kotlin.Unit> r128, kotlin.jvm.functions.Function0<kotlin.Unit> r129, kotlin.jvm.functions.Function0<kotlin.Unit> r130, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r131, int r132, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r133, java.lang.String r134, kotlin.jvm.functions.Function0<kotlin.Unit> r135, kotlin.jvm.functions.Function1<? super com.yhchat.canarys.data.model.Expression, kotlin.Unit> r136, kotlin.jvm.functions.Function1<? super com.yhchat.canarys.data.model.StickerItem, kotlin.Unit> r137, kotlin.jvm.functions.Function1<? super com.yhchat.canarys.data.model.Instruction, kotlin.Unit> r138, java.lang.String r139, java.lang.String r140, com.yhchat.canarys.data.model.Instruction r141, kotlin.jvm.functions.Function0<kotlin.Unit> r142, androidx.compose.p000ui.focus.FocusRequester r143, boolean r144, java.util.Map<java.lang.String, java.lang.String> r145, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r146, kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> r147, java.lang.String r148, long r149, com.yhchat.canarys.p007ui.components.VoiceMessageViewModel r151, androidx.compose.runtime.Composer r152, final int r153, final int r154, final int r155, final int r156) {
        /*
            Method dump skipped, instructions count: 4372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ChatInputBarKt.ChatInputBar(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, int, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, java.lang.String, java.lang.String, com.yhchat.canarys.data.model.Instruction, kotlin.jvm.functions.Function0, androidx.compose.ui.focus.FocusRequester, boolean, java.util.Map, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function4, java.lang.String, long, com.yhchat.canarys.ui.components.VoiceMessageViewModel, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    private static final boolean ChatInputBar$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ChatInputBar$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatInputBar$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ChatInputBar$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatInputBar$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ChatInputBar$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChatInputBar$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatInputBar$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$12$0(VoiceMessageViewModel $voiceViewModel, String $chatId, Context $ctx, long $chatType, String $groupId, String $botId, final Function4 $onVoiceMessageSend, final MutableState $isVoiceMode$delegate, Uri uri) {
        if (uri != null) {
            if ($voiceViewModel != null && $chatId != null) {
                Log.d("ChatInputBar", "audioPicker result uri=" + uri);
                $voiceViewModel.selectAudioFromStorage($ctx, uri, $chatId, $chatType, new Function4() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        return ChatInputBarKt.ChatInputBar$lambda$12$0$0$0($onVoiceMessageSend, $isVoiceMode$delegate, (String) obj, (String) obj2, ((Long) obj3).longValue(), ((Long) obj4).longValue());
                    }
                });
            } else {
                Log.w("ChatInputBar", "audioPicker ignored: voiceViewModel=" + ($voiceViewModel != null) + " chatId=" + $chatId + " chatType=" + $chatType + " groupId=" + $groupId + " botId=" + $botId + " isVoiceMode=" + ChatInputBar$lambda$10($isVoiceMode$delegate), new Throwable("ChatInputBar missing voice params"));
                Toast.makeText($ctx, "\u8bed\u97f3\u529f\u80fd\u53c2\u6570\u7f3a\u5931", 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$12$0$0$0(Function4 $onVoiceMessageSend, MutableState $isVoiceMode$delegate, String fileKey, String fileHash, long fileSize, long duration) {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        Intrinsics.checkNotNullParameter(fileHash, "fileHash");
        if ($onVoiceMessageSend != null) {
            $onVoiceMessageSend.invoke(fileKey, fileHash, Long.valueOf(fileSize), Long.valueOf(duration));
        }
        ChatInputBar$lambda$11($isVoiceMode$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$13$0(VoiceMessageViewModel $voiceViewModel, Context $ctx, boolean isGranted) {
        if (isGranted && $voiceViewModel != null) {
            $voiceViewModel.startRecording($ctx);
        } else {
            Toast.makeText($ctx, "\u9700\u8981\u9ea6\u514b\u98ce\u6743\u9650\u624d\u80fd\u5f55\u97f3", 0).show();
        }
        return Unit.INSTANCE;
    }

    private static final int ChatInputBar$lambda$17(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void ChatInputBar$lambda$18(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final boolean ChatInputBar$lambda$20(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ChatInputBar$lambda$21(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final int ChatInputBar$lambda$23(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void ChatInputBar$lambda$24(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ChatInputBar$lambda$25$0(final SharedPreferences $chatPrefs, final MutableState $longPressSendMarkdownEnabled$delegate, final MutableState $longPressSendMarkdownSeconds$delegate, final MutableState $defaultSendMessageType$delegate, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final SharedPreferences.OnSharedPreferenceChangeListener listener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$$ExternalSyntheticLambda11
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                ChatInputBarKt.ChatInputBar$lambda$25$0$0($chatPrefs, $longPressSendMarkdownEnabled$delegate, $longPressSendMarkdownSeconds$delegate, $defaultSendMessageType$delegate, sharedPreferences, str);
            }
        };
        $chatPrefs.registerOnSharedPreferenceChangeListener(listener);
        return new DisposableEffectResult() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$ChatInputBar$lambda$25$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                $chatPrefs.unregisterOnSharedPreferenceChangeListener(listener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final void ChatInputBar$lambda$25$0$0(SharedPreferences $chatPrefs, MutableState $longPressSendMarkdownEnabled$delegate, MutableState $longPressSendMarkdownSeconds$delegate, MutableState $defaultSendMessageType$delegate, SharedPreferences sharedPreferences, String key) {
        if (key != null) {
            int i = 1;
            switch (key.hashCode()) {
                case -1547545401:
                    if (key.equals("long_press_send_markdown_seconds")) {
                        ChatInputBar$lambda$24($longPressSendMarkdownSeconds$delegate, RangesKt.coerceAtLeast($chatPrefs.getInt("long_press_send_markdown_seconds", 3), 1));
                        break;
                    }
                    break;
                case -832268919:
                    if (key.equals("long_press_send_markdown_enabled")) {
                        ChatInputBar$lambda$21($longPressSendMarkdownEnabled$delegate, $chatPrefs.getBoolean("long_press_send_markdown_enabled", false));
                        break;
                    }
                    break;
                case 2100125003:
                    if (key.equals("default_send_message_type")) {
                        int i2 = $chatPrefs.getInt("default_send_message_type", 1);
                        switch (i2) {
                            case 1:
                            case 3:
                            case 8:
                                i = i2;
                                break;
                        }
                        ChatInputBar$lambda$18($defaultSendMessageType$delegate, i);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChatInputBar$lambda$26(State<String> state) {
        return (String) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> ChatInputBar$lambda$27(State<? extends Function0<Unit>> state) {
        return (Function0) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Integer, Unit> ChatInputBar$lambda$28(State<? extends Function1<? super Integer, Unit>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ChatInputBar$lambda$29(State<Integer> state) {
        return ((Number) state.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChatInputBar$lambda$30(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final int ChatInputBar$lambda$31(State<Integer> state) {
        return ((Number) state.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$0$0(Function0 $onClearQuote) {
        if ($onClearQuote != null) {
            $onClearQuote.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$1$0(Function0 $onClearInstruction) {
        if ($onClearInstruction != null) {
            $onClearInstruction.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0a2d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0a86  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0b77  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0679  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ChatInputBar$lambda$32$0$2(final androidx.compose.p000ui.platform.SoftwareKeyboardController r118, final java.lang.String r119, final kotlin.jvm.functions.Function1 r120, final kotlin.jvm.functions.Function1 r121, kotlin.jvm.functions.Function1 r122, final java.lang.String r123, final java.lang.String r124, androidx.compose.runtime.State r125, androidx.compose.runtime.State r126, androidx.compose.runtime.State r127, androidx.compose.runtime.State r128, kotlinx.coroutines.CoroutineScope r129, androidx.compose.runtime.State r130, androidx.compose.runtime.MutableState r131, final androidx.compose.runtime.MutableState r132, final androidx.compose.runtime.MutableState r133, final androidx.compose.runtime.MutableState r134, final com.yhchat.canarys.p007ui.components.VoiceMessageViewModel r135, final java.lang.String r136, final long r137, final boolean r139, final boolean r140, final android.content.Context r141, final androidx.activity.compose.ManagedActivityResultLauncher r142, final kotlin.jvm.functions.Function4 r143, boolean r144, androidx.activity.compose.ManagedActivityResultLauncher r145, androidx.compose.p000ui.focus.FocusRequester r146, final com.yhchat.canarys.data.model.Instruction r147, final java.lang.String r148, androidx.compose.runtime.State r149, androidx.compose.runtime.Composer r150, int r151) {
        /*
            Method dump skipped, instructions count: 2951
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ChatInputBarKt.ChatInputBar$lambda$32$0$2(androidx.compose.ui.platform.SoftwareKeyboardController, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, java.lang.String, java.lang.String, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.State, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, com.yhchat.canarys.ui.components.VoiceMessageViewModel, java.lang.String, long, boolean, boolean, android.content.Context, androidx.activity.compose.ManagedActivityResultLauncher, kotlin.jvm.functions.Function4, boolean, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.ui.focus.FocusRequester, com.yhchat.canarys.data.model.Instruction, java.lang.String, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$2$0$0$0(SoftwareKeyboardController $keyboardController, MutableState $showAttachMenu$delegate, MutableState $showExpressionPicker$delegate, MutableState $showInstructionPicker$delegate, MutableState $isVoiceMode$delegate) {
        ChatInputBar$lambda$2($showAttachMenu$delegate, !ChatInputBar$lambda$1($showAttachMenu$delegate));
        ChatInputBar$lambda$5($showExpressionPicker$delegate, false);
        ChatInputBar$lambda$8($showInstructionPicker$delegate, false);
        ChatInputBar$lambda$11($isVoiceMode$delegate, false);
        if (ChatInputBar$lambda$1($showAttachMenu$delegate) && $keyboardController != null) {
            $keyboardController.hide();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$2$0$1(MutableState $showAttachMenu$delegate, Composer $composer, int $changed) {
        long j;
        ComposerKt.sourceInformation($composer, "C257@11171L408:ChatInputBar.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(270892212, $changed, -1, "com.yhchat.canarys.ui.components.ChatInputBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatInputBar.kt:257)");
            }
            ImageVector add = AddKt.getAdd(Icons.INSTANCE.getDefault());
            if (ChatInputBar$lambda$1($showAttachMenu$delegate)) {
                $composer.startReplaceGroup(-1665581573);
                ComposerKt.sourceInformation($composer, "261@11379L11");
                long primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                $composer.endReplaceGroup();
                j = primary;
            } else {
                $composer.startReplaceGroup(-1665578588);
                ComposerKt.sourceInformation($composer, "263@11472L11");
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer.endReplaceGroup();
                j = onSurfaceVariant;
            }
            IconKt.m2816Iconww6aTOc(add, "\u9644\u4ef6", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), j, $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$2$0$2$0(SoftwareKeyboardController $keyboardController, MutableState $isVoiceMode$delegate, MutableState $showAttachMenu$delegate, MutableState $showExpressionPicker$delegate, MutableState $showInstructionPicker$delegate) {
        ChatInputBar$lambda$11($isVoiceMode$delegate, !ChatInputBar$lambda$10($isVoiceMode$delegate));
        ChatInputBar$lambda$2($showAttachMenu$delegate, false);
        ChatInputBar$lambda$5($showExpressionPicker$delegate, false);
        ChatInputBar$lambda$8($showInstructionPicker$delegate, false);
        if (ChatInputBar$lambda$10($isVoiceMode$delegate) && $keyboardController != null) {
            $keyboardController.hide();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$2$0$3(MutableState $isVoiceMode$delegate, Composer $composer, int $changed) {
        long j;
        ComposerKt.sourceInformation($composer, "C281@12144L477:ChatInputBar.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(985468587, $changed, -1, "com.yhchat.canarys.ui.components.ChatInputBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatInputBar.kt:281)");
            }
            ImageVector micOff = ChatInputBar$lambda$10($isVoiceMode$delegate) ? MicOffKt.getMicOff(Icons.INSTANCE.getDefault()) : MicKt.getMic(Icons.INSTANCE.getDefault());
            String str = ChatInputBar$lambda$10($isVoiceMode$delegate) ? "\u5173\u95ed\u8bed\u97f3" : "\u8bed\u97f3";
            if (ChatInputBar$lambda$10($isVoiceMode$delegate)) {
                $composer.startReplaceGroup(2142516946);
                ComposerKt.sourceInformation($composer, "285@12421L11");
                long primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                $composer.endReplaceGroup();
                j = primary;
            } else {
                $composer.startReplaceGroup(2142519931);
                ComposerKt.sourceInformation($composer, "287@12514L11");
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer.endReplaceGroup();
                j = onSurfaceVariant;
            }
            IconKt.m2816Iconww6aTOc(micOff, str, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), j, $composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ChatInputBar$lambda$32$0$2$0$4$1(boolean r75, boolean r76, boolean r77, androidx.compose.runtime.Composer r78, int r79) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ChatInputBarKt.ChatInputBar$lambda$32$0$2$0$4$1(boolean, boolean, boolean, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$2$0$4$2$0(ManagedActivityResultLauncher $audioPickerLauncher) {
        $audioPickerLauncher.launch("audio/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$2$0$4$3(boolean $isProcessing, boolean $isUploading, RowScope Button, Composer $composer, int $changed) {
        Function0 function0;
        long primary;
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C420@20558L915:ChatInputBar.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1060830074, $changed, -1, "com.yhchat.canarys.ui.components.ChatInputBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatInputBar.kt:420)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM909spacedBy0680j_4, centerVertically, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((432 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 2003527924, "C424@20790L242,431@21228L10,429@21065L378:ChatInputBar.kt#2suaub");
            IconKt.m2816Iconww6aTOc(FolderKt.getFolder(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, $composer, 432, 8);
            String str = ($isProcessing || $isUploading) ? "\u5904\u7406\u4e2d..." : "\u4ece\u5b58\u50a8\u9009\u53d6";
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium();
            if ($isProcessing || $isUploading) {
                $composer.startReplaceGroup(-2013562647);
                ComposerKt.sourceInformation($composer, "432@21342L11");
                primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
            } else {
                $composer.startReplaceGroup(-2013561390);
                ComposerKt.sourceInformation($composer, "432@21381L11");
                primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g(str, (Modifier) null, primary, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium, $composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$2$0$5$0(Function1 $onTextChange, Function1 $onDraftChange, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        $onTextChange.invoke(newText);
        if ($onDraftChange != null) {
            $onDraftChange.invoke(newText);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$2$0$6$0(MutableState $showExpressionPicker$delegate, FocusState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.isFocused()) {
            ChatInputBar$lambda$5($showExpressionPicker$delegate, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ChatInputBar$lambda$32$0$2$0$8(java.lang.String r54, com.yhchat.canarys.data.model.Instruction r55, java.lang.String r56, kotlin.jvm.functions.Function2 r57, androidx.compose.runtime.Composer r58, int r59) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ChatInputBarKt.ChatInputBar$lambda$32$0$2$0$8(java.lang.String, com.yhchat.canarys.data.model.Instruction, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$2$0$9$0(SoftwareKeyboardController $keyboardController, MutableState $showInstructionPicker$delegate, MutableState $showAttachMenu$delegate, MutableState $showExpressionPicker$delegate) {
        ChatInputBar$lambda$8($showInstructionPicker$delegate, !ChatInputBar$lambda$7($showInstructionPicker$delegate));
        ChatInputBar$lambda$2($showAttachMenu$delegate, false);
        ChatInputBar$lambda$5($showExpressionPicker$delegate, false);
        if (ChatInputBar$lambda$7($showInstructionPicker$delegate) && $keyboardController != null) {
            $keyboardController.hide();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$2$0$10(MutableState $showInstructionPicker$delegate, Composer $composer, int $changed) {
        long j;
        ComposerKt.sourceInformation($composer, "C501@24793L512:ChatInputBar.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1307499782, $changed, -1, "com.yhchat.canarys.ui.components.ChatInputBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatInputBar.kt:501)");
            }
            ImageVector code = CodeKt.getCode(Icons.INSTANCE.getDefault());
            if (ChatInputBar$lambda$7($showInstructionPicker$delegate)) {
                $composer.startReplaceGroup(-1918116915);
                ComposerKt.sourceInformation($composer, "505@25073L11");
                long primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                $composer.endReplaceGroup();
                j = primary;
            } else {
                $composer.startReplaceGroup(-1918113418);
                ComposerKt.sourceInformation($composer, "507@25182L11");
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer.endReplaceGroup();
                j = onSurfaceVariant;
            }
            IconKt.m2816Iconww6aTOc(code, "\u6307\u4ee4", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), j, $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$2$0$11$0(SoftwareKeyboardController $keyboardController, MutableState $showExpressionPicker$delegate, MutableState $showAttachMenu$delegate, MutableState $showInstructionPicker$delegate) {
        ChatInputBar$lambda$5($showExpressionPicker$delegate, !ChatInputBar$lambda$4($showExpressionPicker$delegate));
        ChatInputBar$lambda$2($showAttachMenu$delegate, false);
        ChatInputBar$lambda$8($showInstructionPicker$delegate, false);
        if (ChatInputBar$lambda$4($showExpressionPicker$delegate) && $keyboardController != null) {
            $keyboardController.hide();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$2$0$12(MutableState $showExpressionPicker$delegate, Composer $composer, int $changed) {
        long j;
        ComposerKt.sourceInformation($composer, "C525@25930L456:ChatInputBar.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1852729620, $changed, -1, "com.yhchat.canarys.ui.components.ChatInputBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatInputBar.kt:525)");
            }
            ImageVector emojiEmotions = EmojiEmotionsKt.getEmojiEmotions(Icons.INSTANCE.getDefault());
            if (ChatInputBar$lambda$4($showExpressionPicker$delegate)) {
                $composer.startReplaceGroup(1938271923);
                ComposerKt.sourceInformation($composer, "529@26170L11");
                long primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                $composer.endReplaceGroup();
                j = primary;
            } else {
                $composer.startReplaceGroup(1938275164);
                ComposerKt.sourceInformation($composer, "531@26271L11");
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer.endReplaceGroup();
                j = onSurfaceVariant;
            }
            IconKt.m2816Iconww6aTOc(emojiEmotions, "\u8868\u60c5", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), j, $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ChatInputBar$lambda$32$0$3$0(int it) {
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ChatInputBar$lambda$32$0$4$0(int it) {
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$5(final Function0 $onImageClick, final Function0 $onFileClick, final Function0 $onCameraClick, final Function0 $onVideoClick, final Function1 $onMessageTypeChange, final SharedPreferences $chatPrefs, int $selectedMessageType, final MutableState $showAttachMenu$delegate, final MutableState $defaultSendMessageType$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C600@29738L117,604@29891L116,608@30045L118,612@30200L117,616@30353L125,620@30514L125,624@30679L125,629@30920L206,599@29687L1671:ChatInputBar.kt#2suaub");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1533591510, $changed, -1, "com.yhchat.canarys.ui.components.ChatInputBar.<anonymous>.<anonymous>.<anonymous> (ChatInputBar.kt:599)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 607660907, "CC(remember):ChatInputBar.kt#9igjgp");
        boolean zChanged = $composer.changed($onImageClick);
        Object objRememberedValue = $composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatInputBarKt.ChatInputBar$lambda$32$0$5$0$0($onImageClick, $showAttachMenu$delegate);
                }
            };
            $composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        Function0 function0 = (Function0) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 607665802, "CC(remember):ChatInputBar.kt#9igjgp");
        boolean zChanged2 = $composer.changed($onFileClick);
        Object objRememberedValue2 = $composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatInputBarKt.ChatInputBar$lambda$32$0$5$1$0($onFileClick, $showAttachMenu$delegate);
                }
            };
            $composer.updateRememberedValue(obj2);
            objRememberedValue2 = obj2;
        }
        Function0 function02 = (Function0) objRememberedValue2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 607670732, "CC(remember):ChatInputBar.kt#9igjgp");
        boolean zChanged3 = $composer.changed($onCameraClick);
        Object objRememberedValue3 = $composer.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatInputBarKt.ChatInputBar$lambda$32$0$5$2$0($onCameraClick, $showAttachMenu$delegate);
                }
            };
            $composer.updateRememberedValue(obj3);
            objRememberedValue3 = obj3;
        }
        Function0 function03 = (Function0) objRememberedValue3;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 607675691, "CC(remember):ChatInputBar.kt#9igjgp");
        boolean zChanged4 = $composer.changed($onVideoClick);
        Object objRememberedValue4 = $composer.rememberedValue();
        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatInputBarKt.ChatInputBar$lambda$32$0$5$3$0($onVideoClick, $showAttachMenu$delegate);
                }
            };
            $composer.updateRememberedValue(objRememberedValue4);
        }
        Function0 function04 = (Function0) objRememberedValue4;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 607680595, "CC(remember):ChatInputBar.kt#9igjgp");
        boolean zChanged5 = $composer.changed($onMessageTypeChange);
        Object objRememberedValue5 = $composer.rememberedValue();
        if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function0() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatInputBarKt.ChatInputBar$lambda$32$0$5$4$0($onMessageTypeChange, $showAttachMenu$delegate);
                }
            };
            $composer.updateRememberedValue(objRememberedValue5);
        }
        Function0 function05 = (Function0) objRememberedValue5;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 607685747, "CC(remember):ChatInputBar.kt#9igjgp");
        boolean zChanged6 = $composer.changed($onMessageTypeChange);
        Object objRememberedValue6 = $composer.rememberedValue();
        if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue6 = new Function0() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatInputBarKt.ChatInputBar$lambda$32$0$5$5$0($onMessageTypeChange, $showAttachMenu$delegate);
                }
            };
            $composer.updateRememberedValue(objRememberedValue6);
        }
        Function0 function06 = (Function0) objRememberedValue6;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 607691027, "CC(remember):ChatInputBar.kt#9igjgp");
        boolean zChanged7 = $composer.changed($onMessageTypeChange);
        Object objRememberedValue7 = $composer.rememberedValue();
        if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue7 = new Function0() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatInputBarKt.ChatInputBar$lambda$32$0$5$6$0($onMessageTypeChange, $showAttachMenu$delegate);
                }
            };
            $composer.updateRememberedValue(objRememberedValue7);
        }
        Function0 function07 = (Function0) objRememberedValue7;
        ComposerKt.sourceInformationMarkerEnd($composer);
        int iChatInputBar$lambda$17 = ChatInputBar$lambda$17($defaultSendMessageType$delegate);
        ComposerKt.sourceInformationMarkerStart($composer, 607698820, "CC(remember):ChatInputBar.kt#9igjgp");
        boolean zChangedInstance = $composer.changedInstance($chatPrefs);
        Object objRememberedValue8 = $composer.rememberedValue();
        if (zChangedInstance || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue8 = new Function1() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return ChatInputBarKt.ChatInputBar$lambda$32$0$5$7$0($chatPrefs, $defaultSendMessageType$delegate, ((Integer) obj4).intValue());
                }
            };
            $composer.updateRememberedValue(objRememberedValue8);
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        ChatInputBarComponentsKt.AttachmentMenu(function0, function02, function03, function04, function05, function06, function07, iChatInputBar$lambda$17, (Function1) objRememberedValue8, $selectedMessageType, PaddingKt.m1051paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(8)), $composer, 0, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$5$0$0(Function0 $onImageClick, MutableState $showAttachMenu$delegate) {
        if ($onImageClick != null) {
            $onImageClick.invoke();
        }
        ChatInputBar$lambda$2($showAttachMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$5$1$0(Function0 $onFileClick, MutableState $showAttachMenu$delegate) {
        if ($onFileClick != null) {
            $onFileClick.invoke();
        }
        ChatInputBar$lambda$2($showAttachMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$5$2$0(Function0 $onCameraClick, MutableState $showAttachMenu$delegate) {
        if ($onCameraClick != null) {
            $onCameraClick.invoke();
        }
        ChatInputBar$lambda$2($showAttachMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$5$3$0(Function0 $onVideoClick, MutableState $showAttachMenu$delegate) {
        if ($onVideoClick != null) {
            $onVideoClick.invoke();
        }
        ChatInputBar$lambda$2($showAttachMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$5$4$0(Function1 $onMessageTypeChange, MutableState $showAttachMenu$delegate) {
        if ($onMessageTypeChange != null) {
            $onMessageTypeChange.invoke(1);
        }
        ChatInputBar$lambda$2($showAttachMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$5$5$0(Function1 $onMessageTypeChange, MutableState $showAttachMenu$delegate) {
        if ($onMessageTypeChange != null) {
            $onMessageTypeChange.invoke(8);
        }
        ChatInputBar$lambda$2($showAttachMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$5$6$0(Function1 $onMessageTypeChange, MutableState $showAttachMenu$delegate) {
        if ($onMessageTypeChange != null) {
            $onMessageTypeChange.invoke(3);
        }
        ChatInputBar$lambda$2($showAttachMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$0$5$7$0(SharedPreferences $chatPrefs, MutableState $defaultSendMessageType$delegate, int newDefaultType) {
        ChatInputBar$lambda$18($defaultSendMessageType$delegate, newDefaultType);
        $chatPrefs.edit().putInt("default_send_message_type", newDefaultType).apply();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$1$0(Function1 $onExpressionClick, MutableState $showExpressionPicker$delegate, Expression expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        if ($onExpressionClick != null) {
            $onExpressionClick.invoke(expression);
        }
        ChatInputBar$lambda$5($showExpressionPicker$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$2$0(Function1 $onStickerClick, MutableState $showExpressionPicker$delegate, StickerItem stickerItem) {
        Intrinsics.checkNotNullParameter(stickerItem, "stickerItem");
        if ($onStickerClick != null) {
            $onStickerClick.invoke(stickerItem);
        }
        ChatInputBar$lambda$5($showExpressionPicker$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$3$0(Function1 $onTextChange, String $text, String expressionName) {
        Intrinsics.checkNotNullParameter(expressionName, "expressionName");
        $onTextChange.invoke($text + expressionName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$4$0(MutableState $showExpressionPicker$delegate) {
        ChatInputBar$lambda$5($showExpressionPicker$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$5$0(Function1 $onInstructionClick, MutableState $showInstructionPicker$delegate, Instruction instruction) {
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        if ($onInstructionClick != null) {
            $onInstructionClick.invoke(instruction);
        }
        ChatInputBar$lambda$8($showInstructionPicker$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInputBar$lambda$32$6$0(MutableState $showInstructionPicker$delegate) {
        ChatInputBar$lambda$8($showInstructionPicker$delegate, false);
        return Unit.INSTANCE;
    }

    public static final void InstructionBar(final Instruction instruction, final Function0<Unit> onClearInstruction, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        Intrinsics.checkNotNullParameter(onClearInstruction, "onClearInstruction");
        Composer $composer2 = $composer.startRestartGroup(-459736631);
        ComposerKt.sourceInformation($composer2, "C(InstructionBar)N(instruction,onClearInstruction)686@32921L11,688@33019L1519,682@32768L1770:ChatInputBar.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(instruction) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onClearInstruction) ? 32 : 16;
        }
        if ($composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-459736631, $dirty, -1, "com.yhchat.canarys.ui.components.InstructionBar (ChatInputBar.kt:681)");
            }
            Modifier modifierM1051paddingVpY3zN4 = PaddingKt.m1051paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(8), C1834Dp.m7806constructorimpl(4));
            long secondaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSecondaryContainer();
            SurfaceKt.m3209SurfaceT9BRK9s(modifierM1051paddingVpY3zN4, RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(8)), Color.m5055copywmQWz5c(secondaryContainer, (14 & 1) != 0 ? Color.m5059getAlphaimpl(secondaryContainer) : 0.5f, (14 & 2) != 0 ? Color.m5063getRedimpl(secondaryContainer) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(secondaryContainer) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(secondaryContainer) : 0.0f), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1409206364, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatInputBarKt.InstructionBar$lambda$0(onClearInstruction, instruction, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 12582918, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatInputBarKt.InstructionBar$lambda$1(instruction, onClearInstruction, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit InstructionBar$lambda$0(kotlin.jvm.functions.Function0 r75, com.yhchat.canarys.data.model.Instruction r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ChatInputBarKt.InstructionBar$lambda$0(kotlin.jvm.functions.Function0, com.yhchat.canarys.data.model.Instruction, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
