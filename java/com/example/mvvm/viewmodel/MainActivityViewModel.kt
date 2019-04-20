package com.example.mvvm.viewmodel

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.view.View
import com.example.mvvm.BR
import com.example.mvvm.model.MainActivityModel
import java.util.*

class MainActivityViewModel() : Observer, BaseObservable() {

    var counter : MainActivityModel  = MainActivityModel()
    /// Register itself as the observer of Model
    init {
        counter.count=0;
        counter.addObserver(this)
    }

    /// Notify the UI when change event emitting from Model is received.
    override fun update(p0: Observable?, obj: Any?) {
        if (obj is String) {
            if (obj == "count") {
                notifyPropertyChanged(BR.count)
            }
        }
    }

    val count: String
        @Bindable get() {
            return ""+counter.count
        }


    fun onButtonClick(view: View) {
        this.counter.count++
    }

}