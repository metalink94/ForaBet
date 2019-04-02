package com.united.forabet.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class TeamModel(val teamLeft: Int,
                val iconLeft: Int,
                val teamRight: Int,
                val iconRight: Int,
                val score: Int,
                val about: Int): Parcelable