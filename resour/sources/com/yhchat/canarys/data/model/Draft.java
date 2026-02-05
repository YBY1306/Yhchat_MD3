package com.yhchat.canarys.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Draft.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\nH\u00c6\u0003J\t\u0010!\u001a\u00020\fH\u00c6\u0003J\t\u0010\"\u001a\u00020\fH\u00c6\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u00c6\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u0007H\u00d6\u0001J\t\u0010'\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019\u00a8\u0006("}, m169d2 = {"Lcom/yhchat/canarys/data/model/Draft;", "", Name.MARK, "", "title", "content", "boardId", "", "boardName", "isMarkdownMode", "", "createTime", "", "updateTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZJJ)V", "getId", "()Ljava/lang/String;", "getTitle", "getContent", "getBoardId", "()I", "getBoardName", "()Z", "getCreateTime", "()J", "getUpdateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Draft {
    public static final int $stable = 0;
    private final int boardId;
    private final String boardName;
    private final String content;
    private final long createTime;
    private final String id;
    private final boolean isMarkdownMode;
    private final String title;
    private final long updateTime;

    public static /* synthetic */ Draft copy$default(Draft draft, String str, String str2, String str3, int i, String str4, boolean z, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = draft.id;
        }
        if ((i2 & 2) != 0) {
            str2 = draft.title;
        }
        if ((i2 & 4) != 0) {
            str3 = draft.content;
        }
        if ((i2 & 8) != 0) {
            i = draft.boardId;
        }
        if ((i2 & 16) != 0) {
            str4 = draft.boardName;
        }
        if ((i2 & 32) != 0) {
            z = draft.isMarkdownMode;
        }
        if ((i2 & 64) != 0) {
            j = draft.createTime;
        }
        if ((i2 & 128) != 0) {
            j2 = draft.updateTime;
        }
        long j3 = j2;
        long j4 = j;
        String str5 = str4;
        boolean z2 = z;
        return draft.copy(str, str2, str3, i, str5, z2, j4, j3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBoardId() {
        return this.boardId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBoardName() {
        return this.boardName;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsMarkdownMode() {
        return this.isMarkdownMode;
    }

    /* renamed from: component7, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component8, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final Draft copy(String id, String title, String content, int boardId, String boardName, boolean isMarkdownMode, long createTime, long updateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        return new Draft(id, title, content, boardId, boardName, isMarkdownMode, createTime, updateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Draft)) {
            return false;
        }
        Draft draft = (Draft) other;
        return Intrinsics.areEqual(this.id, draft.id) && Intrinsics.areEqual(this.title, draft.title) && Intrinsics.areEqual(this.content, draft.content) && this.boardId == draft.boardId && Intrinsics.areEqual(this.boardName, draft.boardName) && this.isMarkdownMode == draft.isMarkdownMode && this.createTime == draft.createTime && this.updateTime == draft.updateTime;
    }

    public int hashCode() {
        return (((((((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.boardId)) * 31) + this.boardName.hashCode()) * 31) + Boolean.hashCode(this.isMarkdownMode)) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.updateTime);
    }

    public String toString() {
        return "Draft(id=" + this.id + ", title=" + this.title + ", content=" + this.content + ", boardId=" + this.boardId + ", boardName=" + this.boardName + ", isMarkdownMode=" + this.isMarkdownMode + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ")";
    }

    public Draft(String id, String title, String content, int boardId, String boardName, boolean isMarkdownMode, long createTime, long updateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        this.id = id;
        this.title = title;
        this.content = content;
        this.boardId = boardId;
        this.boardName = boardName;
        this.isMarkdownMode = isMarkdownMode;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getBoardId() {
        return this.boardId;
    }

    public final String getBoardName() {
        return this.boardName;
    }

    public final boolean isMarkdownMode() {
        return this.isMarkdownMode;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }
}
