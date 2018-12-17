package dsl.mobile.e2e.contexts

import dsl.mobile.e2e.actions.Click

open class Menu(name: String, init: Menu.() -> Unit) : Context(name, init as Context.() -> Unit) {

    open fun click(item: MenuItem, init: MenuItem.() -> Unit = {}): MenuItem {
        item.init()
        this.actions.add(Click(item))
        return item
    }
}