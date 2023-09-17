package com.example.spals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import com.example.spals.databinding.ActivityHomeBinding

class home : AppCompatActivity() {
    private  val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)


        binding.menu.setOnClickListener {
            val popupMenu = PopupMenu(this,binding.menu)
            popupMenu.menuInflater.inflate(R.menu.menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener {
                it->
                Toast.makeText(this, "click"+it.title, Toast.LENGTH_SHORT).show()
                true
            }
            popupMenu.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.phython->{
                Toast.makeText( this,"python", Toast.LENGTH_SHORT).show()
            }
            R.id.cc->{
                Toast.makeText( this,"C", Toast.LENGTH_SHORT).show()
            }
        }

        return super.onOptionsItemSelected(item)
    }
}