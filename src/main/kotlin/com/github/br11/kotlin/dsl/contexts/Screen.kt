package com.github.br11.kotlin.dsl.contexts

import com.github.br11.kotlin.dsl.actions.Click
import com.github.br11.kotlin.dsl.actions.Find
import com.github.br11.kotlin.dsl.actions.Select
import com.github.br11.kotlin.dsl.actions.Swipe

open class Screen(name: String, init: Screen.() -> Unit) : Context(name, init as Context.() -> Unit) {

    fun <T : Context> click(elem: T) {
        this.actions.add(Click(elem))
    }

    fun <T : Text> select(elem: T) {
        this.actions.add(Select(elem))
    }

    fun <T : SwipeConfig> swipe(config: T, init: T.() -> Unit) {
        config.init()
        this.actions.add(Swipe(config))
    }

    fun <T : Context> find(elem: T) {
        this.actions.add(Find(elem))
    }

    companion object {
        val Left = SwipeConfig(1, Direction.Left)
        val Right = SwipeConfig(1, Direction.Left)
    }
}


