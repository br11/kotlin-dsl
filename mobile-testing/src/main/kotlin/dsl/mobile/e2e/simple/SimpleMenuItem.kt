package dsl.mobile.e2e

import dsl.mobile.e2e.contexts.Menu
import dsl.mobile.e2e.contexts.MenuItem

class SimpleMenuItem(name: String, override var parent: Menu, init: SimpleMenuItem.() -> Unit) : MenuItem(name, parent, init as MenuItem.() -> Unit) {

}

