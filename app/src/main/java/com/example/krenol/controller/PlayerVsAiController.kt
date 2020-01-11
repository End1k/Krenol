package com.example.krenol

import android.graphics.Point
import android.util.Log


class PlayerVsAiController(gn: Game) : Controller(gn) {
    override fun turni(p: Point) {
        if (g.pole[p.x][p.y]==0 && !g.check()) {
            if (checkTurn()) {
                setPlace(p, getC())
                g.turn++
                turni(getPlayer()!!.turning(g))
            }
            else {
                setPlace(p, getC())
                g.turn++
            }
        }
    }

}