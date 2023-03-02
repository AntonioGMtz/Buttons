package com.example.buttons

import android.content.ContentValues
import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.buttons.ButtonProvider.Companion.binding
import com.example.buttons.ButtonProvider.Companion.changeColor
import com.example.buttons.ButtonProvider.Companion.sendMessage


import com.example.buttons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       sendMessage("HOLA ANTONIO")
    }








}