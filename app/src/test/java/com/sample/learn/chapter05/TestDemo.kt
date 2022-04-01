package com.sample.learn.chapter05

import org.junit.Test

data class Coordinate(val x: Int, val y: Int)
enum class DIRECTION(private val coordinate: Coordinate) {
    EAST(Coordinate(5, -1)),
    WEST(Coordinate(1, 0)),
    SOUTH(Coordinate(0, 1)),
    NORTH(Coordinate(-1, 0));

    fun update(move: Coordinate) =
        Coordinate(coordinate.x + move.x, coordinate.y + move.y)
}

class TestDemo {
    @Test
    fun test01() {
        val c1 = Coordinate(10, 10)
        println(DIRECTION.EAST.update(c1))
    }
}