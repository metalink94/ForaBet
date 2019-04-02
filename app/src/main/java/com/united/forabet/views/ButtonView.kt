package com.united.forabet.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import com.united.forabet.R
import kotlinx.android.synthetic.main.button_view.view.*

class ButtonView
@JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0):
    RelativeLayout(context, attrs, defStyleAttr) {

    init {
        View.inflate(getContext(), R.layout.button_view, this)
    }

    var textRow: CharSequence
        get() = text.text
        set(value) {
            text.text = value
        }

    fun setIcon(iconRes: Int) {
        icon.setImageResource(iconRes)
    }
}
