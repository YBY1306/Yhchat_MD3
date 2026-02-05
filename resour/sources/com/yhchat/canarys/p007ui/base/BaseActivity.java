package com.yhchat.canarys.p007ui.base;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import kotlin.Metadata;

/* compiled from: BaseActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0014\u00a8\u0006\n"}, m169d2 = {"Lcom/yhchat/canarys/ui/base/BaseActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "applyFontScale", "onResume", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseActivity extends ComponentActivity {
    public static final int $stable = 8;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        applyFontScale();
        super.onCreate(savedInstanceState);
    }

    private final void applyFontScale() {
        SharedPreferences prefs = getSharedPreferences("display_settings", 0);
        float fontScale = prefs.getFloat("font_scale", 100.0f);
        float scaleFactor = fontScale / 100.0f;
        Configuration configuration = getResources().getConfiguration();
        configuration.fontScale = scaleFactor;
        getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        applyFontScale();
    }
}
