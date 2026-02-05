package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.yhchat.canarys.utils.UnifiedLinkHandler;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.LinkResolver;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, m169d2 = {"com/yhchat/canarys/ui/community/PostDetailActivityKt$MarkdownContent$1$1$1$markwon$1", "Lio/noties/markwon/AbstractMarkwonPlugin;", "configureConfiguration", "", "builder", "Lio/noties/markwon/MarkwonConfiguration$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class PostDetailActivityKt$MarkdownContent$1$1$1$markwon$1 extends AbstractMarkwonPlugin {
    final /* synthetic */ Context $ctx;

    PostDetailActivityKt$MarkdownContent$1$1$1$markwon$1(Context $ctx) {
        this.$ctx = $ctx;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureConfiguration(MarkwonConfiguration.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        final Context context = this.$ctx;
        builder.linkResolver(new LinkResolver() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$MarkdownContent$1$1$1$markwon$1$$ExternalSyntheticLambda0
            @Override // io.noties.markwon.LinkResolver
            public final void resolve(View view, String str) {
                PostDetailActivityKt$MarkdownContent$1$1$1$markwon$1.configureConfiguration$lambda$0(context, view, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureConfiguration$lambda$0(Context $ctx, View view, String link) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(link, "link");
        if (UnifiedLinkHandler.INSTANCE.isHandleableLink(link)) {
            UnifiedLinkHandler.INSTANCE.handleLink($ctx, link);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(link));
            $ctx.startActivity(intent);
        } catch (Exception e) {
            Toast.makeText($ctx, "\u65e0\u6cd5\u6253\u5f00\u94fe\u63a5", 0).show();
        }
    }
}
