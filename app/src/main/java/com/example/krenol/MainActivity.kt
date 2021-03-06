package com.example.krenol

import android.graphics.*
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.view.MotionEvent

class MainActivity : AppCompatActivity() {

    var ai1 : AiTicTacToe = AiTicTacToe()
    var playe : RealPlayer = RealPlayer()
    lateinit var v : ViewTTT
    var g : Game = Game(ai1, playe)

    var sd : PlayerVsAiController = PlayerVsAiController(g)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ai1.pTurn = 0
        playe.pTurn = 1
        v = findViewById(R.id.viewttt)
        v.g = g



        v.setOnTouchListener(
            object : View.OnTouchListener {
                override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                    if (p1?.action == MotionEvent.ACTION_DOWN )
                    {
                        var p : Point = Point()

                        if (p1 != null) {
                            p.x = (p1.y / (v.height / g.psize)).toInt()
                            p.y = (p1.x / (v.width / g.psize)).toInt()

                            sd.turni(p)
                        }
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