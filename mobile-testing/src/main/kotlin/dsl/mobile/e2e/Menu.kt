package dsl.mobile.e2e

open class Menu(override val name: String) : Element(name){

    companion object {
        val Main = Menu("Main")
        val Left = Menu("Left")
        val Right = Menu("Right")
    }

    open fun click(item: MenuItem): MenuItem {
        return click(item) {}
    }

    open fun click(item: MenuItem, init: MenuItem.() -> Unit): MenuItem {
        item.init()
        return item
    }
}