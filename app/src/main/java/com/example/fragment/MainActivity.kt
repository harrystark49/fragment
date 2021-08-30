package com.example.fragment

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_blank.*
import kotlinx.android.synthetic.main.fragment_blank2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun frag(a:Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment1,a)
                addToBackStack(null)
                commit()
            }
        }
        
        val f1=BlankFragment()
        val f2=BlankFragment2()


        button.setOnClickListener {
            frag(f1)

        }
        button2.setOnClickListener {
            frag(f2)
        }

    }
}