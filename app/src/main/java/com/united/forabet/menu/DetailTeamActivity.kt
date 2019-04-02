package com.united.forabet.menu

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.united.forabet.models.TeamModel
import com.united.forabet.utils.BaseActivity
import com.united.forabet.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailTeamActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val model = intent.getParcelableExtra<TeamModel>(KEY_MODEL)
        initView(model)
    }

    private fun initView(model: TeamModel?) {
        if (model == null) return
        titleView.init(model)
        description.setText(model.about)
    }

    companion object {
        private const val KEY_MODEL = "model"

        fun getInstance(context: Context, model: TeamModel): Intent =
                Intent(context, DetailTeamActivity::class.java)
                    .putExtra(KEY_MODEL, model)
    }
}