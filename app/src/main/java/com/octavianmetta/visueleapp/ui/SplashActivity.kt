package com.octavianmetta.visueleapp.ui

import android.content.Intent
import com.octavianmetta.visueleapp.R
import com.octavianmetta.visueleapp.core.base.BaseActivity
import com.octavianmetta.visueleapp.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {

    override fun initBinding() {
        super.initBinding()
        binding.apply {
            splashButton.setOnClickListener {
                val toHome = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(toHome)
            }
        }
    }

    override fun subscribeUi() {
        super.subscribeUi()
    }
}