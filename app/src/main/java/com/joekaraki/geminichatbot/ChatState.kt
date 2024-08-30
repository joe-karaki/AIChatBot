package com.joekaraki.geminichatbot

import android.graphics.Bitmap
import com.joekaraki.geminichatbot.data.Chat

/**
 * @author Joe Karaki
 */
data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)