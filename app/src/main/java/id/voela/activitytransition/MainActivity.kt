package id.voela.activitytransition

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import id.voela.actrans.AcTrans
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
            AcTrans.Builder(this).performSlideToTop()
        }

    }
}
