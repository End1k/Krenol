package com.example.krenol

import android.graphics.Point
import com.example.krenol.Game

open class Player() {
    var pTurn = -1

    open fun turning(g: Game) : Point
    {
        return Point()
    }

}