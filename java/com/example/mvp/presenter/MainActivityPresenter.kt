package com.example.mvp.presenter

import com.example.mvp.model.MainActivityModel
import com.example.mvp.contract.ContractInterface.*

class MainActivityPresenter (_view: View): Presenter {
    private var view: View = _view
    private var model: MainActivityModel = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter()=model.getCounter().toString()


}