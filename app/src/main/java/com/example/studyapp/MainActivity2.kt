package com.example.studyapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    private lateinit var rvandroid: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val items = arrayListOf(
            arrayListOf("Project Setup", "Setting up an Android Studio Project.", "Download Android Studio then launch it\n opening Android Studio and clicking on \"Create New Project\"\n choose \"Empty Activity\""),
            arrayListOf("Running Hello World", "virtual device.", "In order to run our Android Studio project, we need to install a virtual device."),
            arrayListOf("Console", "Printing to the console.", "Anything that prints to the console will be invisible to the end-user."),
            arrayListOf("Resource Files", "Identifying, editing, and using resource files.", "Here, we can make changes to colors.xml and themes.xml files."),
            arrayListOf("UI Elements", "Creating, modifying, and initializing UI Elements.", "Button, textview, edittext, layout and more." ),
            arrayListOf("OnClickListener", "We could make a button functioning anything.", "myButton.setOnClickListener { myFuction() }")
        )

        val rvandroid = findViewById<RecyclerView>(R.id.rvandroid)
        rvandroid.adapter = kadapter(this, items)
        rvandroid.layoutManager = LinearLayoutManager(this)

        title = "Android Review"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_activity2menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.kf -> {
                val intent = Intent(this, MainActivity1::class.java)
                startActivity(intent)
                return true
            }
            R.id.mainmenu -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
