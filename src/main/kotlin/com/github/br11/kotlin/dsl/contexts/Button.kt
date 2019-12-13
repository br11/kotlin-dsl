package com.github.br11.kotlin.dsl.contexts

open class Button(name: String, init: Button.() -> Unit) : Context(name, init as Context.() -> Unit)