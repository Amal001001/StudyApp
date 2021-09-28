package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent
import android.view.Menu
import android.view.MenuItem

class MainActivity1 : AppCompatActivity() {
    private lateinit var rvkotlin: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val items = arrayListOf(
            arrayListOf("var and val", "Declaring variables.", "val a: Int = 5 // can’t be changed\n" +
                    " val b = 5\n" +
                    "var name: String = \"Tim\"// can be changed\n"),
            arrayListOf("User Input", "Getting user input.", "val name = readLine()"),
            arrayListOf("Strings", "String concatenations, interpolation, and methods.", "val message = \"Hi there\", val name = \"Sam\"\n" +
                    "println(message + name) //--> Hi thereSam\n" +
                    "println(\"\$message \$name\") //--> Hi there Sam\n"),
            arrayListOf("Data Types", "Understanding data types.", "String, Char, Int, Float, Boolean"),
            arrayListOf("Basic Operations", "Performing math operations in Kotlin.", "num = num + 1\n" +
                    "num += 1\n" +
                    "num ++\n"),
            arrayListOf("If Statements", "Understanding when and how to use if,else if, and else.", "val num =6\n" +
                    "if(num > 5){ println(\"The number is larger than 5\") } "),
            arrayListOf("Error Handling", "Using try blocks to avoid runtime errors.", "import java.lang.Exception //library \n" +
                    "try {val userNum = readLine()!!.toInt() \n" +
                    " val sum =num + userNum \n" +
                    " println(sum)} \n" +
                    "catch (e: Exception) { println(\"Please enter numbers only”)}"),
            arrayListOf("For Loops", "Using for loops to automate code.", "for(number in 1..5){ println(number)}"),
            arrayListOf("While Loops", "Using while loops to automate code.", "var count = 0\n" +
                    "while (count < 5) { count ++ println(count)}\n")
        )

        val rvkotlin = findViewById<RecyclerView>(R.id.rvkotlin)
        rvkotlin.adapter = kadapter(this, items)
        rvkotlin.layoutManager = LinearLayoutManager(this)

        title = "Kotlin Review" //changes the title
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_activity1menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.game2 -> {
                val intent = Intent(this, MainActivity2::class.java)
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