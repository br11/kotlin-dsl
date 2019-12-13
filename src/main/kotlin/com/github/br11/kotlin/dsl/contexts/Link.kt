package com.github.br11.kotlin.dsl.contexts

open class Link(name: String, init: Link.() -> Unit) : Context(name, init as Context.() -> Unit)  {

}