package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val helloLabel: TextView = findViewById(R.id.helloLabel) as TextView
        helloLabel.text = "Hejsa"

        var firstVal = ""
        var secondVal = ""
        var add = false
        var sub = false

        button_add.setOnClickListener {
            firstVal = display.text.toString()
            display.text = ""
            add = true
        }

        button_sub.setOnClickListener {
            firstVal = display.text.toString()
            display.text = ""
            sub = true
        }


        button_equal.setOnClickListener {
            secondVal = display.text.toString()
            if (add) {
                var result = firstVal.toInt() + secondVal.toInt()
                display.text = ""
                helloLabel.text = "$firstVal + $secondVal = $result"
                add = false
            } else if (sub){
                var result = firstVal.toInt() - secondVal.toInt()
                display.text = ""
                helloLabel.text = "$firstVal - $secondVal = $result"
                sub = false

            }
        }

        num_one.setOnClickListener {
            display.text = display.text.toString() + 1
        }

        num_two.setOnClickListener {
            display.text = display.text.toString() + 2
        }

        num_three.setOnClickListener {
            display.text = display.text.toString() + 3
        }

        num_four.setOnClickListener {
            display.text = display.text.toString() + 4
        }

        num_five.setOnClickListener {
            display.text = display.text.toString() + 5
        }

        num_six.setOnClickListener {
            display.text = display.text.toString() + 6
        }

        num_seven.setOnClickListener {
            display.text = display.text.toString() + 7
        }

        num_eight.setOnClickListener {
            display.text = display.text.toString() + 8
        }

        num_nine.setOnClickListener {
            display.text = display.text.toString() + 9
        }

        button_clear.setOnClickListener {
            display.text = ""
            helloLabel.text = ""
        }


    }
}
