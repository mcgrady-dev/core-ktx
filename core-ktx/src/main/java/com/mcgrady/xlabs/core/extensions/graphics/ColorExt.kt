package com.mcgrady.xlabs.core.extensions.graphics

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.util.TypedValue
import android.view.View
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

/** 获取 color */
fun Context.color(@ColorRes id: Int) = ContextCompat.getColor(this, id)

fun Int.asColor(context: Context) = context.color(this)

/** gets color from the ContextCompat. */
@JvmSynthetic
fun View.accentColor(): Int {
    @SuppressLint("ObsoleteSdkInt", "DiscouragedApi")
    val colorAttr: Int = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        android.R.attr.colorAccent
    } else {
        context.resources.getIdentifier("colorAccent", "attr", context.packageName)
    }
    val outValue = TypedValue()
    context.theme.resolveAttribute(colorAttr, outValue, true)
    return outValue.data
}