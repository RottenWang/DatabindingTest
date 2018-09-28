package com.drwang.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class JavaUser extends BaseObservable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyChange();
    }
    @Bindable
    private String name;

    public JavaUser(String name) {
        this.name = name;
    }


}
