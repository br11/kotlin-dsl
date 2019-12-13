package com.github.br11.kotlin.dsl.contexts

import com.github.br11.kotlin.dsl.actions.Clear
import com.github.br11.kotlin.dsl.actions.Select
import com.github.br11.kotlin.dsl.actions.Type

open class Input(name: String, init: Input.() -> Unit) : Context(name, init as Context.() -> Unit) {

    val select = "select"
    val clear = "clear"

    fun type(content: String) {
        actions.add(Type(content))
    }

    fun type(init: Any.() -> String) {
        actions.add(Type(this.init()))
    }

    fun clear() {
        actions.add(Clear())
    }

    open fun selectContent(init: Text.() -> Unit = { whole() }) {
        val innerText = Text(name, init)
        actions.add(Select(innerText))
    }

    infix fun String.into(that: String): Input {
        return Input(that, { type(this@into) })
    }

    infix fun String.range(that: Pair<Int, Int>): Input {
        if (this.equals(select))
            this@Input.selectContent { range(that.first, that.second) }
        if (this.equals(clear))
            this@Input.selectContent { clear() }
        return this@Input
    }

}