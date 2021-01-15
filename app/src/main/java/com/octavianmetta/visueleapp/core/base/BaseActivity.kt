package com.octavianmetta.visueleapp.core.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import dagger.android.DaggerActivity
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity<B : ViewDataBinding> constructor(@LayoutRes val layoutRes: Int) :
    DaggerAppCompatActivity() {

    protected open lateinit var binding: B
    protected val TAG = javaClass.simpleName


    protected open fun initBinding() {}
    protected open fun subscribeUi() {}

    private fun bindView() {
        binding = DataBindingUtil.setContentView(this, layoutRes)
        binding.lifecycleOwner = this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindView()
        initBinding()
        subscribeUi()
    }

}