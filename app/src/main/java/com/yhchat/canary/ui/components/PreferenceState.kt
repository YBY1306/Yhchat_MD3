package com.yhchat.canary.ui.components

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext

@Composable
fun rememberSharedPreferences(
    name: String,
    mode: Int = Context.MODE_PRIVATE
): SharedPreferences {
    val context = LocalContext.current
    return remember(context, name, mode) {
        context.getSharedPreferences(name, mode)
    }
}

@Composable
fun rememberBooleanPreference(
    preferencesName: String,
    key: String,
    defaultValue: Boolean,
    mode: Int = Context.MODE_PRIVATE
): State<Boolean> {
    val preferences = rememberSharedPreferences(preferencesName, mode)
    val state: MutableState<Boolean> = remember(preferences, key, defaultValue) {
        mutableStateOf(preferences.getBoolean(key, defaultValue))
    }
    DisposableEffect(preferences, key, defaultValue) {
        val listener = SharedPreferences.OnSharedPreferenceChangeListener { prefs, changedKey ->
            if (changedKey == key) {
                state.value = prefs.getBoolean(key, defaultValue)
            }
        }
        preferences.registerOnSharedPreferenceChangeListener(listener)
        state.value = preferences.getBoolean(key, defaultValue)
        onDispose {
            preferences.unregisterOnSharedPreferenceChangeListener(listener)
        }
    }
    return state
}

@Composable
fun rememberIntPreference(
    preferencesName: String,
    key: String,
    defaultValue: Int,
    mode: Int = Context.MODE_PRIVATE
): State<Int> {
    val preferences = rememberSharedPreferences(preferencesName, mode)
    val state: MutableState<Int> = remember(preferences, key, defaultValue) {
        mutableStateOf(preferences.getInt(key, defaultValue))
    }
    DisposableEffect(preferences, key, defaultValue) {
        val listener = SharedPreferences.OnSharedPreferenceChangeListener { prefs, changedKey ->
            if (changedKey == key) {
                state.value = prefs.getInt(key, defaultValue)
            }
        }
        preferences.registerOnSharedPreferenceChangeListener(listener)
        state.value = preferences.getInt(key, defaultValue)
        onDispose {
            preferences.unregisterOnSharedPreferenceChangeListener(listener)
        }
    }
    return state
}

@Composable
fun rememberFloatPreference(
    preferencesName: String,
    key: String,
    defaultValue: Float,
    mode: Int = Context.MODE_PRIVATE
): State<Float> {
    val preferences = rememberSharedPreferences(preferencesName, mode)
    val state: MutableState<Float> = remember(preferences, key, defaultValue) {
        mutableStateOf(preferences.getFloat(key, defaultValue))
    }
    DisposableEffect(preferences, key, defaultValue) {
        val listener = SharedPreferences.OnSharedPreferenceChangeListener { prefs, changedKey ->
            if (changedKey == key) {
                state.value = prefs.getFloat(key, defaultValue)
            }
        }
        preferences.registerOnSharedPreferenceChangeListener(listener)
        state.value = preferences.getFloat(key, defaultValue)
        onDispose {
            preferences.unregisterOnSharedPreferenceChangeListener(listener)
        }
    }
    return state
}

@Composable
fun rememberStringPreference(
    preferencesName: String,
    key: String,
    defaultValue: String,
    mode: Int = Context.MODE_PRIVATE
): State<String> {
    val preferences = rememberSharedPreferences(preferencesName, mode)
    val state: MutableState<String> = remember(preferences, key, defaultValue) {
        mutableStateOf(preferences.getString(key, defaultValue) ?: defaultValue)
    }
    DisposableEffect(preferences, key, defaultValue) {
        val listener = SharedPreferences.OnSharedPreferenceChangeListener { prefs, changedKey ->
            if (changedKey == key) {
                state.value = prefs.getString(key, defaultValue) ?: defaultValue
            }
        }
        preferences.registerOnSharedPreferenceChangeListener(listener)
        state.value = preferences.getString(key, defaultValue) ?: defaultValue
        onDispose {
            preferences.unregisterOnSharedPreferenceChangeListener(listener)
        }
    }
    return state
}
