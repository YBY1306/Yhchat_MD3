package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.GifDecoder;
import coil.decode.ImageDecoderDecoder;
import coil.decode.SvgDecoder;
import coil.request.ImageRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ImageUtils.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J \u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0005J \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0005J \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0005J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0005J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/ui/components/ImageUtils;", "", "<init>", "()V", "isDataSaverEnabled", "", "context", "Landroid/content/Context;", "createImageLoader", "Lcoil/ImageLoader;", "createStickerImageRequest", "Lcoil/request/ImageRequest;", "url", "", "enableHardware", "createImageRequest", "createAvatarImageRequest", "createBotImageRequest", "createBoardImageRequest", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ImageUtils {
    public static final int $stable = 0;
    public static final ImageUtils INSTANCE = new ImageUtils();

    private ImageUtils() {
    }

    private final boolean isDataSaverEnabled(Context context) {
        SharedPreferences prefs = context.getSharedPreferences("display_settings", 0);
        return prefs.getBoolean("data_saver", false);
    }

    public final ImageLoader createImageLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageLoader.Builder builder = new ImageLoader.Builder(context);
        ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
        builder2.add(new GifDecoder.Factory(false, 1, null));
        if (Build.VERSION.SDK_INT >= 28) {
            builder2.add(new ImageDecoderDecoder.Factory(false, 1, null));
        }
        builder2.add(new SvgDecoder.Factory(false, 1, null));
        return builder.components(builder2.build()).build();
    }

    public static /* synthetic */ ImageRequest createStickerImageRequest$default(ImageUtils imageUtils, Context context, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return imageUtils.createStickerImageRequest(context, str, z);
    }

    public final ImageRequest createStickerImageRequest(Context context, String url, boolean enableHardware) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        if (isDataSaverEnabled(context)) {
            return new ImageRequest.Builder(context).data(null).build();
        }
        ImageRequest.Builder builder = new ImageRequest.Builder(context).data(url).allowHardware(enableHardware).crossfade(true);
        if (StringsKt.contains$default((CharSequence) url, (CharSequence) "chat-img.jwznb.com", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) url, (CharSequence) "jwznb.com", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) url, (CharSequence) "myapp.jwznb.com", false, 2, (Object) null)) {
            builder.setHeader("Referer", "https://myapp.jwznb.com");
            builder.setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36");
        }
        return builder.build();
    }

    public static /* synthetic */ ImageRequest createImageRequest$default(ImageUtils imageUtils, Context context, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return imageUtils.createImageRequest(context, str, z);
    }

    public final ImageRequest createImageRequest(Context context, String url, boolean enableHardware) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        if (isDataSaverEnabled(context)) {
            return new ImageRequest.Builder(context).data(null).build();
        }
        ImageRequest.Builder builder = new ImageRequest.Builder(context).data(url).allowHardware(enableHardware).crossfade(true);
        if (StringsKt.contains$default((CharSequence) url, (CharSequence) "chat-img.jwznb.com", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) url, (CharSequence) "jwznb.com", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) url, (CharSequence) "myapp.jwznb.com", false, 2, (Object) null)) {
            builder.setHeader("Referer", "https://myapp.jwznb.com");
            builder.setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36");
        }
        return builder.build();
    }

    public static /* synthetic */ ImageRequest createAvatarImageRequest$default(ImageUtils imageUtils, Context context, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return imageUtils.createAvatarImageRequest(context, str, z);
    }

    public final ImageRequest createAvatarImageRequest(Context context, String url, boolean enableHardware) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        if (isDataSaverEnabled(context)) {
            return new ImageRequest.Builder(context).data(null).build();
        }
        ImageRequest.Builder builder = new ImageRequest.Builder(context).data(url).allowHardware(enableHardware).crossfade(true);
        if (StringsKt.contains$default((CharSequence) url, (CharSequence) "chat-img.jwznb.com", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) url, (CharSequence) "jwznb.com", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) url, (CharSequence) "myapp.jwznb.com", false, 2, (Object) null)) {
            builder.setHeader("Referer", "https://myapp.jwznb.com");
            builder.setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36");
        }
        return builder.build();
    }

    public static /* synthetic */ ImageRequest createBotImageRequest$default(ImageUtils imageUtils, Context context, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return imageUtils.createBotImageRequest(context, str, z);
    }

    public final ImageRequest createBotImageRequest(Context context, String url, boolean enableHardware) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        if (isDataSaverEnabled(context)) {
            return new ImageRequest.Builder(context).data(null).build();
        }
        return new ImageRequest.Builder(context).data(url).setHeader("Referer", "https://myapp.jwznb.com").setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36").allowHardware(enableHardware).crossfade(true).build();
    }

    public static /* synthetic */ ImageRequest createBoardImageRequest$default(ImageUtils imageUtils, Context context, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return imageUtils.createBoardImageRequest(context, str, z);
    }

    public final ImageRequest createBoardImageRequest(Context context, String url, boolean enableHardware) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        if (isDataSaverEnabled(context)) {
            return new ImageRequest.Builder(context).data(null).build();
        }
        return new ImageRequest.Builder(context).data(url).setHeader("Referer", "https://myapp.jwznb.com").setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36").allowHardware(enableHardware).crossfade(true).build();
    }
}
