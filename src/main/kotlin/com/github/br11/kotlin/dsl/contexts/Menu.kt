package com.github.br11.kotlin.dsl.contexts

import com.github.br11.kotlin.dsl.actions.Click

open class Menu(name: String, init: Menu.() -> Unit) : Context(name, init as Context.() -> Unit) {

    open fun click(item: MenuItem, init: MenuItem.() -> Unit = {}): MenuItem {
        item.init()
        this.actions.add(Click(item))
        return item
    }
}