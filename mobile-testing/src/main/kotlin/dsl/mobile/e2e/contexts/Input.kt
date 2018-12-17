package dsl.mobile.e2e.contexts

import dsl.mobile.e2e.actions.Clear
import dsl.mobile.e2e.actions.Select
import dsl.mobile.e2e.actions.Type

open class Input(name: String, init: Input.() -> Unit) : Context(name, init as Context.() -> Unit) {
    fun type(content: String) {
        actions.add(Type(content))
    }

    fun clear() {
        actions.add(Clear())
    }

    open fun selectContent(init: Text.() -> Unit = { whole() }): String {
        val innerText = Text(name, init)
        actions.add(Select(innerText))
        return innerText.selection
    }
}