package com.example.neighbourhoodtalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neighbourhoodtalk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //    setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.button.text = "Login"

        }
    }
}