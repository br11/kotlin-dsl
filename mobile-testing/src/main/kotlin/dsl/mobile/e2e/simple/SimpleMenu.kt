package dsl.mobile.e2e

import dsl.mobile.e2e.contexts.Menu
import dsl.mobile.e2e.contexts.MenuItem

open class SimpleMenu(name: String, init: SimpleMenu.() -> Unit) : Menu(name, init as Menu.() -> Unit) {

    open fun clickItem(itemName: String, init: SimpleMenuItem.() -> Unit = {}): MenuItem {
        return click(SimpleMenuItem(itemName, this, init), init as MenuItem.() -> Unit)
    }
}