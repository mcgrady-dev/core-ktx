package com.mcgrady.xlabs.core.extensions.graphics

import android.content.Context
import android.graphics.Paint
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import kotlin.math.abs


/** 获取 Drawable */
fun Context.drawable(@DrawableRes id: Int) = ContextCompat.getDrawable(this, id)

fun Int.asDrawable(context: Context) = context.drawable(this)

inline val Paint.measureFontHeight: Float
    get() = abs(fontMetrics.ascent) - fontMetrics.descent