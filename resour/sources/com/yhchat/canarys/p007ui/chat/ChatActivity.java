package com.yhchat.canarys.p007ui.chat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.content.FileProvider;
import androidx.core.view.WindowCompat;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import com.yhchat.canarys.p007ui.user.UserDetailActivity;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatActivity.kt */
@Metadata(m168d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0014J\u0010\u00105\u001a\u0002022\u0006\u00106\u001a\u000207H\u0014J\u0010\u00108\u001a\u0002022\u0006\u00106\u001a\u000207H\u0002R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00050\u00050\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00050\u00050\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00050\u00050\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0004\u001a\u0004\u0018\u00010\u001d8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b#\u0010\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u001d0\u001d0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010%\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0004\u001a\u0004\u0018\u00010\u001d8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010\f\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\"R/\u0010)\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0004\u001a\u0004\u0018\u00010\u001d8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010\f\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R/\u0010-\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0004\u001a\u0004\u0018\u00010\u001d8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b0\u0010\f\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"\u00a8\u00069"}, m169d2 = {"Lcom/yhchat/canarys/ui/chat/ChatActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "<set-?>", "", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "chatId$delegate", "Landroidx/compose/runtime/MutableState;", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "getChatType", "()I", "setChatType", "(I)V", "chatType$delegate", ChatSearchActivity.EXTRA_CHAT_NAME, "getChatName", "setChatName", "chatName$delegate", "imagePickerLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "filePickerLauncher", "videoPickerLauncher", "Landroid/net/Uri;", "cameraImageUri", "getCameraImageUri", "()Landroid/net/Uri;", "setCameraImageUri", "(Landroid/net/Uri;)V", "cameraImageUri$delegate", "cameraLauncher", "imageUriToSend", "getImageUriToSend", "setImageUriToSend", "imageUriToSend$delegate", "fileUriToSend", "getFileUriToSend", "setFileUriToSend", "fileUriToSend$delegate", "videoUriToSend", "getVideoUriToSend", "setVideoUriToSend", "videoUriToSend$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "updateChatParams", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes12.dex */
public final class ChatActivity extends Hilt_ChatActivity {
    public static final int $stable = 8;

    /* renamed from: cameraImageUri$delegate, reason: from kotlin metadata */
    private final MutableState cameraImageUri;
    private final ActivityResultLauncher<Uri> cameraLauncher;
    private final ActivityResultLauncher<String> filePickerLauncher;

    /* renamed from: fileUriToSend$delegate, reason: from kotlin metadata */
    private final MutableState fileUriToSend;
    private final ActivityResultLauncher<String> imagePickerLauncher;

    /* renamed from: imageUriToSend$delegate, reason: from kotlin metadata */
    private final MutableState imageUriToSend;
    private final ActivityResultLauncher<String> videoPickerLauncher;

    /* renamed from: videoUriToSend$delegate, reason: from kotlin metadata */
    private final MutableState videoUriToSend;

    /* renamed from: chatId$delegate, reason: from kotlin metadata */
    private final MutableState com.yhchat.canarys.ui.group.ChatSearchActivity.EXTRA_CHAT_ID java.lang.String = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* renamed from: chatType$delegate, reason: from kotlin metadata */
    private final MutableState com.yhchat.canarys.ui.group.ChatSearchActivity.EXTRA_CHAT_TYPE java.lang.String = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);

    /* renamed from: chatName$delegate, reason: from kotlin metadata */
    private final MutableState com.yhchat.canarys.ui.group.ChatSearchActivity.EXTRA_CHAT_NAME java.lang.String = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    public ChatActivity() {
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback() { // from class: com.yhchat.canarys.ui.chat.ChatActivity$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ChatActivity.imagePickerLauncher$lambda$0(this.f$0, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.imagePickerLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback() { // from class: com.yhchat.canarys.ui.chat.ChatActivity$$ExternalSyntheticLambda8
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ChatActivity.filePickerLauncher$lambda$0(this.f$0, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.filePickerLauncher = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback() { // from class: com.yhchat.canarys.ui.chat.ChatActivity$$ExternalSyntheticLambda9
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ChatActivity.videoPickerLauncher$lambda$0(this.f$0, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.videoPickerLauncher = activityResultLauncherRegisterForActivityResult3;
        this.cameraImageUri = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        ActivityResultLauncher<Uri> activityResultLauncherRegisterForActivityResult4 = registerForActivityResult(new ActivityResultContracts.TakePicture(), new ActivityResultCallback() { // from class: com.yhchat.canarys.ui.chat.ChatActivity$$ExternalSyntheticLambda10
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ChatActivity.cameraLauncher$lambda$0(this.f$0, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult4, "registerForActivityResult(...)");
        this.cameraLauncher = activityResultLauncherRegisterForActivityResult4;
        this.imageUriToSend = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.fileUriToSend = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.videoUriToSend = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    private final String getChatId() {
        return (String) this.com.yhchat.canarys.ui.group.ChatSearchActivity.EXTRA_CHAT_ID java.lang.String.getValue();
    }

    private final void setChatId(String str) {
        this.com.yhchat.canarys.ui.group.ChatSearchActivity.EXTRA_CHAT_ID java.lang.String.setValue(str);
    }

    private final int getChatType() {
        return ((Number) this.com.yhchat.canarys.ui.group.ChatSearchActivity.EXTRA_CHAT_TYPE java.lang.String.getValue()).intValue();
    }

    private final void setChatType(int i) {
        this.com.yhchat.canarys.ui.group.ChatSearchActivity.EXTRA_CHAT_TYPE java.lang.String.setValue(Integer.valueOf(i));
    }

    private final String getChatName() {
        return (String) this.com.yhchat.canarys.ui.group.ChatSearchActivity.EXTRA_CHAT_NAME java.lang.String.getValue();
    }

    private final void setChatName(String str) {
        this.com.yhchat.canarys.ui.group.ChatSearchActivity.EXTRA_CHAT_NAME java.lang.String.setValue(str);
    }

    public static final void imagePickerLauncher$lambda$0(ChatActivity this$0, Uri uri) {
        if (uri != null) {
            Log.d("ChatActivity", "\u56fe\u7247\u5df2\u9009\u62e9: " + uri);
            this$0.setImageUriToSend(uri);
        }
    }

    public static final void filePickerLauncher$lambda$0(ChatActivity this$0, Uri uri) {
        if (uri != null) {
            Log.d("ChatActivity", "\u1f4c1 \u6587\u4ef6\u5df2\u9009\u62e9: " + uri);
            this$0.setFileUriToSend(uri);
        }
    }

    public static final void videoPickerLauncher$lambda$0(ChatActivity this$0, Uri uri) {
        if (uri != null) {
            Log.d("ChatActivity", "\u1f4f9 \u89c6\u9891\u5df2\u9009\u62e9: " + uri);
            this$0.setVideoUriToSend(uri);
        }
    }

    private final Uri getCameraImageUri() {
        return (Uri) this.cameraImageUri.getValue();
    }

    private final void setCameraImageUri(Uri uri) {
        this.cameraImageUri.setValue(uri);
    }

    public static final void cameraLauncher$lambda$0(ChatActivity this$0, Boolean success) {
        Uri cameraImageUri;
        if (success.booleanValue() && (cameraImageUri = this$0.getCameraImageUri()) != null) {
            Log.d("ChatActivity", "\u62cd\u7167\u6210\u529f: " + cameraImageUri);
            this$0.setImageUriToSend(cameraImageUri);
        }
    }

    private final Uri getImageUriToSend() {
        return (Uri) this.imageUriToSend.getValue();
    }

    private final void setImageUriToSend(Uri uri) {
        this.imageUriToSend.setValue(uri);
    }

    private final Uri getFileUriToSend() {
        return (Uri) this.fileUriToSend.getValue();
    }

    private final void setFileUriToSend(Uri uri) {
        this.fileUriToSend.setValue(uri);
    }

    private final Uri getVideoUriToSend() {
        return (Uri) this.videoUriToSend.getValue();
    }

    private final void setVideoUriToSend(Uri uri) {
        this.videoUriToSend.setValue(uri);
    }

    @Override // com.yhchat.canarys.p007ui.chat.Hilt_ChatActivity, com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        updateChatParams(intent);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(2098234237, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatActivity$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ChatActivity.onCreate$lambda$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public static final Unit onCreate$lambda$0(final ChatActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C85@3052L3514,85@3034L3532:ChatActivity.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2098234237, $changed, -1, "com.yhchat.canarys.ui.chat.ChatActivity.onCreate.<anonymous> (ChatActivity.kt:85)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-1386706886, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatActivity$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatActivity.onCreate$lambda$0$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0(final ChatActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C86@3102L11,87@3177L7,88@3212L178,88@3201L189,92@3437L11,92@3461L3091,92@3407L3145:ChatActivity.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1386706886, $changed, -1, "com.yhchat.canarys.ui.chat.ChatActivity.onCreate.<anonymous>.<anonymous> (ChatActivity.kt:86)");
            }
            final int topBarColor = ColorKt.m5111toArgb8_81llA(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer());
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localView);
            ComposerKt.sourceInformationMarkerEnd($composer);
            final View view = (View) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer, -1185450388, "CC(remember):ChatActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0) | $composer.changedInstance(view) | $composer.changed(topBarColor);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatActivity$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatActivity.onCreate$lambda$0$0$0$0(this.f$0, view, topBarColor);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.SideEffect((Function0) objRememberedValue, $composer, 0);
            SurfaceKt.m3209SurfaceT9BRK9s(null, null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(693124095, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatActivity$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatActivity.onCreate$lambda$0$0$1(this.f$0, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 12582912, 123);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0$0(ChatActivity this$0, View $view, int $topBarColor) {
        WindowCompat.getInsetsController(this$0.getWindow(), $view).setAppearanceLightStatusBars(false);
        this$0.getWindow().setStatusBarColor($topBarColor);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit onCreate$lambda$0$0$1(final com.yhchat.canarys.p007ui.chat.ChatActivity r23, androidx.compose.runtime.Composer r24, int r25) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatActivity.onCreate$lambda$0$0$1(com.yhchat.canarys.ui.chat.ChatActivity, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit onCreate$lambda$0$0$1$0$0(ChatActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$1$1$0(ChatActivity this$0, String userId, String userName, int chatType, int currentUserPermission) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        if (chatType != 3) {
            UserDetailActivity.INSTANCE.start(this$0, userId, userName, this$0.getChatType() == 2 ? this$0.getChatId() : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$1$2$0(ChatActivity this$0) {
        this$0.imagePickerLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$1$3$0(ChatActivity this$0) {
        File photoFile = new File(this$0.getCacheDir(), "camera_" + System.currentTimeMillis() + ".jpg");
        this$0.setCameraImageUri(FileProvider.getUriForFile(this$0, this$0.getPackageName() + ".fileprovider", photoFile));
        this$0.cameraLauncher.launch(this$0.getCameraImageUri());
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$1$4$0(ChatActivity this$0) {
        Log.d("ChatActivity", "\u1f4c1 \u542f\u52a8\u6587\u4ef6\u9009\u62e9\u5668");
        this$0.filePickerLauncher.launch("*/*");
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$1$5$0(ChatActivity this$0) {
        Log.d("ChatActivity", "\u1f4f9 \u542f\u52a8\u89c6\u9891\u9009\u62e9\u5668");
        this$0.videoPickerLauncher.launch("video/*");
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$1$6$0(ChatActivity this$0) {
        this$0.setImageUriToSend(null);
        this$0.setCameraImageUri(null);
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$1$7$0(ChatActivity this$0) {
        Log.d("ChatActivity", "\u1f4c1 \u6587\u4ef6\u53d1\u9001\u5b8c\u6210\uff0c\u6e05\u7a7aURI");
        this$0.setFileUriToSend(null);
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$1$8$0(ChatActivity this$0) {
        Log.d("ChatActivity", "\u1f4f9 \u89c6\u9891\u53d1\u9001\u5b8c\u6210\uff0c\u6e05\u7a7aURI");
        this$0.setVideoUriToSend(null);
        return Unit.INSTANCE;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Log.d("ChatActivity", "onNewIntent called, updating chat params");
        updateChatParams(intent);
        setIntent(intent);
    }

    private final void updateChatParams(Intent intent) {
        String newChatId = intent.getStringExtra(ChatSearchActivity.EXTRA_CHAT_ID);
        if (newChatId == null) {
            newChatId = "";
        }
        int newChatType = intent.getIntExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, 1);
        String stringExtra = intent.getStringExtra(ChatSearchActivity.EXTRA_CHAT_NAME);
        String newChatName = stringExtra != null ? stringExtra : "";
        Log.d("ChatActivity", "Updating chat params: chatId=" + newChatId + ", chatType=" + newChatType + ", chatName=" + newChatName);
        setChatId(newChatId);
        setChatType(newChatType);
        setChatName(newChatName);
    }
}
