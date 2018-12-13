package dsl.mobile.e2e

open class SimpleMenu(override open val name: String) : Menu(name) {

    companion object {
        val Main = Menu("Main")
        val Left = Menu("Left")
        val Right = Menu("Right")
    }

    open fun clickItem(itemName: String, action: SimpleMenuItem.() -> Unit = {}): MenuItem {
        return click(SimpleMenuItem(itemName, this), { action })
    }
}