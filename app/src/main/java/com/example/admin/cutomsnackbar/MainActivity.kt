package com.example.admin.cutomsnackbar

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        welcomeButton.setOnClickListener {
            Snackbar.make(mainLayout, "Welcome! to the jungle second commit ! ${firstName.text}", Snackbar.LENGTH_INDEFINITE).show()
        }
    }
}
