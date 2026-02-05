package com.yhchat.canarys.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.yhchat.canarys.data.local.SecureTokenStorage;
import com.yhchat.canarys.p007ui.community.BoardDetailActivity;
import com.yhchat.canarys.p007ui.community.PostDetailActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: YunhuLinkHandler.kt */
@Metadata(m168d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000eJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00182\u0006\u0010\u0013\u001a\u00020\u000eJ\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0015J\u0016\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/util/YunhuLinkHandler;", "", "<init>", "()V", "YUNHU_LINK_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "ALLEY_DETAIL_PATTERN", "WEB_ARTICLE_PATTERN", "handleYunhuLink", "", "context", "Landroid/content/Context;", "link", "", "makeLinksClickable", "", "textView", "Landroid/widget/TextView;", "text", "linkColor", "", "containsYunhuLink", "extractYunhuLinks", "", "extractPostIdFromLink", "(Ljava/lang/String;)Ljava/lang/Integer;", "generateYunhuLink", "postId", "handleIntentData", "intent", "Landroid/content/Intent;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes4.dex */
public final class YunhuLinkHandler {
    public static final YunhuLinkHandler INSTANCE = new YunhuLinkHandler();
    private static final Pattern YUNHU_LINK_PATTERN = Pattern.compile("yunhu://post-detail\\?id=(\\d+)");
    private static final Pattern ALLEY_DETAIL_PATTERN = Pattern.compile("yunhu://alley-detail\\?id=(\\d+)");
    private static final Pattern WEB_ARTICLE_PATTERN = Pattern.compile("https://www\\.yhchat\\.com/c/p/(\\d+)");
    public static final int $stable = 8;

    private YunhuLinkHandler() {
    }

    public final boolean handleYunhuLink(Context context, String link) {
        String token = "";
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            String userToken = new SecureTokenStorage(context).getUserToken();
            if (userToken != null) {
                token = userToken;
            }
        } catch (Exception e) {
        }
        Matcher yunhuMatcher = YUNHU_LINK_PATTERN.matcher(link);
        if (yunhuMatcher.find()) {
            String strGroup = yunhuMatcher.group(1);
            Integer postId = strGroup != null ? StringsKt.toIntOrNull(strGroup) : null;
            if (postId != null) {
                Intent intent = new Intent(context, (Class<?>) PostDetailActivity.class);
                intent.putExtra("post_id", postId.intValue());
                intent.putExtra("post_title", "\u6587\u7ae0\u8be6\u60c5");
                intent.putExtra("token", token);
                context.startActivity(intent);
                return true;
            }
        }
        Matcher alleyMatcher = ALLEY_DETAIL_PATTERN.matcher(link);
        if (alleyMatcher.find()) {
            String strGroup2 = alleyMatcher.group(1);
            Integer boardId = strGroup2 != null ? StringsKt.toIntOrNull(strGroup2) : null;
            if (boardId != null) {
                Intent intent2 = new Intent(context, (Class<?>) BoardDetailActivity.class);
                intent2.putExtra("board_id", boardId.intValue());
                intent2.putExtra("board_name", "\u5206\u533a\u8be6\u60c5");
                intent2.putExtra("token", token);
                context.startActivity(intent2);
                return true;
            }
        }
        Matcher webMatcher = WEB_ARTICLE_PATTERN.matcher(link);
        if (webMatcher.find()) {
            String strGroup3 = webMatcher.group(1);
            Integer postId2 = strGroup3 != null ? StringsKt.toIntOrNull(strGroup3) : null;
            if (postId2 != null) {
                Intent intent3 = new Intent(context, (Class<?>) PostDetailActivity.class);
                intent3.putExtra("post_id", postId2.intValue());
                intent3.putExtra("post_title", "\u6587\u7ae0\u8be6\u60c5");
                intent3.putExtra("token", token);
                context.startActivity(intent3);
                return true;
            }
            return false;
        }
        return false;
    }

    public static /* synthetic */ void makeLinksClickable$default(YunhuLinkHandler yunhuLinkHandler, TextView textView, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -16776961;
        }
        yunhuLinkHandler.makeLinksClickable(textView, str, i);
    }

    public final void makeLinksClickable(TextView textView, String text, int linkColor) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(text, "text");
        SpannableStringBuilder spannable = new SpannableStringBuilder(text);
        Matcher yunhuMatcher = YUNHU_LINK_PATTERN.matcher(text);
        while (yunhuMatcher.find()) {
            int start = yunhuMatcher.start();
            int end = yunhuMatcher.end();
            final String link = yunhuMatcher.group();
            spannable.setSpan(new ClickableSpan() { // from class: com.yhchat.canarys.util.YunhuLinkHandler$makeLinksClickable$clickableSpan$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    YunhuLinkHandler yunhuLinkHandler = YunhuLinkHandler.INSTANCE;
                    Context context = widget.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    String str = link;
                    Intrinsics.checkNotNull(str);
                    yunhuLinkHandler.handleYunhuLink(context, str);
                }
            }, start, end, 33);
            spannable.setSpan(new ForegroundColorSpan(linkColor), start, end, 33);
        }
        Matcher alleyMatcher = ALLEY_DETAIL_PATTERN.matcher(text);
        while (alleyMatcher.find()) {
            int start2 = alleyMatcher.start();
            int end2 = alleyMatcher.end();
            final String link2 = alleyMatcher.group();
            spannable.setSpan(new ClickableSpan() { // from class: com.yhchat.canarys.util.YunhuLinkHandler$makeLinksClickable$clickableSpan$2
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    YunhuLinkHandler yunhuLinkHandler = YunhuLinkHandler.INSTANCE;
                    Context context = widget.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    String str = link2;
                    Intrinsics.checkNotNull(str);
                    yunhuLinkHandler.handleYunhuLink(context, str);
                }
            }, start2, end2, 33);
            spannable.setSpan(new ForegroundColorSpan(linkColor), start2, end2, 33);
        }
        Matcher webMatcher = WEB_ARTICLE_PATTERN.matcher(text);
        while (webMatcher.find()) {
            int start3 = webMatcher.start();
            int end3 = webMatcher.end();
            final String link3 = webMatcher.group();
            spannable.setSpan(new ClickableSpan() { // from class: com.yhchat.canarys.util.YunhuLinkHandler$makeLinksClickable$clickableSpan$3
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    YunhuLinkHandler yunhuLinkHandler = YunhuLinkHandler.INSTANCE;
                    Context context = widget.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    String str = link3;
                    Intrinsics.checkNotNull(str);
                    yunhuLinkHandler.handleYunhuLink(context, str);
                }
            }, start3, end3, 33);
            spannable.setSpan(new ForegroundColorSpan(linkColor), start3, end3, 33);
        }
        textView.setText(spannable);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final boolean containsYunhuLink(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return YUNHU_LINK_PATTERN.matcher(text).find() || ALLEY_DETAIL_PATTERN.matcher(text).find() || WEB_ARTICLE_PATTERN.matcher(text).find();
    }

    public final List<String> extractYunhuLinks(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        List links = new ArrayList();
        Matcher yunhuMatcher = YUNHU_LINK_PATTERN.matcher(text);
        while (yunhuMatcher.find()) {
            String strGroup = yunhuMatcher.group();
            Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
            links.add(strGroup);
        }
        Matcher alleyMatcher = ALLEY_DETAIL_PATTERN.matcher(text);
        while (alleyMatcher.find()) {
            String strGroup2 = alleyMatcher.group();
            Intrinsics.checkNotNullExpressionValue(strGroup2, "group(...)");
            links.add(strGroup2);
        }
        Matcher webMatcher = WEB_ARTICLE_PATTERN.matcher(text);
        while (webMatcher.find()) {
            String strGroup3 = webMatcher.group();
            Intrinsics.checkNotNullExpressionValue(strGroup3, "group(...)");
            links.add(strGroup3);
        }
        return links;
    }

    public final Integer extractPostIdFromLink(String link) {
        String strGroup;
        Intrinsics.checkNotNullParameter(link, "link");
        Matcher yunhuMatcher = YUNHU_LINK_PATTERN.matcher(link);
        if (yunhuMatcher.find()) {
            String strGroup2 = yunhuMatcher.group(1);
            if (strGroup2 != null) {
                return StringsKt.toIntOrNull(strGroup2);
            }
            return null;
        }
        Matcher alleyMatcher = ALLEY_DETAIL_PATTERN.matcher(link);
        if (alleyMatcher.find()) {
            String strGroup3 = alleyMatcher.group(1);
            if (strGroup3 != null) {
                return StringsKt.toIntOrNull(strGroup3);
            }
            return null;
        }
        Matcher webMatcher = WEB_ARTICLE_PATTERN.matcher(link);
        if (!webMatcher.find() || (strGroup = webMatcher.group(1)) == null) {
            return null;
        }
        return StringsKt.toIntOrNull(strGroup);
    }

    public final String generateYunhuLink(int postId) {
        return "yunhu://post-detail?id=" + postId;
    }

    public final boolean handleIntentData(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Uri data = intent.getData();
        if (data != null && Intrinsics.areEqual(data.getScheme(), "yunhu")) {
            String link = data.toString();
            Intrinsics.checkNotNullExpressionValue(link, "toString(...)");
            return handleYunhuLink(context, link);
        }
        return false;
    }
}
