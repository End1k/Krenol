package com.example.krenol
import android.graphics.Point
import com.example.krenol.Game
import com.example.krenol.Player

open class Controller(gn: Game) {
    var g: Game = gn
    var p1 : Player?
    var p2 : Player?
    init {
        p1 = g.p1
        p2 = g.p2
    }


    var turn : Int = 0


    fun checkTurn(): Boolean{
        return (g.turn%2 == g.thisPlayer)
    }
    fun getPlayer(): Player?
    {
        if (g.turn%2 == 1) return p1
        if (g.turn%2 == 0) return p2
        return Player()
    }
    fun getC(): Int
    {
        if (g.turn%2 == 1) return 1
        if (g.turn%2 == 0) return 2
        return 0
    }

    fun getSC(): Int
    {
        if (g.turn%2 == 1) return 2
        if (g.turn%2 == 0) return 1
        return 0
    }


    fun setPlace(p :Point, char : Int){
        g.pole[p.x][p.y] = char
    }

    open fun turni(p: Point) {

    }
}