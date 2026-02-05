package com.yhchat.canarys.data.repository;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yhchat.canarys.data.model.Draft;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DraftRepository.kt */
@Metadata(m168d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J&\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u0006\u0010\u001e\u001a\u00020\u000fJ\u0006\u0010\u001f\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/DraftRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "gson", "Lcom/google/gson/Gson;", "saveDraft", "", "title", "content", "boardId", "", "boardName", "isMarkdownMode", "", "updateDraft", "draftId", "getDrafts", "", "Lcom/yhchat/canarys/data/model/Draft;", "getDraftById", "deleteDraft", "clearAllDrafts", "", "saveDrafts", "drafts", "getDraftCount", "hasDrafts", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class DraftRepository {
    private static final String DRAFTS_KEY = "drafts_list";
    private final Context context;
    private final Gson gson;
    private final SharedPreferences sharedPreferences;
    public static final int $stable = 8;

    public DraftRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        SharedPreferences sharedPreferences = this.context.getSharedPreferences("drafts", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferences = sharedPreferences;
        this.gson = new Gson();
    }

    public final String saveDraft(String title, String content, int boardId, String boardName, boolean isMarkdownMode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        List drafts = CollectionsKt.toMutableList((Collection) getDrafts());
        String draftId = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(draftId, "toString(...)");
        long currentTime = System.currentTimeMillis();
        Draft draft = new Draft(draftId, title, content, boardId, boardName, isMarkdownMode, currentTime, currentTime);
        drafts.add(0, draft);
        saveDrafts(drafts);
        return draftId;
    }

    public final boolean updateDraft(String draftId, String title, String content, boolean isMarkdownMode) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        List drafts = CollectionsKt.toMutableList((Collection) getDrafts());
        int i = 0;
        Iterator<Draft> it = drafts.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(((Draft) it.next()).getId(), draftId)) {
                break;
            }
            i++;
        }
        int index = i;
        if (index == -1) {
            return false;
        }
        Draft oldDraft = drafts.get(index);
        Draft updatedDraft = Draft.copy$default(oldDraft, null, title, content, 0, null, isMarkdownMode, 0L, System.currentTimeMillis(), 89, null);
        drafts.set(index, updatedDraft);
        drafts.remove(index);
        drafts.add(0, updatedDraft);
        saveDrafts(drafts);
        return true;
    }

    public final List<Draft> getDrafts() {
        String draftsJson = this.sharedPreferences.getString(DRAFTS_KEY, null);
        if (draftsJson != null) {
            try {
                Type type = new TypeToken<List<? extends Draft>>() { // from class: com.yhchat.canarys.data.repository.DraftRepository$getDrafts$type$1
                }.getType();
                List<Draft> list = (List) this.gson.fromJson(draftsJson, type);
                return list == null ? CollectionsKt.emptyList() : list;
            } catch (Exception e) {
                return CollectionsKt.emptyList();
            }
        }
        return CollectionsKt.emptyList();
    }

    public final Draft getDraftById(String draftId) {
        Object next;
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Iterator<T> it = getDrafts().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Draft) next).getId(), draftId)) {
                break;
            }
        }
        return (Draft) next;
    }

    public final boolean deleteDraft(final String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        List drafts = CollectionsKt.toMutableList((Collection) getDrafts());
        boolean removed = CollectionsKt.removeAll(drafts, new Function1() { // from class: com.yhchat.canarys.data.repository.DraftRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DraftRepository.deleteDraft$lambda$0(draftId, (Draft) obj));
            }
        });
        if (removed) {
            saveDrafts(drafts);
        }
        return removed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deleteDraft$lambda$0(String $draftId, Draft it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getId(), $draftId);
    }

    public final void clearAllDrafts() {
        this.sharedPreferences.edit().remove(DRAFTS_KEY).apply();
    }

    private final void saveDrafts(List<Draft> drafts) {
        String draftsJson = this.gson.toJson(drafts);
        this.sharedPreferences.edit().putString(DRAFTS_KEY, draftsJson).apply();
    }

    public final int getDraftCount() {
        return getDrafts().size();
    }

    public final boolean hasDrafts() {
        return getDraftCount() > 0;
    }
}
