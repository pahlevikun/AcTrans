package id.voela.activitytransition

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.voela.actrans.AcTrans

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        AcTrans.Builder(this).performSlideToRight()
    }
}
