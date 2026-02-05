package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.yhchat.canarys.util.YunhuLinkHandler;
import com.yhchat.canarys.utils.ChatAddLinkHandler;
import com.yhchat.canarys.utils.UnifiedLinkHandler;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.LinkResolver;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MarkdownText.kt */
@Metadata(m168d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, m169d2 = {"com/yhchat/canarys/ui/components/MarkdownTextKt$MarkdownText$markwon$1$1", "Lio/noties/markwon/AbstractMarkwonPlugin;", "configureConfiguration", "", "builder", "Lio/noties/markwon/MarkwonConfiguration$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class MarkdownTextKt$MarkdownText$markwon$1$1 extends AbstractMarkwonPlugin {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<String, Unit> $onImageClick;

    /* JADX WARN: Multi-variable type inference failed */
    MarkdownTextKt$MarkdownText$markwon$1$1(Function1<? super String, Unit> function1, Context $context) {
        this.$onImageClick = function1;
        this.$context = $context;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureConfiguration(MarkwonConfiguration.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        final Function1<String, Unit> function1 = this.$onImageClick;
        final Context context = this.$context;
        builder.linkResolver(new LinkResolver() { // from class: com.yhchat.canarys.ui.components.MarkdownTextKt$MarkdownText$markwon$1$1$$ExternalSyntheticLambda0
            @Override // io.noties.markwon.LinkResolver
            public final void resolve(View view, String str) {
                MarkdownTextKt$MarkdownText$markwon$1$1.configureConfiguration$lambda$0(function1, context, view, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureConfiguration$lambda$0(Function1 $onImageClick, Context $context, View view, String link) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(link, "link");
        if ($onImageClick != null && (StringsKt.endsWith$default(link, ".jpg", false, 2, (Object) null) || StringsKt.endsWith$default(link, ".jpeg", false, 2, (Object) null) || StringsKt.endsWith$default(link, ".png", false, 2, (Object) null) || StringsKt.endsWith$default(link, ".gif", false, 2, (Object) null) || StringsKt.endsWith$default(link, ".webp", false, 2, (Object) null))) {
            $onImageClick.invoke(link);
            return;
        }
        if (YunhuLinkHandler.INSTANCE.containsYunhuLink(link)) {
            YunhuLinkHandler.INSTANCE.handleYunhuLink($context, link);
            return;
        }
        if (ChatAddLinkHandler.INSTANCE.isChatAddLink(link)) {
            ChatAddLinkHandler.INSTANCE.handleLink($context, link);
            return;
        }
        if (UnifiedLinkHandler.INSTANCE.isHandleableLink(link)) {
            UnifiedLinkHandler.INSTANCE.handleLink($context, link);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(link));
            $context.startActivity(intent);
        } catch (Exception e) {
            Toast.makeText($context, "\u65e0\u6cd5\u6253\u5f00\u94fe\u63a5", 0).show();
        }
    }
}
