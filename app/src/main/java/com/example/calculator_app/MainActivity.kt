package com.example.calculator_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.btnAddition
import kotlinx.android.synthetic.main.activity_main.btnDivition
import kotlinx.android.synthetic.main.activity_main.btnMultification
import kotlinx.android.synthetic.main.activity_main.btnSubstraction
import kotlinx.android.synthetic.main.activity_main.inputNum1
import kotlinx.android.synthetic.main.activity_main.inputNum2
import kotlinx.android.synthetic.main.activity_main.textAnswer


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnAddition.setOnClickListener(){

            val input1 = inputNum1.text.toString().toInt()
            val input2 = inputNum2.text.toString().toInt()

            textAnswer.text = (input1 + input2).toString()

        }
        btnSubstraction.setOnClickListener(){

            val input1 = inputNum1.text.toString().toInt()
            val input2 = inputNum2.text.toString().toInt()

            textAnswer.text = (input1 - input2).toString()

        }
        btnMultification.setOnClickListener(){

            val input1 = inputNum1.text.toString().toInt()
            val input2 = inputNum2.text.toString().toInt()

            textAnswer.text = (input1 * input2).toString()

        }
        btnDivition.setOnClickListener(){

            val input1 = inputNum1.text.toString().toInt()
            val input2 = inputNum2.text.toString().toInt()

            textAnswer.text = (input1 / input2).toFloat().toString()

        }


    }

}