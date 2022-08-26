package com.geektech.lk5_2


import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.geektech.lk5_2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {


    private lateinit var binding:ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textResult.setText(intent.getStringExtra(KEI_ONE))

        binding.btnTwo.setOnClickListener {
            setResult(
                RESULT_OK, Intent().putExtra(KEI_TWO, binding.textResult.text.toString())
            )
            finish()


        }
        fun Context.showToast(message: String){
            Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
        }

    }
}