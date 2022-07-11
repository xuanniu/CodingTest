package com.example.codingtest.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.codingtest.R
import com.example.codingtest.ui.viewmodel.InboxViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var vm: InboxViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nav = findViewById<BottomNavigationView>(R.id.navigationView)

        switchFragment(InboxFragment())
        nav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.inbox -> {
                    switchFragment(InboxFragment())
                    true
                }
                R.id.settings -> {
                    switchFragment(SettingsFragment())
                    true
                }
                else -> {
                    true
                }
            }
        }


    }

    fun switchFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}