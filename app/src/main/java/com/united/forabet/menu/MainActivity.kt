package com.united.forabet.menu

import android.os.Bundle
import com.united.forabet.R
import com.united.forabet.utils.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButtons()
    }

    private fun initButtons() {
        cricket.apply {
            textRow = "Cricket"
            setIcon(R.mipmap.ic_launcher)
        }

        football.apply {
            textRow = "Football"
            setIcon(R.mipmap.ic_launcher_round)
        }

        tennis.apply {
            textRow = "Tennis"
            setIcon(R.mipmap.ic_launcher)
        }
    }
}
