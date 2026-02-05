package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0018"}, m169d2 = {"Lcom/yhchat/canarys/data/model/Tag;", "", Name.MARK, "", "text", "", "color", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getText", "()Ljava/lang/String;", "getColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Tag {
    public static final int $stable = 0;

    @SerializedName("color")
    private final String color;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName("text")
    private final String text;

    public static /* synthetic */ Tag copy$default(Tag tag, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tag.id;
        }
        if ((i & 2) != 0) {
            str = tag.text;
        }
        if ((i & 4) != 0) {
            str2 = tag.color;
        }
        return tag.copy(j, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public final Tag copy(long id, String text, String color) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        return new Tag(id, text, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) other;
        return this.id == tag.id && Intrinsics.areEqual(this.text, tag.text) && Intrinsics.areEqual(this.color, tag.color);
    }

    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.text.hashCode()) * 31) + this.color.hashCode();
    }

    public String toString() {
        return "Tag(id=" + this.id + ", text=" + this.text + ", color=" + this.color + ")";
    }

    public Tag(long id, String text, String color) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public final long getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final String getColor() {
        return this.color;
    }
}
