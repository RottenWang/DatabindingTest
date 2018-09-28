package com.drwang.databinding.model

import android.databinding.BaseObservable
import android.databinding.Bindable

class User(name: String) : BaseObservable() {
    @Bindable
    var name: String? = name
        set(value) {
            field = value
            notifyChange()
        }
}
