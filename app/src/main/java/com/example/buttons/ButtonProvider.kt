package com.example.buttons

import android.content.ContentValues
import android.util.Log
import android.widget.Toast
import com.example.buttons.databinding.ActivityMainBinding

class ButtonProvider {


    companion object{

        lateinit var binding: ActivityMainBinding
        fun sendMessage(mensaje : String){
            mensaje.isEmpty().apply {
                binding.botonUno.setOnClickListener {
                    binding.tvAlert.setText("Texto por defecto")
                }
            }
            binding.botonUno.setOnClickListener {
                binding.tvAlert.setText(mensaje)
            }
        }
        fun sendConsole(){
            binding.botonUno.setOnClickListener {
                Log.i(ContentValues.TAG, "Este es un mensaje en la consola")
            }
        }
        fun changeColor(){
            binding.botonUno.setOnClickListener {
                binding.botonUno.setBackgroundColor(0xFF00FF00.toInt() )
            }
        }
        fun changeWay(){
            with(binding.botonUno){
                setOnClickListener {

                 }
            }
        }

    }
}