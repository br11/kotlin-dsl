package com.github.br11.kotlin.dsl.simple

import com.github.br11.kotlin.dsl.contexts.Menu
import com.github.br11.kotlin.dsl.contexts.MenuItem

class SimpleMenuItem(name: String, override var parent: Menu, init: SimpleMenuItem.() -> Unit) : MenuItem(name, parent, init as MenuItem.() -> Unit) {

}

