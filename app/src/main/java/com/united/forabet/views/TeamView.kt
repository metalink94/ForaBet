package com.united.forabet.views

import android.content.Context
import androidx.cardview.widget.CardView
import android.util.AttributeSet
import android.view.View
import com.united.forabet.R
import com.united.forabet.models.TeamModel
import kotlinx.android.synthetic.main.team_row.view.*

class TeamView
@JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
    CardView(context, attrs, defStyleAttr) {

    init {
        View.inflate(getContext(), R.layout.team_row, this)
    }

    var leftTitle: CharSequence
        get() = textLeft.text
        set(value) {
            textLeft.text = value
        }

    var rightTitle: CharSequence
        get() = textRight.text
        set(value) {
            textRight.text = value
        }

    var scoreRow: CharSequence
        get() = score.text
        set(value) {
            score.text = value
        }

    fun setIcons(leftIcon: Int, rightIcon: Int) {
        iconLeft.setImageResource(leftIcon)
        iconRight.setImageResource(rightIcon)
    }

    fun init(model: TeamModel) {
        tag = model
        leftTitle = context.getString(model.teamLeft)
        rightTitle = context.getString(model.teamRight)
        scoreRow = context.getString(model.score)
        setIcons(model.iconLeft, model.iconRight)
    }
}