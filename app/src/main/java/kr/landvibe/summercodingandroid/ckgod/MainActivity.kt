package kr.landvibe.summercodingandroid.ckgod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import kr.landvibe.summercodingandroid.R
import kr.landvibe.summercodingandroid.d11210920.D11210920Activity
import kr.landvibe.summercodingandroid.gok5959.Gok5959Activity
import kr.landvibe.summercodingandroid.leesc0839.Leesc0839Activity
import kr.landvibe.summercodingandroid.yesxon.YesxonActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        findViewById<AppCompatButton>(R.id.btnD11).setOnClickListener { startActivity<D11210920Activity>() }
        findViewById<AppCompatButton>(R.id.btnGok).setOnClickListener { startActivity<Gok5959Activity>() }
        findViewById<AppCompatButton>(R.id.btnLee).setOnClickListener { startActivity<Leesc0839Activity>() }
        findViewById<AppCompatButton>(R.id.btnYes).setOnClickListener { startActivity<YesxonActivity>() }
        findViewById<AppCompatButton>(R.id.btnCkg).setOnClickListener { startActivity<TmpActivity>() }
    }
}