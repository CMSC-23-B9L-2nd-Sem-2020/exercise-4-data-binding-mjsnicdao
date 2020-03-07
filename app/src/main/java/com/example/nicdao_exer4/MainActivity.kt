package com.example.nicdao_exer4

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.nicdao_exer4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Michael Jireh S. Nicdao")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName =  myName
        binding.doneButton.setOnClickListener{
            addDetails(it)
        }
    }

    private fun addDetails(view:View){
        binding.apply {
            myName?.name = nameEditText.text.toString()
            myName?.nickname = nicknameEditText.text.toString()
            myName?.age = ageEditText.text.toString()
            invalidateAll()
            binding.nameView.visibility = View.VISIBLE
            binding.nicknameView.visibility = View.VISIBLE
            binding.ageView.visibility = View.VISIBLE
            binding.thankyouText.visibility = View.VISIBLE
            binding.nameText.visibility = View.GONE
            binding.nameEditText.visibility = View.GONE
            binding.nicknameText.visibility = View.GONE
            binding.nicknameEditText.visibility = View.GONE
            binding.helloText.visibility = View.GONE
            binding.ageText.visibility = View.GONE
            binding.ageEditText.visibility = View.GONE
            binding.bdayText.visibility = View.GONE
            binding.bdayEditText.visibility = View.GONE
            binding.phonenumberText.visibility = View.GONE
            binding.phonenumberEditText.visibility = View.GONE
            binding.emailaddressEditText.visibility = View.GONE
            binding.emailaddressText.visibility = View.GONE
            binding.courseText.visibility = View.GONE
            binding.courseEditText.visibility = View.GONE
            binding.dreamText.visibility = View.GONE
            binding.dreamEditText.visibility = View.GONE
            binding.crushText.visibility = View.GONE
            binding.crushEditText.visibility = View.GONE
            binding.messageText.visibility = View.GONE
            binding.multilineText.visibility = View.GONE
            binding.doneButton.visibility = View.GONE
        }
        //hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}
