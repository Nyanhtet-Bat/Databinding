package com.nlh.databindingedittext

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.nlh.databindingedittext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var person:Personen = Personen("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.submitButton.setOnClickListener {
        var name = binding.editName.text.toString()
            var occupation = binding.editOccupation.text.toString()
            person = Personen(name,occupation)
            binding.someone = person
        }
    }
}
