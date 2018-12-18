package dsl.mobile.e2e.simple

import dsl.mobile.e2e.SimpleMenu
import dsl.mobile.e2e.actions.Click
import dsl.mobile.e2e.contexts.*

class SimpleScreen : Screen {

    val clickAt: Click = Click(Button("_FAKE_", {}))

    constructor(name: String, init: SimpleScreen.() -> Unit) : super(name, {}) {
        this.init()
    }

    fun clickButton(name: String, init: Button.() -> Unit = {}) {
        super.click(Button(name, init))
    }

    fun clickMenu(name: String, init: SimpleMenu.() -> Unit = {}) {
        super.click(SimpleMenu(name, init))
    }

    fun clickMenu(vararg names: String) {
        names.forEach {
            clickMenu(it, {})
        }
    }

    fun clickInput(name: String, init: Input.() -> Unit = {}) {
        super.click(Input(name, init))
    }

    fun selectText(name: String, init: Text.() -> Unit = { whole() }) {
        super.select(Text(name, init))
    }

    fun findButton(name: String) {
        super.find(Button(name, {}))
    }

    fun findMenu(name: String) {
        super.find(Menu(name, {}))
    }

    fun findInput(name: String) {
        super.find(Input(name, {}))
    }

    fun findText(name: String) {
        super.find(Text(name, {}))
    }

    fun swipeLeft(init: SwipeConfig.() -> Unit = { once() }) {
        super.swipe(SwipeConfig(1, Direction.Left), init)
    }

    fun swipeRight(init: SwipeConfig.() -> Unit = { once() }) {
        super.swipe(SwipeConfig(1, Direction.Right), init)
    }

//    infix fun String.into(that: String): Input {
//        return Input(that, { type(this@into) })
//    }
//
//    fun type(input: Input) {
//        super.click(input)
//    }

    fun type(input: Input.() -> Input) {
        super.click(Input("", {}).input())
    }

    infix fun Click.button(that: String): Button? {
        clickButton(that, {})
        return null
    }
}


