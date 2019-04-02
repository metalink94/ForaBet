package com.united.forabet.utils

import android.app.Application
import com.google.firebase.FirebaseApp

class ForaApp: Application() {

    override fun onCreate() {
        FirebaseApp.initializeApp(this)
        super.onCreate()
    }
}
