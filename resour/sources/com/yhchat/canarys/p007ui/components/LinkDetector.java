package com.yhchat.canarys.p007ui.components;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkText.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\t\u001a\u00020\nR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, m169d2 = {"Lcom/yhchat/canarys/ui/components/LinkDetector;", "", "<init>", "()V", "urlPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "containsLink", "", "text", "", "extractLinks", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class LinkDetector {
    public static final LinkDetector INSTANCE = new LinkDetector();
    private static final Pattern urlPattern = Pattern.compile("(https?://[^\\s\\u4e00-\\u9fff]+|yunhu://[^\\s\\u4e00-\\u9fff]*)", 2);
    public static final int $stable = 8;

    private LinkDetector() {
    }

    public final boolean containsLink(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return urlPattern.matcher(text).find();
    }

    public final List<String> extractLinks(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        List links = new ArrayList();
        Matcher matcher = urlPattern.matcher(text);
        while (matcher.find()) {
            String url = matcher.group();
            Intrinsics.checkNotNull(url);
            links.add(url);
        }
        return links;
    }
}
