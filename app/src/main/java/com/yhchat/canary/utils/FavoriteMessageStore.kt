package com.yhchat.canary.utils

import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.yhchat.canary.data.model.ChatMessage
import java.io.File

object FavoriteMessageStore {
    private val favoriteFile = File("/storage/emulated/0/Download/yhchat/fav/favorite_messages.json")
    private val fileLock = Any()

    private val gson = GsonBuilder()
        .serializeNulls()
        .setPrettyPrinting()
        .create()

    fun saveMessage(message: ChatMessage): Result<File> {
        return runCatching {
            synchronized(fileLock) {
                val targetFile = favoriteFile
                val parent = targetFile.parentFile
                if (parent != null && !parent.exists()) {
                    parent.mkdirs()
                }

                val existingArray = readExistingArray(targetFile)
                existingArray.add(buildFavoriteEntry(message))
                targetFile.writeText(gson.toJson(existingArray), Charsets.UTF_8)
                targetFile
            }
        }
    }

    private fun readExistingArray(file: File): JsonArray {
        if (!file.exists()) return JsonArray()
        val raw = file.readText(Charsets.UTF_8).trim()
        if (raw.isEmpty()) return JsonArray()

        return runCatching {
            val parsed = JsonParser.parseString(raw)
            when {
                parsed.isJsonArray -> parsed.asJsonArray
                else -> JsonArray().apply { add(parsed) }
            }
        }.getOrElse {
            JsonArray()
        }
    }

    private fun buildFavoriteEntry(message: ChatMessage): JsonObject {
        return JsonObject().apply {
            addProperty("favoriteTime", System.currentTimeMillis())
            add("message", gson.toJsonTree(message))
        }
    }
}
