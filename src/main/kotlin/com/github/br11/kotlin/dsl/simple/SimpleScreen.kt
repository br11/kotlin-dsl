package com.github.br11.kotlin.dsl.simple

import com.github.br11.kotlin.dsl.contexts.*

class SimpleScreen : Screen {

    val clickAt = this
    val swipe = this

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

    infix fun SimpleScreen.button(that: String) {
        clickButton(that, {})
    }

    infix fun SimpleScreen.menu(that: String) {
        clickMenu(that, {})
    }

    infix fun SimpleScreen.menus(that: Array<String>) {
        that.forEach {
            clickMenu(it, {})
        }
    }

    infix fun SimpleScreen.input(that: String): Input {
        return Input(that, {})
    }

    infix fun Input.type(that: String) {
        this.type(that)
        click(this)
    }

    infix fun Input.than(that: Input.() -> Unit) {
        this.that()
        click(this)
    }

    infix fun SimpleScreen.left(that: Int): Direction {
        return Direction.Left
    }

}


