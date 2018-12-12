package dsl.mobile.e2e

data class SwipeConfig(
        val times: Int = 1,
        val direction: Direction = Direction.Right
) {

    companion object {
        val Left = SwipeConfig(1, Direction.Left)
        val Right = SwipeConfig(1, Direction.Left)
    }


    fun once(): SwipeConfig {
        //assert this.times is 1
        return SwipeConfig(1, this.direction)
    }

    fun twice(): SwipeConfig {
        return SwipeConfig(this.times * 2, this.direction)
    }

    fun threeTimes(): SwipeConfig {
        return SwipeConfig(this.times * 3, this.direction)
    }

    fun onceMore(): SwipeConfig {
        return SwipeConfig(this.times + 1, this.direction)
    }
}

enum class Direction {
    Left, Right, Up, Down
}


