package com.ithub.ithubmessanger.presetation.ui

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ithub.ithubmessanger.R
import com.ithub.ithubmessanger.databinding.ActivityMainBinding
import com.ithub.ithubmessanger.presetation.ui.chats.ChatList

enum class Colors {
    red,
    yellow
}

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var binding: ActivityMainBinding
    
    private var str: String? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
 
        str = "2345"
        
//        with(binding){
//            bottomNav.setOnNavigationItemSelectedListener(this@MainActivity)
//        }
        
//        val f = str?.let { item->
//            str = "ggg"
//        }
//
//        val b = str?.apply {
//
//        }

        setContentView(binding.root)
        initView()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.chats ->
                supportFragmentManager.beginTransaction().replace(R.id.fragment_cont, ChatList())
                    .commit()
            R.id.profile ->
                supportFragmentManager.beginTransaction()
        }
        return true
    }

    private fun initView() {
        binding.bottomNav.setOnNavigationItemSelectedListener(this)
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}