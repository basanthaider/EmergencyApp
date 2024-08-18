package com.example.emergencyapp

import android.os.Bundle
import android.widget.Adapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emergencies = arrayListOf<Emergency>()
        emergencies.add(Emergency(R.drawable.child, getString(R.string.child_care),"***"))
        emergencies.add(Emergency(R.drawable.health, getString(R.string.ambulance),"123"))
        emergencies.add(Emergency(R.drawable.police, getString(R.string.police),"122"))
        emergencies.add(Emergency(R.drawable.fire, getString(R.string.fire),"180"))
        emergencies.add(Emergency(R.drawable.exterminator, getString(R.string.exterminator),"###"))
        emergencies.add(Emergency(R.drawable.pharmacy, getString(R.string.pharmacy),"###"))

        val adapter = EmergencyAdapter(this,emergencies)
        val rv :RecyclerView = findViewById(R.id.rv)
        rv.adapter = adapter

    }

    override fun onBackPressed() {
        val exit =ExitDialog()
        exit.isCancelable =false
        exit.show(supportFragmentManager,null)
    }
}