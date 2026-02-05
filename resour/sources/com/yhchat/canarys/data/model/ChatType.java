package com.yhchat.canarys.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, m169d2 = {"Lcom/yhchat/canarys/data/model/ChatType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "USER", "GROUP", "BOT", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public enum ChatType {
    USER(1),
    GROUP(2),
    BOT(3);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<ChatType> getEntries() {
        return $ENTRIES;
    }

    ChatType(int value) {
        this.value = value;
    }

    public final int getValue() {
        return this.value;
    }
}
