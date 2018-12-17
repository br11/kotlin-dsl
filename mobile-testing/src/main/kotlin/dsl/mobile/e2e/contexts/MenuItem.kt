package dsl.mobile.e2e.contexts

open class MenuItem(name: String, open var parent: Menu, init: MenuItem.() -> Unit) : Menu(name, init as Menu.() -> Unit) {

}

