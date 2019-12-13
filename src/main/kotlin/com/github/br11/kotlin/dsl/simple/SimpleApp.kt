package com.github.br11.kotlin.dsl.simple

import com.github.br11.kotlin.dsl.contexts.App


class SimpleApp(name: String, init: SimpleApp.() -> Unit) : App(name, init as App.() -> Unit) {

    val at = this

    fun atScreen(screenName: String, init: SimpleScreen.() -> Unit) {
        super.at(SimpleScreen(screenName, init))
    }

    infix fun SimpleApp.screen(that: String): SimpleScreen {
        return SimpleScreen(that, {})
    }

    infix fun SimpleScreen.than(that: SimpleScreen.() -> Unit) {
        this.that()
        at(this)
    }
}