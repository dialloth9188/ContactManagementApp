package com.thd.contactsapp

import android.app.Application

class ContactApp:Application() {

    init {
        app = this
    }

    companion object{
        lateinit var  app:Application
        fun getAppContext() = app.applicationContext
    }
}
