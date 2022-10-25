package com.rivvana.viewmodelkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rivvana.viewmodelkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}