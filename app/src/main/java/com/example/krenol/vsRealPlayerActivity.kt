package com.example.krenol

import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class vsRealPlayerActivity : AppCompatActivity() {

    var playe1 : RealPlayer = RealPlayer()
    var playe2 : RealPlayer = RealPlayer()
    lateinit var v : ViewTTT
    var g : Game = Game(playe1, playe2)
    var sd : PlayerVsPlayerController =
        PlayerVsPlayerController(g)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        playe1.pTurn = 0
        playe2.pTurn = 1
        v = findViewById(R.id.viewttt)
        v.g = g

        viewttt.setOnTouchListener(
            object : View.OnTouchListener {
                override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                    var p : Point = Point()

                    if (p1 != null) {
                        p.x = (p1.y / (viewttt.height / g.psize)).toInt()
                        p.y = (p1.x / (viewttt.width / g.psize)).toInt()

                        sd.turni(p)
                    }
                    return true
                }
            })
    }
    fun bclick(v:View)
    {
        g.psize = 10
        g.needToWin = 5
        g.pole = Array(g.psize, { Array(g.psize, {0})})
        g.turn = 0
    }

}