package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Expression.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0005J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\bH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010\u00a8\u0006#"}, m169d2 = {"Lcom/yhchat/canarys/data/model/Expression;", "", Name.MARK, "", "url", "", "urlOriginal", "delFlag", "", "createTime", "createBy", "<init>", "(JLjava/lang/String;Ljava/lang/String;IJLjava/lang/String;)V", "getId", "()J", "getUrl", "()Ljava/lang/String;", "getUrlOriginal", "getDelFlag", "()I", "getCreateTime", "getCreateBy", "getFullUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Expression {
    public static final int $stable = 0;

    @SerializedName("createBy")
    private final String createBy;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("delFlag")
    private final int delFlag;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName("url")
    private final String url;

    @SerializedName("urlOriginal")
    private final String urlOriginal;

    public static /* synthetic */ Expression copy$default(Expression expression, long j, String str, String str2, int i, long j2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = expression.id;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            str = expression.url;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = expression.urlOriginal;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            i = expression.delFlag;
        }
        return expression.copy(j3, str4, str5, i, (i2 & 16) != 0 ? expression.createTime : j2, (i2 & 32) != 0 ? expression.createBy : str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrlOriginal() {
        return this.urlOriginal;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDelFlag() {
        return this.delFlag;
    }

    /* renamed from: component5, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCreateBy() {
        return this.createBy;
    }

    public final Expression copy(long j, String url, String urlOriginal, int delFlag, long createTime, String createBy) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(urlOriginal, "urlOriginal");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        return new Expression(j, url, urlOriginal, delFlag, createTime, createBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Expression)) {
            return false;
        }
        Expression expression = (Expression) other;
        return this.id == expression.id && Intrinsics.areEqual(this.url, expression.url) && Intrinsics.areEqual(this.urlOriginal, expression.urlOriginal) && this.delFlag == expression.delFlag && this.createTime == expression.createTime && Intrinsics.areEqual(this.createBy, expression.createBy);
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.id) * 31) + this.url.hashCode()) * 31) + this.urlOriginal.hashCode()) * 31) + Integer.hashCode(this.delFlag)) * 31) + Long.hashCode(this.createTime)) * 31) + this.createBy.hashCode();
    }

    public String toString() {
        return "Expression(id=" + this.id + ", url=" + this.url + ", urlOriginal=" + this.urlOriginal + ", delFlag=" + this.delFlag + ", createTime=" + this.createTime + ", createBy=" + this.createBy + ")";
    }

    public Expression(long id, String url, String urlOriginal, int delFlag, long createTime, String createBy) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(urlOriginal, "urlOriginal");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        this.id = id;
        this.url = url;
        this.urlOriginal = urlOriginal;
        this.delFlag = delFlag;
        this.createTime = createTime;
        this.createBy = createBy;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Expression(long j, String str, String str2, int i, long j2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        if ((i2 & 8) == 0) {
            i3 = i;
        } else {
            i3 = 0;
        }
        this(j, str, str2, i3, j2, str3);
    }

    public final long getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrlOriginal() {
        return this.urlOriginal;
    }

    public final int getDelFlag() {
        return this.delFlag;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getCreateBy() {
        return this.createBy;
    }

    public final String getFullUrl() {
        if (StringsKt.startsWith$default(this.url, "http", false, 2, (Object) null)) {
            return this.url;
        }
        return "https://chat-img.jwznb.com/" + this.url;
    }
}
