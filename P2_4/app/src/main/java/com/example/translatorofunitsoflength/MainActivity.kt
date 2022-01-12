package com.example.translatorofunitsoflength

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var text: TextView? = null
    var image: ImageView? = null
    var kmT: TextView? = null
    var mT: TextView? = null
    var dmT: TextView? = null
    var cmT: TextView? = null
    var mmT: TextView? = null

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.rezult)
        image = findViewById(R.id.answer)
        kmT = findViewById(R.id.km)
        mT = findViewById(R.id.m)
        dmT = findViewById(R.id.dm)
        cmT = findViewById(R.id.cm)
        mmT = findViewById(R.id.mm)

        image?.setOnTouchListener { view, motionEvent ->
            if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                if (image!!.alpha <= 0.1f)
                    image!!.alpha = 1f
                else
                    image!!.alpha -= 0.1f
            true
        }
    }

    fun buttonClick(v: View) {

        val b: Button = findViewById(R.id.calculate)

        b.setOnClickListener {
            val km = kmT?.text.toString().toDouble()
            val m = mT?.text.toString().toDouble()
            val dm = dmT?.text.toString().toDouble()
            val cm = cmT?.text.toString().toDouble()
            val mm = mmT?.text.toString().toDouble()

            if ((km * 1000 == m) && (dm / 10 == m) && (cm / 100 == m) && (mm / 1000 == m)) {
                text?.text = "Отлично!"
                image?.setImageResource(R.drawable.good)
            } else {
                text?.text = "Повторите материал, ответ неверный!"
                image?.setImageResource(R.drawable.bad)
            }
        }
    }
}
