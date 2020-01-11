package com.example.krenol

import android.graphics.Point

class PlayerVsPlayerController(gn: Game) : Controller(gn) {
    override fun turni(p: Point) {
        if (g.pole[p.x][p.y]==0 && !g.check()) {
            setPlace(p, getC())
            g.turn++
        }
    }

}