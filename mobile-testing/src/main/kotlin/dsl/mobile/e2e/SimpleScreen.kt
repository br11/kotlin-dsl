package dsl.mobile.e2e

class SimpleScreen(val screen: Screen) : Element(screen.name) {

    fun clickButton(name: String) {
        screen.click(Button(name))
    }

    fun clickMenu(name: String, init: Menu.() -> Unit = {}) {
        screen.click(Menu(name), init)
    }

    fun clickInput(name: String, init: Input.() -> Unit = {}) {
        screen.click(Input(name), init)
    }

    fun swipeLeft(qtd: Int) {
        screen.swipe(SwipeConfig(qtd, Direction.Left))
    }

    fun swipeRight(qtd: Int) {
        screen.swipe(SwipeConfig(qtd, Direction.Right))
    }


    val Once = 1
    val Twice = 2
    val ThreeTimes = 3
    val ManyTimes = 10

}


