package id.voela.actrans

import android.app.Activity
import android.content.Context


/**
 * Created by farhan on 6/3/18.
 */
class AcTrans {

    fun performNoAnimation(context: Context) {
        (context as Activity).overridePendingTransition(0, 0)
    }

    fun performSlideToLeft(context: Context) {
        (context as Activity).overridePendingTransition(R.anim.slide_left_start, R.anim.slide_left_end)
    }

    fun performSlideToRight(context: Context) {
        (context as Activity).overridePendingTransition(R.anim.slide_right_start, R.anim.slide_right_end)
    }

    fun performSlideToBottom(context: Context) {
        (context as Activity).overridePendingTransition(R.anim.slide_bottom_start, R.anim.slide_bottom_end)
    }

    fun performSlideToTop(context: Context) {
        (context as Activity).overridePendingTransition(R.anim.slide_top_start, R.anim.slide_top_end)
    }
}