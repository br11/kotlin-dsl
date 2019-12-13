package com.github.br11.kotlin.dsl.contexts

import com.github.br11.kotlin.dsl.actions.Action

open class Context {

    protected val actions: MutableList<Action<out Any>> = mutableListOf()

    protected var name: String = ""

    constructor(name: String, init: Context.() -> Unit) {
        this.name = name
        this.init()
    }

    fun config(name: String) {
        this.name = name
    }

    override fun toString(): String {
        return "${javaClass.kotlin.simpleName} [${name}]"
    }

    open fun run() {
        actions.forEach({
            it.eval()
        })
    }
}