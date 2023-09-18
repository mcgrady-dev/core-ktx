package com.mcgrady.xlabs.core.extensions.graphics

import android.content.Context
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat


/** 获取 Drawable */
fun Context.drawable(@DrawableRes id: Int) = ContextCompat.getDrawable(this, id)

fun Int.asDrawable(context: Context) = context.drawable(this)