package com.example.mvvm.model

import java.util.*

class MainActivityModel : Observable() {

    var count: Int = 0
        set(value) {
            field = value
            setChangedAndNotify("count")
        }



    private fun setChangedAndNotify(field: Any)
    {
        setChanged()
        notifyObservers(field)
    }
}
