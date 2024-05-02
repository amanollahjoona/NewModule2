package com.amanollahjoona.module2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amanollahjoona.module2.databinding.ActivityModule4Binding

class Module4Activity : AppCompatActivity() {
    private lateinit var binding : ActivityModule4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_module4)
        binding = ActivityModule4Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}