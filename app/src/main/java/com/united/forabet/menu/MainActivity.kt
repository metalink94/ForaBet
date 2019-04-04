package com.united.forabet.menu

import android.os.Bundle
import android.view.View
import com.united.forabet.R
import com.united.forabet.models.TeamModel
import com.united.forabet.utils.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButtons()
    }

    private fun initButtons() {
        tennis.init(TeamModel(R.string.kings, R.drawable.punjab, R.string.delhi, R.drawable.capitals,
            R.string.score_1, R.string.description))
        tennis.setOnClickListener {
            onItemClick(it)
        }
        football.init(TeamModel(R.string.sunrisers, R.drawable.sinrises, R.string.royal, R.drawable.rc,
            R.string.score_2, R.string.description_2))
        football.setOnClickListener {
            onItemClick(it)
        }
        cricket.init(TeamModel(R.string.chennai, R.drawable.king, R.string.kings, R.drawable.punjab,
            R.string.score_3, R.string.description_3))
        cricket.setOnClickListener {
            onItemClick(it)
        }
    }

    private fun onItemClick(it: View) {
        startActivity(DetailTeamActivity.getInstance(this, it.tag as TeamModel))
    }
}
