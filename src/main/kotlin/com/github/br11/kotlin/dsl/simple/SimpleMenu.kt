package com.github.br11.kotlin.dsl.simple

import com.github.br11.kotlin.dsl.contexts.Menu
import com.github.br11.kotlin.dsl.contexts.MenuItem

open class SimpleMenu(name: String, init: SimpleMenu.() -> Unit) : Menu(name, init as Menu.() -> Unit) {

    open fun clickItem(itemName: String, init: SimpleMenuItem.() -> Unit = {}): MenuItem {
        return click(SimpleMenuItem(itemName, this, init), init as MenuItem.() -> Unit)
    }
}