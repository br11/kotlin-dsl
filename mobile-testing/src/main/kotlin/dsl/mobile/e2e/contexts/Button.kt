package dsl.mobile.e2e.contexts

open class Button(name: String, init: Button.() -> Unit) : Context(name, init as Context.() -> Unit)