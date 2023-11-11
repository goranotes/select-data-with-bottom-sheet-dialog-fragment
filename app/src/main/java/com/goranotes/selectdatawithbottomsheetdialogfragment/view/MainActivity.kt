package com.goranotes.selectdatawithbottomsheetdialogfragment.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.goranotes.selectdatawithbottomsheetdialogfragment.R
import com.goranotes.selectdatawithbottomsheetdialogfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tietSelectCar.setOnClickListener {
            val bottomSheetDialogFragment = SelectCarBottomSheetDialogFragment()
            bottomSheetDialogFragment.show(supportFragmentManager, bottomSheetDialogFragment.getTag())
        }
    }

    fun onSelectCar(name: String){
        binding.tietSelectCar.setText(name)
    }
}