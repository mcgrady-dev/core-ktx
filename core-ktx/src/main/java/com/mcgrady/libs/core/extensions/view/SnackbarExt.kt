package com.mcgrady.libs.core.extensions.view

import android.view.View
import androidx.annotation.StringRes
import com.mcgrady.libs.core.extensions.isNotNullOrEmpty

//fun View.snackbar(
//    message: String,
//    duration: Int = Snackbar.LENGTH_SHORT,
//    actionName: String? = null,
//    block: (() -> Unit?)? = null
//) {
//    Snackbar.make(this, message, duration).run {
//        if (actionName.isNotNullOrEmpty() && block != null) {
//            setAction(actionName) {
//                block()
//            }
//        }
//        show()
//    }
//}
//
//fun View.snackbar(
//    @StringRes stringResId: Int,
//    duration: Int = Snackbar.LENGTH_SHORT,
//    actionName: String? = null,
//    block: (() -> Unit?)? = null
//) {
//    Snackbar.make(this, stringResId, duration).run {
//        if (actionName.isNotNullOrEmpty() && block != null) {
//            setAction(actionName) {
//                block()
//            }
//        }
//        show()
//    }
//}
