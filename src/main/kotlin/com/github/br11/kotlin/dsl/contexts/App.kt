package com.github.br11.kotlin.dsl.contexts

import com.github.br11.kotlin.dsl.actions.Find


open class App(name: String, init: App.() -> Unit) : Context(name, init as Context.() -> Unit   ) {

    fun <T : Screen> at(screen: T) {
        actions.add(Find(screen))
    }

}