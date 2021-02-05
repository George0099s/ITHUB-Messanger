package com.ithub.ithubmessanger.presetation.ui.base

import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Binding: ViewBinding> : Fragment() {
    protected lateinit var binding: Binding

    @get:LayoutRes
    protected abstract val layoutId: Int
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        initViews()
        return binding.root
    }

    protected open fun initViews() {}
}