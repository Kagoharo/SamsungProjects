package com.example.statecontroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import java.util.concurrent.TimeUnit

const val NCREATE = "Activity CREATED"
const val NSTART = "Activity STARTED"
const val NRESUME = "Activity RESUMED"
const val NPAUSE = "Activity PAUSED"
const val NSTOP = "Activity STOPPED"
const val NRESTART = "Activity RESTARTED"
const val NDESTROY = "Activity DESTROYED"

class MainActivity : AppCompatActivity() {
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        val z = Toast.makeText(this,NCREATE,Toast.LENGTH_SHORT)
        z.setGravity(Gravity.NO_GRAVITY,0,0)
        z.show()
    }

    override fun onStart() {
        super.onStart()
        val z = Toast.makeText(this, NSTART,Toast.LENGTH_SHORT)
        z.setGravity(Gravity.LEFT,0,0)
        z.show()
    }

    override fun onResume() {
        super.onResume()
        val z = Toast.makeText(this, NRESUME,Toast.LENGTH_SHORT)
        z.setGravity(Gravity.TOP,0,0)
        z.show()
    }

    override fun onPause() {
        super.onPause()
        val z = Toast.makeText(this, NPAUSE,Toast.LENGTH_SHORT)
        z.setGravity(Gravity.RIGHT,0,0)
        z.show()
    }

    override fun onStop() {
        super.onStop()
        val z = Toast.makeText(this, NSTOP,Toast.LENGTH_SHORT)
        z.setGravity(Gravity.CENTER,0,0)
        z.show()
    }

    override fun onRestart() {
        super.onRestart()
        val z = Toast.makeText(this, NRESTART,Toast.LENGTH_SHORT)
        z.setGravity(Gravity.FILL_HORIZONTAL,0,0)
        z.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val z = Toast.makeText(this, NDESTROY,Toast.LENGTH_SHORT)
        z.setGravity(Gravity.FILL,0,0)
        z.show()
    }
}
