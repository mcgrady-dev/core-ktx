package com.mcgrady.libs.core.extensions.graphics

import android.content.Context
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

/** 获取 color */
fun Context.color(@ColorRes id: Int) = ContextCompat.getColor(this, id)

fun Int.asColor(context: Context) = context.color(this)