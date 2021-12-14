package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.nav_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item?.itemId){
            R.id.nav_delete -> Toast.makeText(this, "delete selected", Toast.LENGTH_SHORT).show()
            R.id.nav_favorite -> Toast.makeText(this, "favorite selected", Toast.LENGTH_SHORT).show()
            R.id.nav_third_item -> Toast.makeText(this, "third item", Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }

}