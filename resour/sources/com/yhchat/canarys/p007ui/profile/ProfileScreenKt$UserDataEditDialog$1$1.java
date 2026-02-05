package com.yhchat.canarys.p007ui.profile;

import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.UserData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProfileScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.ProfileScreenKt$UserDataEditDialog$1$1", m185f = "ProfileScreen.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes16.dex */
final class ProfileScreenKt$UserDataEditDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $birthday$delegate;
    final /* synthetic */ MutableState<String> $city$delegate;
    final /* synthetic */ MutableState<String> $district$delegate;
    final /* synthetic */ MutableState<String> $gender$delegate;
    final /* synthetic */ MutableState<String> $introduction$delegate;
    final /* synthetic */ MutableState<String> $locationCode$delegate;
    final /* synthetic */ MutableState<String> $province$delegate;
    final /* synthetic */ UserDataState $userDataState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileScreenKt$UserDataEditDialog$1$1(UserDataState userDataState, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, MutableState<String> mutableState7, Continuation<? super ProfileScreenKt$UserDataEditDialog$1$1> continuation) {
        super(2, continuation);
        this.$userDataState = userDataState;
        this.$introduction$delegate = mutableState;
        this.$gender$delegate = mutableState2;
        this.$birthday$delegate = mutableState3;
        this.$province$delegate = mutableState4;
        this.$city$delegate = mutableState5;
        this.$district$delegate = mutableState6;
        this.$locationCode$delegate = mutableState7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileScreenKt$UserDataEditDialog$1$1(this.$userDataState, this.$introduction$delegate, this.$gender$delegate, this.$birthday$delegate, this.$province$delegate, this.$city$delegate, this.$district$delegate, this.$locationCode$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileScreenKt$UserDataEditDialog$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                UserData data = this.$userDataState.getUserData();
                if (data != null) {
                    MutableState<String> mutableState = this.$introduction$delegate;
                    String introduction = data.getIntroduction();
                    if (introduction == null) {
                        introduction = "";
                    }
                    mutableState.setValue(introduction);
                    MutableState<String> mutableState2 = this.$gender$delegate;
                    Integer gender = data.getGender();
                    mutableState2.setValue(String.valueOf(gender != null ? gender.intValue() : 3));
                    MutableState<String> mutableState3 = this.$birthday$delegate;
                    Long birthday = data.getBirthday();
                    mutableState3.setValue(String.valueOf(birthday != null ? birthday.longValue() : 0L));
                    MutableState<String> mutableState4 = this.$province$delegate;
                    String province = data.getProvince();
                    if (province == null) {
                        province = "";
                    }
                    mutableState4.setValue(province);
                    MutableState<String> mutableState5 = this.$city$delegate;
                    String city = data.getCity();
                    if (city == null) {
                        city = "";
                    }
                    mutableState5.setValue(city);
                    MutableState<String> mutableState6 = this.$district$delegate;
                    String district = data.getDistrict();
                    if (district == null) {
                        district = "";
                    }
                    mutableState6.setValue(district);
                    MutableState<String> mutableState7 = this.$locationCode$delegate;
                    String locationCode = data.getLocationCode();
                    mutableState7.setValue(locationCode != null ? locationCode : "");
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
