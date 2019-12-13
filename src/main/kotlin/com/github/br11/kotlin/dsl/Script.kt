package com.github.br11.kotlin.dsl

import com.github.br11.kotlin.dsl.actions.Open
import com.github.br11.kotlin.dsl.contexts.App
import com.github.br11.kotlin.dsl.contexts.Context

open class Script : Context {

    constructor(name: String, init: Script.() -> Unit) : super(name, init as Context.() -> Unit) {

    }

    fun open(app: App) {
        actions.add(Open(app))
    }
}
