package com.joekaraki.geminichatbot.data

import android.graphics.Bitmap

/**
 * @author joe karaki
 */
data class Chat (
    val prompt: String,
    val bitmap: Bitmap?,
    val isFromUser: Boolean
)