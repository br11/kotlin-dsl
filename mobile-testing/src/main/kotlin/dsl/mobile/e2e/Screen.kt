package dsl.mobile.e2e

open class Screen(override val name: String) : Element(name) {

    fun click(button: Button) {

    }

    fun click(menu: Menu, init: Menu.() -> Unit = {}) {

    }

    fun click(input: Input, init: Input.() -> Unit = {}) {

    }

    fun swipe(config: SwipeConfig) {

    }

    companion object {
        val Left = SwipeConfig(1, Direction.Left)
        val Right = SwipeConfig(1, Direction.Left)
    }

}


