package com.example.eventcalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(v: View){
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup2);
        val mood: ImageView = findViewById(R.id.mood)
        when (radioGroup.checkedRadioButtonId) {
            R.id.good -> mood.setImageResource(R.drawable.cheerful)
            R.id.bad -> mood.setImageResource(R.drawable.cry)
        }
    }
    fun saveClick(v: View){
        val vevent: EditText = findViewById(R.id.vevent);
        val time: EditText = findViewById(R.id.time);
        val vdata: EditText = findViewById(R.id.vdata);
        val post: EditText = findViewById(R.id.post);
        val string:String = "Записано!\n" +
                            "Событие: ${vevent.text}\n" +
                            "Дата: ${vdata.text}\n" +
                            "Время: ${time.text}\n" +
                            "Заметки: ${post.text}"
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
        vevent.text.clear();
        time.text.clear();
        vdata.text.clear();
        post.text.clear();
    }
}

