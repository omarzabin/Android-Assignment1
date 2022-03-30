package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flag = "Choose the service "
        var flag2 = "Choose hours "
        val findBT:Button = findViewById(R.id.findBT)
        val spinnerVal1: Spinner = findViewById(R.id.categorySP)
        val spinnerVal2: Spinner = findViewById(R.id.hoursSP)

        var opt = arrayOf("cooking", "washing", "dusting", "dog walking")
        var hou = arrayOf("1","7","9")
        val textFR :TextView=findViewById(R.id.textView2)
        spinnerVal1.adapter=
            ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,opt)
        spinnerVal2.adapter=
            ArrayAdapter(this ,android.R.layout.simple_expandable_list_item_1,hou)
        findBT.setOnClickListener{view ->

        }
        findBT.setOnClickListener{view ->
            if (flag == "cooking") {
                    if (flag2 == "1") {
                        textFR.text = "you will pay "+(1 * 3.75).toString() + " JOD"+" for "+flag2+" hour"
                    }
                    else if (flag2 == "2") {
                        textFR.text = "you will pay "+(2 * 3.75).toString() + " JOD"+" for "+flag2+" hours"
                    }
                    else if (flag2 == "7") {
                        textFR.text = "you will pay "+(7 * 3.75).toString() + " JOD"+" for "+flag2+" hours"
                    }
                    else if (flag2 == "9") {
                        textFR.text = "you will pay "+(9 * 3.75).toString() + " JOD"+" for "+flag2+" hours"
                    }

            }
            else if (flag == "washing") {
                    if (flag2 == "1") {
                        textFR.text = "you will pay "+(1 * 4.75).toString() + " JOD"+" for "+flag2+" hour"
                    }
                    else if (flag2 == "2") {
                        textFR.text = "you will pay "+(2 * 4.75).toString() + " JOD"+" for "+flag2+" hours"
                    }
                    else if (flag2 == "7") {
                        textFR.text = "you will pay "+(7 * 4.75).toString() + " JOD"+" for "+flag2+" hours"
                    }
                    else if (flag2 == "9") {
                        textFR.text = "you will pay "+(9 * 4.75).toString() + " JOD"+" for "+flag2+" hours"
                    }
            }
            else if (flag == "dusting") {
                if (flag2 == "1") {
                    textFR.text = "you will pay "+(1*5).toString()+" JOD"+" for "+flag2+" hour"
                }
                else if (flag2 == "2") {
                    textFR.text = "you will pay "+(2*5).toString()+" JOD"+" for "+flag2+" hours"
                }
                else if (flag2 == "7") {
                    textFR.text = "you will pay "+(7*5).toString()+" JOD"+" for "+flag2+" hours"
                }
                else if (flag2 == "9") {
                    textFR.text = "you will pay "+(9*5).toString()+" JOD"+" for "+flag2+" hours"
                }
            }
            else if (flag == "dog walking") {
                if (flag2 == "1") {
                    textFR.text = "you will pay "+(1*7).toString()+" JOD"+" for "+flag2+" hour"
                }
                else if (flag2 == "2") {
                    textFR.text = "you will pay "+(2*7).toString()+" JOD"+" for "+flag2+" hours"
                }
                else if (flag2 == "7") {
                    textFR.text = "you will pay "+(7*7).toString()+" JOD"+" for "+flag2+" hours"
                }
                else if (flag2 == "9") {
                    textFR.text = "you will pay "+(9*7).toString()+" JOD"+" for "+flag2+" hours"
                }
            }

        }
        spinnerVal1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = opt.get(p2) // p2 is the index of selected ite

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
        spinnerVal2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag2 = hou.get(p2) // p2 is the index of selected ite
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }

    }
}

