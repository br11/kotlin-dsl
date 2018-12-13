package dsl.mobile.e2e

open class Screen(override val name: String) : Element(name) {

    fun click(button: Button) {
        find(button)
    }

    fun click(menu: Menu, action: Menu.() -> Unit = { }) {
        find(menu)
    }

    fun click(input: Input, action: Input.() -> Unit = { }) {
        find(input)
    }

    fun select(text: Text, action: Text.() -> String = { whole() }) {
        find(text)
    }

    fun swipe(config: SwipeConfig) {

    }

    fun find(button: Button) {

    }

    fun find(menu: Menu) {

    }

    fun find(input: Input) {

    }

    fun find(text: Text) {

    }


    companion object {
        val Left = SwipeConfig(1, Direction.Left)
        val Right = SwipeConfig(1, Direction.Left)
    }

}


