package com.github.br11.kotlin.dsl.contexts

open class MenuItem(name: String, open var parent: Menu, init: MenuItem.() -> Unit) : Menu(name, init as Menu.() -> Unit) {

}

