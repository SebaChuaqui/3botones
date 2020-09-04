package com.example.a3botones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{textView.text =numbersList.toString()}
        button2.setOnClickListener{textView.text = instanceList.toString()}
        button3.setOnClickListener{textView.text = numbersMap.toString()}
    }
    private val numbersList = listOf("one", "five", "two", "three", "four")

    private val instanceList = listOf(null, 1, "two", 3.0, "four")

    private val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)


    fun filterButton(button : List<String>): List<String> {
        return button.filter { it.startsWith("t") }

        fun filterButton2(button2: List<String>): List<String> {
            return button2.filter { it.startsWith("t") }

            fun filterButton3(button3: List<String>): List<String>{
                return button3.filter{it.startsWith("t")}

            }
        }
    }
}
