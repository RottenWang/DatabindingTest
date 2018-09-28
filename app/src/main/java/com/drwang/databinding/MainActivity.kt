package com.drwang.databinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.drwang.databinding.databinding.ActivityMainBinding
import com.drwang.databinding.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mUser :User? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
//        bind.executePendingBindings()
        mUser = User("xixi")
        bind.user = mUser
        mUser?.name = "232"
        mUser?.name = "2323"
        mUser?.name = "23233"
        et.addTextChangedListener(object:TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                mUser?.name = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
             }
        })
    }
}
