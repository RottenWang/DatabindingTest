package com.drwang.databinding;

import com.drwang.databinding.model.User;

import java.io.File;

public abstract class A {


    private A mContainingA = null;

    public void setA(A a) {
        mContainingA = a;
    }


    public void execute() {
        if (mContainingA != null) {
            mContainingA.execute();
            return;
        }
        //执行实际代码
        User u = new User("x");


    }
}
