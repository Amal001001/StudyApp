package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var kbutton: Button
    lateinit var abutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kbutton = findViewById(R.id.kbutton)
        abutton = findViewById(R.id.abutton)
        val textview = findViewById<TextView>(R.id.tvguess)

        kbutton.setOnClickListener {
            val intent = Intent(this, MainActivity1::class.java)
            startActivity(intent)
        }
        abutton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.kf -> {
                val intent = Intent(this, MainActivity1::class.java)
                startActivity(intent)
                return true
            }
            R.id.af -> {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}