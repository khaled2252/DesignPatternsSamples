package com.example.mvvm.view
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.mvvm.BR
import com.example.mvvm.R
import com.example.mvvm.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /// Create the view model
        val userViewModel = MainActivityViewModel()

        /// Data-Binding
        val binding = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_main)

        binding.setVariable(BR.counter, userViewModel)
    }
}
