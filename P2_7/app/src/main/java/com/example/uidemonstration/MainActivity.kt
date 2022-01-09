package com.example.uidemonstration

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
        val toggle:ToggleButton = findViewById(R.id.toggleButton)
        val checkBoxChecked:String = if (checkBox.isChecked){"ON"} else{"OFF"}
        val toggleChecked:String = if(toggle.isChecked){"ON"} else{"OFF"}
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup);
        var radioChecked = ""
        when (radioGroup.checkedRadioButtonId) {
            R.id.radioButton -> radioChecked = "RadioButton 1"
            R.id.radioButton2 -> radioChecked = "RadioButton 2"
        }
        val string:String = "EditText: ${editText.text}\n" +
                "CheckBox: $checkBoxChecked\n" +
                "ToggleButton: $toggleChecked\n" +
                "RadioGroup: $radioChecked"
        val text:TextView = findViewById(R.id.textView)
        text.text = string
    }
}