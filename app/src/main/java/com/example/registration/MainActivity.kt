package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
 override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)
     binding.register.setOnClickListener { sineup() }

    }
    fun sineup(){
        var name = binding.name.text.toString()
        var pass1 = binding.editTextTextPassword1.text.toString()
        var pass2 = binding.editTextTextPassword2.text.toString()
        var email = binding.Email.text.toString()
        var birth = binding.birth.text.toString()
        if (name.isEmpty()||pass1.isEmpty()||pass2.isEmpty()||email.isEmpty()||birth.isEmpty()){
            binding.massage.text = "empty"
        }
        else if (pass1!=pass2){
            binding.massage.text = "password is not same"
        } else {
            binding.massage.text = "${name}\n${email}"

        }
    }
}
