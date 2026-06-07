package com.yhchat.canary.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.yhchat.canary.BuildConfig
import com.yhchat.canary.ui.components.rememberBooleanPreference
import com.yhchat.canary.ui.components.rememberFloatPreference
import com.yhchat.canary.ui.components.rememberIntPreference
import com.yhchat.canary.ui.components.rememberStringPreference
import top.yukonga.miuix.kmp.theme.ColorSchemeMode
import top.yukonga.miuix.kmp.theme.MiuixTheme
import top.yukonga.miuix.kmp.theme.ThemeController

private val DarkColorScheme = darkColorScheme(
    primary = ChatPrimaryDark,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    background = ChatBackgroundDark,
    surface = ChatSurfaceDark,
    onPrimary = Color(0xFF371E73),
    onSecondary = Color(0xFF332D41),
    onTertiary = Color(0xFF492532),
    onBackground = Color(0xFFE6E1E5),
    onSurface = Color(0xFFE6E1E5),
    primaryContainer = Color(0xFF4F378B),
    onPrimaryContainer = Color(0xFFEADDFF),
    surfaceVariant = Color(0xFF49454F),
    onSurfaceVariant = Color(0xFFCAC4D0),
    outline = Color(0xFF938F99),
    outlineVariant = Color(0xFF49454F),
    scrim = Color(0xFF000000)
)

private val LightColorScheme = lightColorScheme(
    primary = ChatPrimary,
    secondary = PurpleGrey40,
    tertiary = Pink40,
    background = ChatBackground,
    surface = ChatSurface,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    primaryContainer = Color(0xFFEADDFF),
    onPrimaryContainer = Color(0xFF21005D),
    surfaceVariant = Color(0xFFE7E0EC),
    onSurfaceVariant = Color(0xFF49454F),
    outline = Color(0xFF79747E),
    outlineVariant = Color(0xFFCAC4D0),
    scrim = Color(0xFF000000)
)

val LocalGlobalScale = staticCompositionLocalOf { 1.0f }

private val MiuixCompatibilityShapes = Shapes(
    extraSmall = RoundedCornerShape(8.dp),
    small = RoundedCornerShape(14.dp),
    medium = RoundedCornerShape(18.dp),
    large = RoundedCornerShape(24.dp),
    extraLarge = RoundedCornerShape(28.dp)
)

@Composable
private fun miuixMaterialColorScheme(
    darkTheme: Boolean
): androidx.compose.material3.ColorScheme {
    val colors = top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme
    return if (darkTheme) {
        darkColorScheme(
            primary = colors.primary,
            onPrimary = colors.onPrimary,
            secondary = colors.secondary,
            onSecondary = colors.onSecondary,
            tertiary = colors.tertiaryContainer,
            onTertiary = colors.onTertiaryContainer,
            background = colors.background,
            onBackground = colors.onBackground,
            surface = colors.surface,
            onSurface = colors.onSurface,
            error = colors.error,
            onError = colors.onError,
            primaryContainer = colors.primaryContainer,
            onPrimaryContainer = colors.onPrimaryContainer,
            secondaryContainer = colors.secondaryContainer,
            onSecondaryContainer = colors.onSecondaryContainer,
            tertiaryContainer = colors.tertiaryContainer,
            onTertiaryContainer = colors.onTertiaryContainer,
            errorContainer = colors.errorContainer,
            onErrorContainer = colors.onErrorContainer,
            surfaceVariant = colors.surfaceContainer,
            onSurfaceVariant = colors.onSurfaceContainerVariant,
            outline = colors.outline,
            outlineVariant = colors.dividerLine,
            scrim = colors.windowDimming
        )
    } else {
        lightColorScheme(
            primary = colors.primary,
            onPrimary = colors.onPrimary,
            secondary = colors.secondary,
            onSecondary = colors.onSecondary,
            tertiary = colors.tertiaryContainer,
            onTertiary = colors.onTertiaryContainer,
            background = colors.background,
            onBackground = colors.onBackground,
            surface = colors.surface,
            onSurface = colors.onSurface,
            error = colors.error,
            onError = colors.onError,
            primaryContainer = colors.primaryContainer,
            onPrimaryContainer = colors.onPrimaryContainer,
            secondaryContainer = colors.secondaryContainer,
            onSecondaryContainer = colors.onSecondaryContainer,
            tertiaryContainer = colors.tertiaryContainer,
            onTertiaryContainer = colors.onTertiaryContainer,
            errorContainer = colors.errorContainer,
            onErrorContainer = colors.onErrorContainer,
            surfaceVariant = colors.surfaceContainer,
            onSurfaceVariant = colors.onSurfaceContainerVariant,
            outline = colors.outline,
            outlineVariant = colors.dividerLine,
            scrim = colors.windowDimming
        )
    }
}

@Composable
private fun miuixMaterialTypography(): androidx.compose.material3.Typography {
    val textStyles = top.yukonga.miuix.kmp.theme.MiuixTheme.textStyles
    return androidx.compose.material3.Typography(
        displayLarge = textStyles.title1,
        displayMedium = textStyles.title2,
        displaySmall = textStyles.title3,
        headlineLarge = textStyles.title2,
        headlineMedium = textStyles.title3,
        headlineSmall = textStyles.title4,
        titleLarge = textStyles.title3,
        titleMedium = textStyles.headline1,
        titleSmall = textStyles.headline2,
        bodyLarge = textStyles.main,
        bodyMedium = textStyles.body1,
        bodySmall = textStyles.body2,
        labelLarge = textStyles.button,
        labelMedium = textStyles.footnote1,
        labelSmall = textStyles.footnote2
    )
}

@Composable
fun YhchatCanaryTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current
    val systemDarkTheme = isSystemInDarkTheme()
    val globalScale by rememberFloatPreference("display_settings", "global_scale", 1.0f)
    val fontScalePercent by rememberFloatPreference("display_settings", "font_scale", 100f)
    val themeMode by rememberStringPreference("display_settings", "theme_mode", "system")
    val customColorInt by rememberIntPreference("theme_settings", "custom_primary_color", -1)
    val monetEnabled by rememberBooleanPreference("display_settings", "enable_monet_colors", true)
    val fontScalePreference = fontScalePercent / 100f
    val isMiuixStyle = BuildConfig.UI_STYLE == "miuix"
    
    // 读取自定义主题颜色设置
    val useCustomColor = customColorInt != -1 && customColorInt != 0xFF6200EE.toInt()
    val customPrimaryColor = if (useCustomColor) Color(customColorInt) else null
    
    // 读取是否启用莫奈取色（Material You动态颜色）
    val effectiveDarkTheme = when (themeMode) {
        "light" -> false
        "dark" -> true
        else -> systemDarkTheme
    }
    
    val baseDensity = LocalDensity.current
    val scaledDensity = Density(
        density = baseDensity.density * globalScale,
        fontScale = baseDensity.fontScale * globalScale * fontScalePreference
    )

    CompositionLocalProvider(
        LocalGlobalScale provides globalScale,
        LocalDensity provides scaledDensity
    ) {
        if (isMiuixStyle) {
            val miuixMode = when (themeMode) {
                "light" -> ColorSchemeMode.Light
                "dark" -> ColorSchemeMode.Dark
                else -> ColorSchemeMode.System
            }
            val controller = ThemeController(
                colorSchemeMode = miuixMode
            )
            MiuixTheme(
                controller = controller
            ) {
                MaterialTheme(
                    colorScheme = miuixMaterialColorScheme(darkTheme = effectiveDarkTheme),
                    typography = miuixMaterialTypography(),
                    shapes = MiuixCompatibilityShapes,
                    content = content
                )
            }
        } else {
            val standardColorScheme = when {
                monetEnabled && dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
                    if (effectiveDarkTheme) {
                        dynamicDarkColorScheme(context)
                    } else {
                        dynamicLightColorScheme(context)
                    }
                }
                customPrimaryColor != null -> {
                    val base = if (effectiveDarkTheme) DarkColorScheme else LightColorScheme
                    base.copy(
                        primary = customPrimaryColor,
                        primaryContainer = customPrimaryColor.copy(alpha = 0.3f),
                        onPrimaryContainer = if (effectiveDarkTheme) customPrimaryColor.copy(alpha = 0.9f) else customPrimaryColor
                    )
                }
                effectiveDarkTheme -> DarkColorScheme
                else -> LightColorScheme
            }
            MaterialTheme(
                colorScheme = standardColorScheme,
                typography = Typography,
                content = content
            )
        }
    }
}
