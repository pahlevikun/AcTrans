package id.voela.actrans

import android.app.Activity
import android.content.Context


/**
 * Created by farhan on 6/3/18.
 */
class AcTrans private constructor(private var builder: Builder) {

    class Builder(private var context: Context) {

        fun performNoAnimation() {
            (context as Activity).overridePendingTransition(0, 0)
        }

        fun performSlideToLeft() {
            (context as Activity).overridePendingTransition(R.anim.slide_left_start, R.anim.slide_left_end)
        }

        fun performSlideToRight() {
            (context as Activity).overridePendingTransition(R.anim.slide_right_start, R.anim.slide_right_end)
        }

        fun performSlideToBottom() {
            (context as Activity).overridePendingTransition(R.anim.slide_bottom_start, R.anim.slide_bottom_end)
        }

        fun performSlideToTop() {
            (context as Activity).overridePendingTransition(R.anim.slide_top_start, R.anim.slide_top_end)
        }

        fun performFade() {
            (context as Activity).overridePendingTransition(R.anim.fade_start, R.anim.fade_end)
        }
    }

}