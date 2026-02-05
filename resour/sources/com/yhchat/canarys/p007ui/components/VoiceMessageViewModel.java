package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.caverock.androidsvg.SVGParser;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.utils.AudioUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: VoiceMessageViewModel.kt */
@Metadata(m168d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016JD\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2$\u0010\u001b\u001a \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u001cJ\u0006\u0010\u001d\u001a\u00020\u0014JL\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2$\u0010\u001b\u001a \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u001cJT\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2$\u0010\u001b\u001a \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u001cH\u0082@\u00a2\u0006\u0002\u0010$Jl\u0010%\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\t2$\u0010\u001b\u001a \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u001cH\u0082@\u00a2\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, m169d2 = {"Lcom/yhchat/canarys/ui/components/VoiceMessageViewModel;", "Landroidx/lifecycle/ViewModel;", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "tag", "", "_voiceState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/components/VoiceMessageViewModel$VoiceState;", "voiceState", "Lkotlinx/coroutines/flow/StateFlow;", "getVoiceState", "()Lkotlinx/coroutines/flow/StateFlow;", "recordingFile", "Ljava/io/File;", "startRecording", "", "context", "Landroid/content/Context;", "stopRecordingAndUpload", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "onSuccess", "Lkotlin/Function4;", "cancelRecording", "selectAudioFromStorage", "uri", "Landroid/net/Uri;", "uploadAndSendVoice", "file", "duration", "(Ljava/io/File;Ljava/lang/String;JJLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendVoiceMessage", "fileKey", "fileHash", "fileSize", "fileExtension", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearError", "VoiceState", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class VoiceMessageViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<VoiceState> _voiceState;
    private final ApiService apiService;
    private File recordingFile;
    private final String tag;
    private final TokenRepository tokenRepository;
    private final StateFlow<VoiceState> voiceState;

    /* compiled from: VoiceMessageViewModel.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.VoiceMessageViewModel", m185f = "VoiceMessageViewModel.kt", m186i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m187l = {338, 375}, m188m = "sendVoiceMessage", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, "fileKey", "fileHash", "fileExtension", "onSuccess", ChatSearchActivity.EXTRA_CHAT_TYPE, "fileSize", "duration", ChatSearchActivity.EXTRA_CHAT_ID, "fileKey", "fileHash", "fileExtension", "onSuccess", "token", "msgId", "contentData", SVGParser.XML_STYLESHEET_ATTR_MEDIA, "sendMessage", "requestBody", ChatSearchActivity.EXTRA_CHAT_TYPE, "fileSize", "duration"}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "J$1", "J$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "J$0", "J$1", "J$2"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.VoiceMessageViewModel$sendVoiceMessage$1 */
    static final class C36791 extends ContinuationImpl {
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        C36791(Continuation<? super C36791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceMessageViewModel.this.sendVoiceMessage(null, 0L, null, null, 0L, 0L, null, null, this);
        }
    }

    /* compiled from: VoiceMessageViewModel.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.VoiceMessageViewModel", m185f = "VoiceMessageViewModel.kt", m186i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, m187l = {234, 245, 272, 285, 299}, m188m = "uploadAndSendVoice", m189n = {"file", ChatSearchActivity.EXTRA_CHAT_ID, "onSuccess", ChatSearchActivity.EXTRA_CHAT_TYPE, "duration", "file", ChatSearchActivity.EXTRA_CHAT_ID, "onSuccess", "token", ChatSearchActivity.EXTRA_CHAT_TYPE, "duration", "file", ChatSearchActivity.EXTRA_CHAT_ID, "onSuccess", "token", "tokenResponse", "qiniuToken", "accessKey", ChatSearchActivity.EXTRA_CHAT_TYPE, "duration", "file", ChatSearchActivity.EXTRA_CHAT_ID, "onSuccess", "token", "tokenResponse", "qiniuToken", "accessKey", "uploadDomain", ChatSearchActivity.EXTRA_CHAT_TYPE, "duration", "file", ChatSearchActivity.EXTRA_CHAT_ID, "onSuccess", "token", "tokenResponse", "qiniuToken", "accessKey", "uploadDomain", "uploadResponse", ChatSearchActivity.EXTRA_CHAT_TYPE, "duration"}, m191s = {"L$0", "L$1", "L$2", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0", "J$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.VoiceMessageViewModel$uploadAndSendVoice$1 */
    static final class C36821 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        C36821(Continuation<? super C36821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceMessageViewModel.this.uploadAndSendVoice(null, null, 0L, 0L, null, this);
        }
    }

    public VoiceMessageViewModel(ApiService apiService, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
        this.tag = "VoiceMessageVM";
        this._voiceState = StateFlowKt.MutableStateFlow(new VoiceState(false, false, 0L, null, false, 31, null));
        this.voiceState = FlowKt.asStateFlow(this._voiceState);
    }

    public final StateFlow<VoiceState> getVoiceState() {
        return this.voiceState;
    }

    /* compiled from: VoiceMessageViewModel.kt */
    @Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\f\u00a8\u0006\u001c"}, m169d2 = {"Lcom/yhchat/canarys/ui/components/VoiceMessageViewModel$VoiceState;", "", "isRecording", "", "isUploading", "recordingTime", "", "error", "", "isProcessing", "<init>", "(ZZJLjava/lang/String;Z)V", "()Z", "getRecordingTime", "()J", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class VoiceState {
        public static final int $stable = 0;
        private final String error;
        private final boolean isProcessing;
        private final boolean isRecording;
        private final boolean isUploading;
        private final long recordingTime;

        public VoiceState() {
            this(false, false, 0L, null, false, 31, null);
        }

        public static /* synthetic */ VoiceState copy$default(VoiceState voiceState, boolean z, boolean z2, long j, String str, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = voiceState.isRecording;
            }
            if ((i & 2) != 0) {
                z2 = voiceState.isUploading;
            }
            if ((i & 4) != 0) {
                j = voiceState.recordingTime;
            }
            if ((i & 8) != 0) {
                str = voiceState.error;
            }
            if ((i & 16) != 0) {
                z3 = voiceState.isProcessing;
            }
            long j2 = j;
            return voiceState.copy(z, z2, j2, str, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRecording() {
            return this.isRecording;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsUploading() {
            return this.isUploading;
        }

        /* renamed from: component3, reason: from getter */
        public final long getRecordingTime() {
            return this.recordingTime;
        }

        /* renamed from: component4, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsProcessing() {
            return this.isProcessing;
        }

        public final VoiceState copy(boolean isRecording, boolean isUploading, long recordingTime, String error, boolean isProcessing) {
            return new VoiceState(isRecording, isUploading, recordingTime, error, isProcessing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VoiceState)) {
                return false;
            }
            VoiceState voiceState = (VoiceState) other;
            return this.isRecording == voiceState.isRecording && this.isUploading == voiceState.isUploading && this.recordingTime == voiceState.recordingTime && Intrinsics.areEqual(this.error, voiceState.error) && this.isProcessing == voiceState.isProcessing;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isRecording) * 31) + Boolean.hashCode(this.isUploading)) * 31) + Long.hashCode(this.recordingTime)) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + Boolean.hashCode(this.isProcessing);
        }

        public String toString() {
            return "VoiceState(isRecording=" + this.isRecording + ", isUploading=" + this.isUploading + ", recordingTime=" + this.recordingTime + ", error=" + this.error + ", isProcessing=" + this.isProcessing + ")";
        }

        public VoiceState(boolean isRecording, boolean isUploading, long recordingTime, String error, boolean isProcessing) {
            this.isRecording = isRecording;
            this.isUploading = isUploading;
            this.recordingTime = recordingTime;
            this.error = error;
            this.isProcessing = isProcessing;
        }

        public /* synthetic */ VoiceState(boolean z, boolean z2, long j, String str, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z3);
        }

        public final boolean isRecording() {
            return this.isRecording;
        }

        public final boolean isUploading() {
            return this.isUploading;
        }

        public final long getRecordingTime() {
            return this.recordingTime;
        }

        public final String getError() {
            return this.error;
        }

        public final boolean isProcessing() {
            return this.isProcessing;
        }
    }

    /* compiled from: VoiceMessageViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.VoiceMessageViewModel$startRecording$1", m185f = "VoiceMessageViewModel.kt", m186i = {}, m187l = {53}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.VoiceMessageViewModel$startRecording$1 */
    static final class C36801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36801(Context context, Continuation<? super C36801> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VoiceMessageViewModel.this.new C36801(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objStartRecording;
            VoiceMessageViewModel voiceMessageViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Log.d(VoiceMessageViewModel.this.tag, "startRecording");
                        VoiceMessageViewModel.this._voiceState.setValue(VoiceState.copy$default((VoiceState) VoiceMessageViewModel.this._voiceState.getValue(), true, false, System.currentTimeMillis(), null, false, 26, null));
                        VoiceMessageViewModel voiceMessageViewModel2 = VoiceMessageViewModel.this;
                        this.L$0 = voiceMessageViewModel2;
                        this.label = 1;
                        objStartRecording = AudioUtils.INSTANCE.startRecording(this.$context, this);
                        if (objStartRecording == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        voiceMessageViewModel = voiceMessageViewModel2;
                        break;
                    case 1:
                        voiceMessageViewModel = (VoiceMessageViewModel) this.L$0;
                        ResultKt.throwOnFailure($result);
                        objStartRecording = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                voiceMessageViewModel.recordingFile = (File) objStartRecording;
                if (VoiceMessageViewModel.this.recordingFile == null) {
                    VoiceMessageViewModel.this._voiceState.setValue(VoiceState.copy$default((VoiceState) VoiceMessageViewModel.this._voiceState.getValue(), false, false, 0L, "\u5f55\u97f3\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u9ea6\u514b\u98ce\u6743\u9650", false, 22, null));
                }
            } catch (Exception e) {
                VoiceMessageViewModel.this._voiceState.setValue(VoiceState.copy$default((VoiceState) VoiceMessageViewModel.this._voiceState.getValue(), false, false, 0L, "\u5f55\u97f3\u5931\u8d25: " + e.getMessage(), false, 22, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void startRecording(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36801(context, null), 3, null);
    }

    /* compiled from: VoiceMessageViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.VoiceMessageViewModel$stopRecordingAndUpload$1", m185f = "VoiceMessageViewModel.kt", m186i = {1, 2, 2, 3, 3, 3}, m187l = {83, 93, 105, 118}, m188m = "invokeSuspend", m189n = {"file", "file", "duration", "file", "renamedFile", "duration"}, m191s = {"L$0", "L$0", "J$0", "L$0", "L$1", "J$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.VoiceMessageViewModel$stopRecordingAndUpload$1 */
    static final class C36811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ long $chatType;
        final /* synthetic */ Function4<String, String, Long, Long, Unit> $onSuccess;
        long J$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C36811(String str, long j, Function4<? super String, ? super String, ? super Long, ? super Long, Unit> function4, Continuation<? super C36811> continuation) {
            super(2, continuation);
            this.$chatId = str;
            this.$chatType = j;
            this.$onSuccess = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VoiceMessageViewModel.this.new C36811(this.$chatId, this.$chatType, this.$onSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00f7 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:7:0x001d, B:10:0x0028, B:38:0x0136, B:40:0x013b, B:42:0x0168, B:13:0x0034, B:30:0x00c1, B:32:0x00f7, B:34:0x0121, B:14:0x003b, B:22:0x00a4, B:24:0x00a8, B:27:0x00b0, B:47:0x01ae, B:19:0x0048), top: B:52:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0121 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:7:0x001d, B:10:0x0028, B:38:0x0136, B:40:0x013b, B:42:0x0168, B:13:0x0034, B:30:0x00c1, B:32:0x00f7, B:34:0x0121, B:14:0x003b, B:22:0x00a4, B:24:0x00a8, B:27:0x00b0, B:47:0x01ae, B:19:0x0048), top: B:52:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x013b A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:7:0x001d, B:10:0x0028, B:38:0x0136, B:40:0x013b, B:42:0x0168, B:13:0x0034, B:30:0x00c1, B:32:0x00f7, B:34:0x0121, B:14:0x003b, B:22:0x00a4, B:24:0x00a8, B:27:0x00b0, B:47:0x01ae, B:19:0x0048), top: B:52:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0168 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:7:0x001d, B:10:0x0028, B:38:0x0136, B:40:0x013b, B:42:0x0168, B:13:0x0034, B:30:0x00c1, B:32:0x00f7, B:34:0x0121, B:14:0x003b, B:22:0x00a4, B:24:0x00a8, B:27:0x00b0, B:47:0x01ae, B:19:0x0048), top: B:52:0x0008 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 560
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.VoiceMessageViewModel.C36811.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void stopRecordingAndUpload(Context context, String chatId, long chatType, Function4<? super String, ? super String, ? super Long, ? super Long, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36811(chatId, chatType, onSuccess, null), 3, null);
    }

    /* compiled from: VoiceMessageViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.VoiceMessageViewModel$cancelRecording$1", m185f = "VoiceMessageViewModel.kt", m186i = {}, m187l = {135}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.VoiceMessageViewModel$cancelRecording$1 */
    static final class C36771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C36771(Continuation<? super C36771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VoiceMessageViewModel.this.new C36771(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (AudioUtils.INSTANCE.cancelRecording(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            VoiceMessageViewModel.this._voiceState.setValue(VoiceState.copy$default((VoiceState) VoiceMessageViewModel.this._voiceState.getValue(), false, false, 0L, null, false, 14, null));
            return Unit.INSTANCE;
        }
    }

    public final void cancelRecording() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36771(null), 3, null);
    }

    /* compiled from: VoiceMessageViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.VoiceMessageViewModel$selectAudioFromStorage$1", m185f = "VoiceMessageViewModel.kt", m186i = {1, 2, 2, 2}, m187l = {155, 164, 208}, m188m = "invokeSuspend", m189n = {"file", "file", "duration", "finalDuration"}, m191s = {"L$0", "L$0", "J$0", "J$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.VoiceMessageViewModel$selectAudioFromStorage$1 */
    static final class C36781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ long $chatType;
        final /* synthetic */ Context $context;
        final /* synthetic */ Function4<String, String, Long, Long, Unit> $onSuccess;
        final /* synthetic */ Uri $uri;
        long J$0;
        long J$1;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C36781(Uri uri, String str, long j, Context context, Function4<? super String, ? super String, ? super Long, ? super Long, Unit> function4, Continuation<? super C36781> continuation) {
            super(2, continuation);
            this.$uri = uri;
            this.$chatId = str;
            this.$chatType = j;
            this.$context = context;
            this.$onSuccess = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VoiceMessageViewModel.this.new C36781(this.$uri, this.$chatId, this.$chatType, this.$context, this.$onSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:7:0x001c, B:10:0x0025, B:27:0x00e2, B:29:0x011a, B:31:0x0120, B:33:0x012a, B:35:0x015c, B:37:0x019e, B:38:0x01ac, B:41:0x01c1, B:43:0x01c7, B:47:0x01db, B:49:0x020b, B:11:0x002d, B:19:0x00a5, B:21:0x00a9, B:23:0x00d0, B:16:0x003a), top: B:57:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d0 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:7:0x001c, B:10:0x0025, B:27:0x00e2, B:29:0x011a, B:31:0x0120, B:33:0x012a, B:35:0x015c, B:37:0x019e, B:38:0x01ac, B:41:0x01c1, B:43:0x01c7, B:47:0x01db, B:49:0x020b, B:11:0x002d, B:19:0x00a5, B:21:0x00a9, B:23:0x00d0, B:16:0x003a), top: B:57:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x015c A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:7:0x001c, B:10:0x0025, B:27:0x00e2, B:29:0x011a, B:31:0x0120, B:33:0x012a, B:35:0x015c, B:37:0x019e, B:38:0x01ac, B:41:0x01c1, B:43:0x01c7, B:47:0x01db, B:49:0x020b, B:11:0x002d, B:19:0x00a5, B:21:0x00a9, B:23:0x00d0, B:16:0x003a), top: B:57:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01ac A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:7:0x001c, B:10:0x0025, B:27:0x00e2, B:29:0x011a, B:31:0x0120, B:33:0x012a, B:35:0x015c, B:37:0x019e, B:38:0x01ac, B:41:0x01c1, B:43:0x01c7, B:47:0x01db, B:49:0x020b, B:11:0x002d, B:19:0x00a5, B:21:0x00a9, B:23:0x00d0, B:16:0x003a), top: B:57:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01db A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:7:0x001c, B:10:0x0025, B:27:0x00e2, B:29:0x011a, B:31:0x0120, B:33:0x012a, B:35:0x015c, B:37:0x019e, B:38:0x01ac, B:41:0x01c1, B:43:0x01c7, B:47:0x01db, B:49:0x020b, B:11:0x002d, B:19:0x00a5, B:21:0x00a9, B:23:0x00d0, B:16:0x003a), top: B:57:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x020b A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #0 {Exception -> 0x0033, blocks: (B:7:0x001c, B:10:0x0025, B:27:0x00e2, B:29:0x011a, B:31:0x0120, B:33:0x012a, B:35:0x015c, B:37:0x019e, B:38:0x01ac, B:41:0x01c1, B:43:0x01c7, B:47:0x01db, B:49:0x020b, B:11:0x002d, B:19:0x00a5, B:21:0x00a9, B:23:0x00d0, B:16:0x003a), top: B:57:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 646
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.VoiceMessageViewModel.C36781.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void selectAudioFromStorage(Context context, Uri uri, String chatId, long chatType, Function4<? super String, ? super String, ? super Long, ? super Long, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36781(uri, chatId, chatType, context, onSuccess, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0359 A[Catch: Exception -> 0x04ea, TryCatch #2 {Exception -> 0x04ea, blocks: (B:93:0x0346, B:95:0x034e, B:100:0x0359, B:102:0x039b), top: B:159:0x0346 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x039b A[Catch: Exception -> 0x04ea, TRY_LEAVE, TryCatch #2 {Exception -> 0x04ea, blocks: (B:93:0x0346, B:95:0x034e, B:100:0x0359, B:102:0x039b), top: B:159:0x0346 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03e2 A[Catch: Exception -> 0x04df, TryCatch #10 {Exception -> 0x04df, blocks: (B:106:0x03de, B:108:0x03e2, B:110:0x0413, B:116:0x04a3), top: B:173:0x03de }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0413 A[Catch: Exception -> 0x04df, TRY_LEAVE, TryCatch #10 {Exception -> 0x04df, blocks: (B:106:0x03de, B:108:0x03e2, B:110:0x0413, B:116:0x04a3), top: B:173:0x03de }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0503 A[Catch: Exception -> 0x0553, TryCatch #7 {Exception -> 0x0553, blocks: (B:133:0x04f5, B:135:0x0503, B:137:0x0509, B:79:0x02a5, B:81:0x02e0, B:87:0x02ed, B:89:0x0317), top: B:168:0x0243 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f7 A[Catch: Exception -> 0x01ef, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ef, blocks: (B:69:0x024d, B:51:0x01e5, B:59:0x01f7), top: B:156:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021e A[Catch: Exception -> 0x0555, TRY_ENTER, TryCatch #5 {Exception -> 0x0555, blocks: (B:65:0x023d, B:67:0x0245, B:77:0x0264, B:49:0x01de, B:61:0x021e), top: B:164:0x01de }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0245 A[Catch: Exception -> 0x0555, TRY_LEAVE, TryCatch #5 {Exception -> 0x0555, blocks: (B:65:0x023d, B:67:0x0245, B:77:0x0264, B:49:0x01de, B:61:0x021e), top: B:164:0x01de }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0264 A[Catch: Exception -> 0x0555, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0555, blocks: (B:65:0x023d, B:67:0x0245, B:77:0x0264, B:49:0x01de, B:61:0x021e), top: B:164:0x01de }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object uploadAndSendVoice(java.io.File r33, java.lang.String r34, long r35, long r37, kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> r39, kotlin.coroutines.Continuation<? super kotlin.Unit> r40) {
        /*
            Method dump skipped, instructions count: 1508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.VoiceMessageViewModel.uploadAndSendVoice(java.io.File, java.lang.String, long, long, kotlin.jvm.functions.Function4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:155:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147 A[Catch: Exception -> 0x0136, TRY_LEAVE, TryCatch #6 {Exception -> 0x0136, blocks: (B:41:0x012c, B:49:0x0147), top: B:155:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0179 A[Catch: Exception -> 0x04a2, TRY_ENTER, TRY_LEAVE, TryCatch #18 {Exception -> 0x04a2, blocks: (B:39:0x0122, B:51:0x0179), top: B:178:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02de A[Catch: Exception -> 0x0464, TRY_LEAVE, TryCatch #17 {Exception -> 0x0464, blocks: (B:66:0x02d6, B:68:0x02de), top: B:176:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0329 A[Catch: Exception -> 0x045b, TryCatch #13 {Exception -> 0x045b, blocks: (B:70:0x02e2, B:72:0x0329, B:74:0x0337, B:86:0x035a, B:89:0x0362, B:91:0x039b, B:92:0x03d0, B:94:0x03d8, B:100:0x03e4, B:102:0x0406, B:101:0x0402, B:103:0x0429, B:82:0x0347, B:79:0x0341), top: B:169:0x02dc, inners: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendVoiceMessage(java.lang.String r39, long r40, java.lang.String r42, java.lang.String r43, long r44, long r46, java.lang.String r48, kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> r49, kotlin.coroutines.Continuation<? super kotlin.Unit> r50) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.VoiceMessageViewModel.sendVoiceMessage(java.lang.String, long, java.lang.String, java.lang.String, long, long, java.lang.String, kotlin.jvm.functions.Function4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void clearError() {
        this._voiceState.setValue(VoiceState.copy$default(this._voiceState.getValue(), false, false, 0L, null, false, 23, null));
    }
}
