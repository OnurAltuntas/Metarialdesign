package com.example.metarialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.MenuItem
import android.widget.Toolbar


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setSupportActionBar(bar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {


        val inflater = menuInflater
        inflater.inflate(R.menu.bottombarmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.app_bar_fav -> toast("Fav menu item is clicked!")
            R.id.app_bar_freeadvert -> toast("Search menu item is clicked!")
            R.id.app_bar_settings -> toast("Settings item is clicked!")

            android.R.id.home -> {
                val bottomNavDrawerFragment = BottomNavigationDrawerFragment()
                bottomNavDrawerFragment.show(supportFragmentManager, bottomNavDrawerFragment.tag)
            }
        }
        return true
    }



    public fun toast(str:String){
        Toast.makeText(applicationContext,str,Toast.LENGTH_SHORT).show()
    }

}


