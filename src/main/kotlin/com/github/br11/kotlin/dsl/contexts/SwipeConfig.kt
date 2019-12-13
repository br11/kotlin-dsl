package com.github.br11.kotlin.dsl.contexts

open class SwipeConfig(protected var times: Int = 1, val direction: Direction = Direction.Right) {

    companion object {
        val Left = SwipeConfig(1, Direction.Left)
        val Right = SwipeConfig(1, Direction.Left)
    }

    fun once() {
        this.times *= 1
    }

    fun twice() {
        this.times *= 2
    }

    fun onceMore() {
        this.times += 1
    }

    fun twiceMore() {
        this.times += 1
    }

    fun Thrice() {
        this.times *= 3
    }

    override fun toString(): String {
        return "${direction} ${times} time(s)"
    }
}

enum class Direction {
    Left, Right, Up, Down
}


