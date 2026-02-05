package com.yhchat.canarys.p007ui.chat;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.AddCircleKt;
import androidx.compose.material.icons.filled.BlockKt;
import androidx.compose.material.icons.filled.ContentCopyKt;
import androidx.compose.material.icons.filled.ContentPasteKt;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material.icons.filled.DownloadKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material.icons.filled.FormatQuoteKt;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.material.icons.filled.MicKt;
import androidx.compose.material.icons.filled.MoreVertKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatScreen.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$ChatScreenKt {
    public static final ComposableSingletons$ChatScreenKt INSTANCE = new ComposableSingletons$ChatScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$489363014 = ComposableLambdaKt.composableLambdaInstance(489363014, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_489363014$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1323573722 = ComposableLambdaKt.composableLambdaInstance(1323573722, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_1323573722$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1883840003 = ComposableLambdaKt.composableLambdaInstance(1883840003, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda14
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_1883840003$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$593188194 = ComposableLambdaKt.composableLambdaInstance(593188194, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda17
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_593188194$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$510478772 = ComposableLambdaKt.composableLambdaInstance(510478772, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda18
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_510478772$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$983940786 = ComposableLambdaKt.composableLambdaInstance(983940786, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda19
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_983940786$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2017507011 = ComposableLambdaKt.composableLambdaInstance(2017507011, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda20
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_2017507011$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1757457450 */
    private static Function2<Composer, Integer, Unit> f893lambda$1757457450 = ComposableLambdaKt.composableLambdaInstance(-1757457450, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda21
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__1757457450$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1529319286 = ComposableLambdaKt.composableLambdaInstance(1529319286, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda23
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_1529319286$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1578670668 */
    private static Function3<RowScope, Composer, Integer, Unit> f891lambda$1578670668 = ComposableLambdaKt.composableLambdaInstance(-1578670668, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda24
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__1578670668$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1417060559 = ComposableLambdaKt.composableLambdaInstance(1417060559, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_1417060559$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-208689603 */
    private static Function2<Composer, Integer, Unit> f897lambda$208689603 = ComposableLambdaKt.composableLambdaInstance(-208689603, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda22
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__208689603$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1617010402 */
    private static Function3<RowScope, Composer, Integer, Unit> f892lambda$1617010402 = ComposableLambdaKt.composableLambdaInstance(-1617010402, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda25
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__1617010402$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1917768519 */
    private static Function2<Composer, Integer, Unit> f896lambda$1917768519 = ComposableLambdaKt.composableLambdaInstance(-1917768519, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda26
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__1917768519$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1455294021 = ComposableLambdaKt.composableLambdaInstance(1455294021, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda27
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_1455294021$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1897014730 = ComposableLambdaKt.composableLambdaInstance(1897014730, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda28
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_1897014730$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1455894162 */
    private static Function3<RowScope, Composer, Integer, Unit> f890lambda$1455894162 = ComposableLambdaKt.composableLambdaInstance(-1455894162, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda29
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__1455894162$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2130912179 = ComposableLambdaKt.composableLambdaInstance(2130912179, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda30
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_2130912179$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2055073618 = ComposableLambdaKt.composableLambdaInstance(2055073618, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda31
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_2055073618$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1979235057 = ComposableLambdaKt.composableLambdaInstance(1979235057, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_1979235057$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1903396496 = ComposableLambdaKt.composableLambdaInstance(1903396496, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_1903396496$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1827557935 = ComposableLambdaKt.composableLambdaInstance(1827557935, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_1827557935$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1947386313 = ComposableLambdaKt.composableLambdaInstance(1947386313, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_1947386313$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-96579508 */
    private static Function2<Composer, Integer, Unit> f899lambda$96579508 = ComposableLambdaKt.composableLambdaInstance(-96579508, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__96579508$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1602258819 = ComposableLambdaKt.composableLambdaInstance(1602258819, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_1602258819$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1488966883 = ComposableLambdaKt.composableLambdaInstance(1488966883, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_1488966883$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-795017860 */
    private static Function2<Composer, Integer, Unit> f898lambda$795017860 = ComposableLambdaKt.composableLambdaInstance(-795017860, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__795017860$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1826127710 */
    private static Function3<RowScope, Composer, Integer, Unit> f894lambda$1826127710 = ComposableLambdaKt.composableLambdaInstance(-1826127710, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__1826127710$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2034333988 = ComposableLambdaKt.composableLambdaInstance(2034333988, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda12
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_2034333988$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1619194601 = ComposableLambdaKt.composableLambdaInstance(1619194601, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_1619194601$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-189350704 */
    private static Function2<Composer, Integer, Unit> f895lambda$189350704 = ComposableLambdaKt.composableLambdaInstance(-189350704, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda15
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__189350704$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1520056762 = ComposableLambdaKt.composableLambdaInstance(1520056762, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda16
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_1520056762$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1455894162$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10638getLambda$1455894162$app_debug() {
        return f890lambda$1455894162;
    }

    /* renamed from: getLambda$-1578670668$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10639getLambda$1578670668$app_debug() {
        return f891lambda$1578670668;
    }

    /* renamed from: getLambda$-1617010402$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10640getLambda$1617010402$app_debug() {
        return f892lambda$1617010402;
    }

    /* renamed from: getLambda$-1757457450$app_debug */
    public final Function2<Composer, Integer, Unit> m10641getLambda$1757457450$app_debug() {
        return f893lambda$1757457450;
    }

    /* renamed from: getLambda$-1826127710$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10642getLambda$1826127710$app_debug() {
        return f894lambda$1826127710;
    }

    /* renamed from: getLambda$-189350704$app_debug */
    public final Function2<Composer, Integer, Unit> m10643getLambda$189350704$app_debug() {
        return f895lambda$189350704;
    }

    /* renamed from: getLambda$-1917768519$app_debug */
    public final Function2<Composer, Integer, Unit> m10644getLambda$1917768519$app_debug() {
        return f896lambda$1917768519;
    }

    /* renamed from: getLambda$-208689603$app_debug */
    public final Function2<Composer, Integer, Unit> m10645getLambda$208689603$app_debug() {
        return f897lambda$208689603;
    }

    /* renamed from: getLambda$-795017860$app_debug */
    public final Function2<Composer, Integer, Unit> m10646getLambda$795017860$app_debug() {
        return f898lambda$795017860;
    }

    /* renamed from: getLambda$-96579508$app_debug */
    public final Function2<Composer, Integer, Unit> m10647getLambda$96579508$app_debug() {
        return f899lambda$96579508;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1323573722$app_debug() {
        return lambda$1323573722;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1417060559$app_debug() {
        return lambda$1417060559;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1455294021$app_debug() {
        return lambda$1455294021;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1488966883$app_debug() {
        return lambda$1488966883;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1520056762$app_debug() {
        return lambda$1520056762;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1529319286$app_debug() {
        return lambda$1529319286;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1602258819$app_debug() {
        return lambda$1602258819;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1619194601$app_debug() {
        return lambda$1619194601;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1827557935$app_debug() {
        return lambda$1827557935;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1883840003$app_debug() {
        return lambda$1883840003;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1897014730$app_debug() {
        return lambda$1897014730;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1903396496$app_debug() {
        return lambda$1903396496;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1947386313$app_debug() {
        return lambda$1947386313;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1979235057$app_debug() {
        return lambda$1979235057;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2017507011$app_debug() {
        return lambda$2017507011;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2034333988$app_debug() {
        return lambda$2034333988;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2055073618$app_debug() {
        return lambda$2055073618;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2130912179$app_debug() {
        return lambda$2130912179;
    }

    public final Function2<Composer, Integer, Unit> getLambda$489363014$app_debug() {
        return lambda$489363014;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$510478772$app_debug() {
        return lambda$510478772;
    }

    public final Function2<Composer, Integer, Unit> getLambda$593188194$app_debug() {
        return lambda$593188194;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$983940786$app_debug() {
        return lambda$983940786;
    }

    public static final Unit lambda_489363014$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C488@18552L152:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(489363014, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$489363014.<anonymous> (ChatScreen.kt:488)");
            }
            IconKt.m2816Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "\u8fd4\u56de", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1323573722$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C505@19285L153:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1323573722, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1323573722.<anonymous> (ChatScreen.kt:505)");
            }
            IconKt.m2816Iconww6aTOc(MoreVertKt.getMoreVert(Icons.INSTANCE.getDefault()), "\u7528\u6237\u8be6\u60c5", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1883840003$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C520@20148L153:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1883840003, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1883840003.<anonymous> (ChatScreen.kt:520)");
            }
            IconKt.m2816Iconww6aTOc(MoreVertKt.getMoreVert(Icons.INSTANCE.getDefault()), "\u7fa4\u804a\u8be6\u60c5", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_593188194$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C537@20913L154:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(593188194, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$593188194.<anonymous> (ChatScreen.kt:537)");
            }
            IconKt.m2816Iconww6aTOc(MoreVertKt.getMoreVert(Icons.INSTANCE.getDefault()), "\u673a\u5668\u4eba\u4fe1\u606f", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_510478772$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C661@26084L10:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(510478772, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$510478772.<anonymous> (ChatScreen.kt:661)");
            }
            TextKt.m3359Text4IGK_g("\u5173\u95ed", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_983940786$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C847@35229L654:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(983940786, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$983940786.<anonymous> (ChatScreen.kt:847)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(32));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 542852301, "C855@35645L10,856@35725L11,853@35523L330:ChatScreen.kt#kdrqfv");
            TextKt.m3359Text4IGK_g("\u6682\u65e0\u6d88\u606f\n\u5f00\u59cb\u5bf9\u8bdd\u5427", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 6, 0, 65018);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_2017507011$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C892@37129L152:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2017507011, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$2017507011.<anonymous> (ChatScreen.kt:892)");
            }
            IconKt.m2816Iconww6aTOc(KeyboardArrowDownKt.getKeyboardArrowDown(Icons.INSTANCE.getDefault()), "\u56de\u5230\u6700\u65b0\u6d88\u606f", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1757457450$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1147@49473L136:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1757457450, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$-1757457450.<anonymous> (ChatScreen.kt:1147)");
            }
            IconKt.m2816Iconww6aTOc(MicKt.getMic(Icons.INSTANCE.getDefault()), "\u53d1\u9001\u8bed\u97f3", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1417060559$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1512@62987L12:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1417060559, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1417060559.<anonymous> (ChatScreen.kt:1512)");
            }
            TextKt.m3359Text4IGK_g("\u81ea\u7531\u590d\u5236", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1529319286$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1530@63725L10:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1529319286, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1529319286.<anonymous> (ChatScreen.kt:1530)");
            }
            TextKt.m3359Text4IGK_g("\u590d\u5236", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1578670668$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1535@63890L10:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1578670668, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$-1578670668.<anonymous> (ChatScreen.kt:1535)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1917768519$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1564@64517L10,1562@64442L111:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1917768519, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$-1917768519.<anonymous> (ChatScreen.kt:1562)");
            }
            TextKt.m3359Text4IGK_g("\u6d88\u606f\u64cd\u4f5c", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1455294021$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1581@65089L592:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1455294021, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1455294021.<anonymous> (ChatScreen.kt:1581)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1410591771, "C1586@65340L217,1591@65582L40,1592@65647L12:ChatScreen.kt#kdrqfv");
            IconKt.m2816Iconww6aTOc(ContentCopyKt.getContentCopy(Icons.INSTANCE.getDefault()), "\u590d\u5236\u5168\u90e8", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u590d\u5236\u5168\u90e8", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1897014730$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1602@65996L641:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1897014730, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1897014730.<anonymous> (ChatScreen.kt:1602)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -667926019, "C1607@66267L234,1612@66530L40,1613@66599L12:ChatScreen.kt#kdrqfv");
            IconKt.m2816Iconww6aTOc(ContentPasteKt.getContentPaste(Icons.INSTANCE.getDefault()), "\u81ea\u7531\u590d\u5236", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u81ea\u7531\u590d\u5236", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1455894162$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1623@66879L588:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1455894162, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$-1455894162.<anonymous> (ChatScreen.kt:1623)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1155927254, "C1628@67130L215,1633@67370L40,1634@67435L10:ChatScreen.kt#kdrqfv");
            IconKt.m2816Iconww6aTOc(FormatQuoteKt.getFormatQuote(Icons.INSTANCE.getDefault()), "\u5f15\u7528", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u5f15\u7528", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_2130912179$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1644@67812L629:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2130912179, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$2130912179.<anonymous> (ChatScreen.kt:1644)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 855570176, "C1649@68083L224,1654@68336L40,1655@68405L10:ChatScreen.kt#kdrqfv");
            IconKt.m2816Iconww6aTOc(EditKt.getEdit(Icons.INSTANCE.getDefault()), "\u7f16\u8f91", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u7f16\u8f91", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_2055073618$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1666@68799L638:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2055073618, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$2055073618.<anonymous> (ChatScreen.kt:1666)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 701797400, "C1671@69070L231,1676@69330L40,1677@69399L12:ChatScreen.kt#kdrqfv");
            IconKt.m2816Iconww6aTOc(AddCircleKt.getAddCircle(Icons.INSTANCE.getDefault()), "\u6dfb\u52a0\u8868\u60c5", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u6dfb\u52a0\u8868\u60c5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1979235057$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1688@69771L637:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1979235057, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1979235057.<anonymous> (ChatScreen.kt:1688)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 548024314, "C1693@70042L230,1698@70301L40,1699@70370L12:ChatScreen.kt#kdrqfv");
            IconKt.m2816Iconww6aTOc(DownloadKt.getDownload(Icons.INSTANCE.getDefault()), "\u4fdd\u5b58\u8bed\u97f3", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u4fdd\u5b58\u8bed\u97f3", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1903396496$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1710@70719L841:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1903396496, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1903396496.<anonymous> (ChatScreen.kt:1710)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 394257583, "C1718@71177L11,1715@70990L299,1721@71318L40,1724@71487L11,1722@71387L147:ChatScreen.kt#kdrqfv");
            IconKt.m2816Iconww6aTOc(BlockKt.getBlock(Icons.INSTANCE.getDefault()), "\u5c4f\u853d\u7528\u6237", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u5c4f\u853d\u7528\u6237", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131066);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1827557935$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1736@71857L838:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1827557935, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1827557935.<anonymous> (ChatScreen.kt:1736)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 240484435, "C1744@72314L11,1741@72128L298,1747@72455L40,1750@72622L11,1748@72524L145:ChatScreen.kt#kdrqfv");
            IconKt.m2816Iconww6aTOc(DeleteKt.getDelete(Icons.INSTANCE.getDefault()), "\u64a4\u56de", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u64a4\u56de", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131066);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__208689603$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-208689603, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$-208689603.<anonymous> (ChatScreen.kt:1757)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1617010402$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1760@72877L10:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1617010402, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$-1617010402.<anonymous> (ChatScreen.kt:1760)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1947386313$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1891@77900L10,1892@77969L11,1889@77810L300:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1947386313, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1947386313.<anonymous> (ChatScreen.kt:1889)");
            }
            TextKt.m3359Text4IGK_g("\u673a\u5668\u4eba", PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(2)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 54, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__96579508$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1907@78536L10,1905@78439L286:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-96579508, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$-96579508.<anonymous> (ChatScreen.kt:1905)");
            }
            TextKt.m3359Text4IGK_g("\u7fa4\u4e3b", PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(2)), Color.INSTANCE.m5094getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 438, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1602258819$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1920@79084L10,1918@78986L287:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1602258819, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1602258819.<anonymous> (ChatScreen.kt:1918)");
            }
            TextKt.m3359Text4IGK_g("\u7ba1\u7406\u5458", PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(2)), Color.INSTANCE.m5094getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 438, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__795017860$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C2641@107316L10,2639@107241L156:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-795017860, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$-795017860.<anonymous> (ChatScreen.kt:2639)");
            }
            TextKt.m3359Text4IGK_g("\u7f16\u8f91\u5386\u53f2", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1488966883$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C2689@109108L10:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1488966883, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1488966883.<anonymous> (ChatScreen.kt:2689)");
            }
            TextKt.m3359Text4IGK_g("\u5173\u95ed", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1619194601$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3239@126207L10,3237@126132L111:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1619194601, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1619194601.<anonymous> (ChatScreen.kt:3237)");
            }
            TextKt.m3359Text4IGK_g("\u7f16\u8f91\u6d88\u606f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__189350704$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3256@126886L12:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-189350704, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$-189350704.<anonymous> (ChatScreen.kt:3256)");
            }
            TextKt.m3359Text4IGK_g("\u6d88\u606f\u7c7b\u578b", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1520056762$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3285@128079L12:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1520056762, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$1520056762.<anonymous> (ChatScreen.kt:3285)");
            }
            TextKt.m3359Text4IGK_g("\u6d88\u606f\u5185\u5bb9", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1826127710$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C3303@128667L10:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1826127710, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$-1826127710.<anonymous> (ChatScreen.kt:3303)");
            }
            TextKt.m3359Text4IGK_g("\u786e\u5b9a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_2034333988$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C3308@128791L10:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2034333988, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatScreenKt.lambda$2034333988.<anonymous> (ChatScreen.kt:3308)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
