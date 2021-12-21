package com.example.lab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun show(v: View){
        val editText: EditText = findViewById(R.id.editText);
        val checkBox: CheckBox = findViewById(R.id.checkBox)
        val check:String
        val toggle:ToggleButton = findViewById(R.id.toggleButton)
        val toggle_checked:String
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup);
        var radio_checked:String = ""
        if (checkBox.isChecked){
            check = "ON"
        }
        else{
            check = "OFF"
        }
        if(toggle.isChecked){
            toggle_checked = "ON"
        }
        else{
            toggle_checked = "OFF"
        }
        when (radioGroup.checkedRadioButtonId) {
            R.id.radioButton -> radio_checked = "RadioButton 1"
            R.id.radioButton2 -> radio_checked = "RadioButton 2"
        }
        val string:String = "EditText: ${editText.text}\n" +
                            "CheckBox: $check\n" +
                            "ToggleButton: $toggle_checked\n" +
                            "RadioGroup: $radio_checked"
        val text:TextView = findViewById(R.id.textView)
        text.setText(string)
    }
}