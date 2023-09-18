/*
 * Copyright 2022 mcgrady
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mcgrady.xlabs.core.extensions.view

import android.app.Activity
import android.content.Context
import android.view.WindowManager
import androidx.annotation.ColorRes
import java.lang.ref.WeakReference

/** 设置状态栏的颜色 */
fun Context.statusBarColor(@ColorRes colorResId: Int) {
    if (this is Activity) {
        statusBarColor(WeakReference<Activity>(this), colorResId)
    }
}

@Suppress("DEPRECATION")
private fun Context.statusBarColor(context: WeakReference<Activity>, @ColorRes colorResId: Int) {
    context.get()?.run {
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = resources.getColor(colorResId)
    }
}