package com.yhchat.canarys.p007ui.components;

import androidx.autofill.HintConstants;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AccessTimeKt;
import androidx.compose.material.icons.filled.AccountCircleKt;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material.icons.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.ArrowForwardKt;
import androidx.compose.material.icons.filled.AttachFileKt;
import androidx.compose.material.icons.filled.CallKt;
import androidx.compose.material.icons.filled.CancelKt;
import androidx.compose.material.icons.filled.ChatBubbleKt;
import androidx.compose.material.icons.filled.ChatBubbleOutlineKt;
import androidx.compose.material.icons.filled.ChatKt;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material.icons.filled.DoneAllKt;
import androidx.compose.material.icons.filled.DoneKt;
import androidx.compose.material.icons.filled.DownloadKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material.icons.filled.ErrorKt;
import androidx.compose.material.icons.filled.ExploreKt;
import androidx.compose.material.icons.filled.FaceKt;
import androidx.compose.material.icons.filled.FavoriteKt;
import androidx.compose.material.icons.filled.FilePresentKt;
import androidx.compose.material.icons.filled.ForumKt;
import androidx.compose.material.icons.filled.GroupKt;
import androidx.compose.material.icons.filled.GroupsKt;
import androidx.compose.material.icons.filled.HelpKt;
import androidx.compose.material.icons.filled.HomeKt;
import androidx.compose.material.icons.filled.ImageKt;
import androidx.compose.material.icons.filled.InfoKt;
import androidx.compose.material.icons.filled.LanguageKt;
import androidx.compose.material.icons.filled.LocationOnKt;
import androidx.compose.material.icons.filled.ManageAccountsKt;
import androidx.compose.material.icons.filled.MenuKt;
import androidx.compose.material.icons.filled.MessageKt;
import androidx.compose.material.icons.filled.MoreHorizKt;
import androidx.compose.material.icons.filled.MoreVertKt;
import androidx.compose.material.icons.filled.MusicNoteKt;
import androidx.compose.material.icons.filled.PeopleKt;
import androidx.compose.material.icons.filled.PersonAddKt;
import androidx.compose.material.icons.filled.PersonKt;
import androidx.compose.material.icons.filled.PersonRemoveKt;
import androidx.compose.material.icons.filled.PhoneKt;
import androidx.compose.material.icons.filled.PhotoKt;
import androidx.compose.material.icons.filled.PublicKt;
import androidx.compose.material.icons.filled.QuestionMarkKt;
import androidx.compose.material.icons.filled.ScheduleKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material.icons.filled.SendKt;
import androidx.compose.material.icons.filled.SettingsKt;
import androidx.compose.material.icons.filled.ShareKt;
import androidx.compose.material.icons.filled.SmsKt;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material.icons.filled.ThumbUpKt;
import androidx.compose.material.icons.filled.TrendingUpKt;
import androidx.compose.material.icons.filled.UploadKt;
import androidx.compose.material.icons.filled.VideoCallKt;
import androidx.compose.material.icons.filled.VideoLibraryKt;
import androidx.compose.material.icons.filled.WarningKt;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IconSelector.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u0007J \u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052\u0006\u0010\u0019\u001a\u00020\u0007R#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\n\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/ui/components/IconSelector;", "", "<init>", "()V", "chatIcons", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getChatIcons", "()Ljava/util/List;", "communityIcons", "getCommunityIcons", "userIcons", "getUserIcons", "functionIcons", "getFunctionIcons", "navigationIcons", "getNavigationIcons", "statusIcons", "getStatusIcons", "getAllIcons", "getIconByName", HintConstants.AUTOFILL_HINT_NAME, "searchIcons", "keyword", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class IconSelector {
    public static final IconSelector INSTANCE = new IconSelector();
    private static final List<Pair<String, ImageVector>> chatIcons = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m176to("Chat", ChatKt.getChat(Icons.Filled.INSTANCE)), TuplesKt.m176to("Forum", ForumKt.getForum(Icons.Filled.INSTANCE)), TuplesKt.m176to("Message", MessageKt.getMessage(Icons.Filled.INSTANCE)), TuplesKt.m176to("ChatBubble", ChatBubbleKt.getChatBubble(Icons.Filled.INSTANCE)), TuplesKt.m176to("ChatBubbleOutline", ChatBubbleOutlineKt.getChatBubbleOutline(Icons.Filled.INSTANCE)), TuplesKt.m176to("Sms", SmsKt.getSms(Icons.Filled.INSTANCE)), TuplesKt.m176to("Phone", PhoneKt.getPhone(Icons.Filled.INSTANCE)), TuplesKt.m176to("VideoCall", VideoCallKt.getVideoCall(Icons.Filled.INSTANCE)), TuplesKt.m176to("Call", CallKt.getCall(Icons.Filled.INSTANCE))});
    private static final List<Pair<String, ImageVector>> communityIcons = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m176to("People", PeopleKt.getPeople(Icons.Filled.INSTANCE)), TuplesKt.m176to("Group", GroupKt.getGroup(Icons.Filled.INSTANCE)), TuplesKt.m176to("Groups", GroupsKt.getGroups(Icons.Filled.INSTANCE)), TuplesKt.m176to("Public", PublicKt.getPublic(Icons.Filled.INSTANCE)), TuplesKt.m176to("Language", LanguageKt.getLanguage(Icons.Filled.INSTANCE)), TuplesKt.m176to("LocationOn", LocationOnKt.getLocationOn(Icons.Filled.INSTANCE)), TuplesKt.m176to("Home", HomeKt.getHome(Icons.Filled.INSTANCE)), TuplesKt.m176to("Explore", ExploreKt.getExplore(Icons.Filled.INSTANCE)), TuplesKt.m176to("TrendingUp", TrendingUpKt.getTrendingUp(Icons.Filled.INSTANCE)), TuplesKt.m176to("Star", StarKt.getStar(Icons.Filled.INSTANCE)), TuplesKt.m176to("Favorite", FavoriteKt.getFavorite(Icons.Filled.INSTANCE)), TuplesKt.m176to("ThumbUp", ThumbUpKt.getThumbUp(Icons.Filled.INSTANCE))});
    private static final List<Pair<String, ImageVector>> userIcons = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m176to("Person", PersonKt.getPerson(Icons.Filled.INSTANCE)), TuplesKt.m176to("AccountCircle", AccountCircleKt.getAccountCircle(Icons.Filled.INSTANCE)), TuplesKt.m176to("Face", FaceKt.getFace(Icons.Filled.INSTANCE)), TuplesKt.m176to("PersonAdd", PersonAddKt.getPersonAdd(Icons.Filled.INSTANCE)), TuplesKt.m176to("PersonRemove", PersonRemoveKt.getPersonRemove(Icons.Filled.INSTANCE)), TuplesKt.m176to("Settings", SettingsKt.getSettings(Icons.Filled.INSTANCE)), TuplesKt.m176to("ManageAccounts", ManageAccountsKt.getManageAccounts(Icons.Filled.INSTANCE))});
    private static final List<Pair<String, ImageVector>> functionIcons = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m176to("Search", SearchKt.getSearch(Icons.Filled.INSTANCE)), TuplesKt.m176to("Add", AddKt.getAdd(Icons.Filled.INSTANCE)), TuplesKt.m176to("Edit", EditKt.getEdit(Icons.Filled.INSTANCE)), TuplesKt.m176to("Delete", DeleteKt.getDelete(Icons.Filled.INSTANCE)), TuplesKt.m176to("Share", ShareKt.getShare(Icons.Filled.INSTANCE)), TuplesKt.m176to("Download", DownloadKt.getDownload(Icons.Filled.INSTANCE)), TuplesKt.m176to("Upload", UploadKt.getUpload(Icons.Filled.INSTANCE)), TuplesKt.m176to("Send", SendKt.getSend(Icons.Filled.INSTANCE)), TuplesKt.m176to("AttachFile", AttachFileKt.getAttachFile(Icons.Filled.INSTANCE)), TuplesKt.m176to("Image", ImageKt.getImage(Icons.Filled.INSTANCE)), TuplesKt.m176to("Photo", PhotoKt.getPhoto(Icons.Filled.INSTANCE)), TuplesKt.m176to("VideoLibrary", VideoLibraryKt.getVideoLibrary(Icons.Filled.INSTANCE)), TuplesKt.m176to("MusicNote", MusicNoteKt.getMusicNote(Icons.Filled.INSTANCE)), TuplesKt.m176to("FilePresent", FilePresentKt.getFilePresent(Icons.Filled.INSTANCE))});
    private static final List<Pair<String, ImageVector>> navigationIcons = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m176to("Home", HomeKt.getHome(Icons.Filled.INSTANCE)), TuplesKt.m176to("Menu", MenuKt.getMenu(Icons.Filled.INSTANCE)), TuplesKt.m176to("MoreVert", MoreVertKt.getMoreVert(Icons.Filled.INSTANCE)), TuplesKt.m176to("MoreHoriz", MoreHorizKt.getMoreHoriz(Icons.Filled.INSTANCE)), TuplesKt.m176to("ArrowBack", ArrowBackKt.getArrowBack(Icons.Filled.INSTANCE)), TuplesKt.m176to("ArrowForward", ArrowForwardKt.getArrowForward(Icons.Filled.INSTANCE)), TuplesKt.m176to("Close", CloseKt.getClose(Icons.Filled.INSTANCE)), TuplesKt.m176to("Check", CheckKt.getCheck(Icons.Filled.INSTANCE)), TuplesKt.m176to("Cancel", CancelKt.getCancel(Icons.Filled.INSTANCE))});
    private static final List<Pair<String, ImageVector>> statusIcons = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m176to("CheckCircle", CheckCircleKt.getCheckCircle(Icons.Filled.INSTANCE)), TuplesKt.m176to("Error", ErrorKt.getError(Icons.Filled.INSTANCE)), TuplesKt.m176to("Warning", WarningKt.getWarning(Icons.Filled.INSTANCE)), TuplesKt.m176to("Info", InfoKt.getInfo(Icons.Filled.INSTANCE)), TuplesKt.m176to("Help", HelpKt.getHelp(Icons.Filled.INSTANCE)), TuplesKt.m176to("QuestionMark", QuestionMarkKt.getQuestionMark(Icons.Filled.INSTANCE)), TuplesKt.m176to("Done", DoneKt.getDone(Icons.Filled.INSTANCE)), TuplesKt.m176to("DoneAll", DoneAllKt.getDoneAll(Icons.Filled.INSTANCE)), TuplesKt.m176to("Schedule", ScheduleKt.getSchedule(Icons.Filled.INSTANCE)), TuplesKt.m176to("AccessTime", AccessTimeKt.getAccessTime(Icons.Filled.INSTANCE))});
    public static final int $stable = 8;

    private IconSelector() {
    }

    public final List<Pair<String, ImageVector>> getChatIcons() {
        return chatIcons;
    }

    public final List<Pair<String, ImageVector>> getCommunityIcons() {
        return communityIcons;
    }

    public final List<Pair<String, ImageVector>> getUserIcons() {
        return userIcons;
    }

    public final List<Pair<String, ImageVector>> getFunctionIcons() {
        return functionIcons;
    }

    public final List<Pair<String, ImageVector>> getNavigationIcons() {
        return navigationIcons;
    }

    public final List<Pair<String, ImageVector>> getStatusIcons() {
        return statusIcons;
    }

    public final List<Pair<String, ImageVector>> getAllIcons() {
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) chatIcons, (Iterable) communityIcons), (Iterable) userIcons), (Iterable) functionIcons), (Iterable) navigationIcons), (Iterable) statusIcons);
    }

    public final ImageVector getIconByName(String name) {
        Object next;
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<T> it = getAllIcons().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Pair) next).getFirst(), name)) {
                break;
            }
        }
        Pair pair = (Pair) next;
        if (pair != null) {
            return (ImageVector) pair.getSecond();
        }
        return null;
    }

    public final List<Pair<String, ImageVector>> searchIcons(String keyword) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Iterable allIcons = getAllIcons();
        Collection arrayList = new ArrayList();
        for (Object obj : allIcons) {
            if (StringsKt.contains((CharSequence) ((Pair) obj).getFirst(), (CharSequence) keyword, true)) {
                arrayList.add(obj);
            }
        }
        return (List) arrayList;
    }
}
