package com.rivvana.viewmodelkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.rivvana.viewmodelkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListener()
    }

    private fun setupListener() {
        binding.btnIncrement.setOnClickListener{
            viewModel.increment(angkaPertama = binding.angkaPertama.text.toString(), angkaKedua = binding.angkaKedua.text.toString())
        }

        viewModel.counter.observe(this){
            binding.tvCounter.text = it.toString()
        }
    }
}