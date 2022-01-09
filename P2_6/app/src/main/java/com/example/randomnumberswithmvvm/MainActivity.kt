package com.example.randomnumberswithmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomNumberViewModel: ViewModel(){
    val currentRandomNumber: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generate(v: View){
        val randomNum: Int = (0..50).random()
        val input: EditText = findViewById(R.id.rndNum)
        input.setText("$randomNum")
    }
}