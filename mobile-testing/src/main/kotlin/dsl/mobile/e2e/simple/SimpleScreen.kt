package dsl.mobile.e2e.simple

import dsl.mobile.e2e.*

class SimpleScreen(override val name: String) : Screen(name) {

    fun clickButton(name: String) {
        click(Button(name))
    }

    fun clickMenu(name: String, action: SimpleMenu.() -> Unit = {}) {
        click(SimpleMenu(name), { action })
    }

    fun clickInput(name: String, action: Input.() -> Unit = {}) {
        click(Input(name), action)
    }

    fun selectText(name: String, action: Text.() -> String = { whole() }) {
        select(Text(name), action)
    }

    fun findButton(name: String) {
        find(Button(name))
    }

    fun findMenu(name: String) {
        find(Menu(name))
    }

    fun findInput(name: String) {
        find(Input(name))
    }

    fun findText(name: String) {
        find(Text(name))
    }

    fun swipeLeft(action: SwipeConfig.() -> SwipeConfig = { once() }) {
        swipe(SwipeConfig(1, Direction.Left).action())
    }

    fun swipeRight(action: SwipeConfig.() -> SwipeConfig = { once() }) {
        swipe(SwipeConfig(1, Direction.Right).action())
    }

}


