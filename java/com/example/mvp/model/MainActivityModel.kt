package com.example.mvp.model

import com.example.mvp.contract.ContractInterface.*


class MainActivityModel : Model {
    private var mCounter = 0

    override fun getCounter()= mCounter

    override fun incrementCounter() {
        mCounter++
    }
}