package dsl.mobile.e2e


class App(override val name: String) : Element(name) {

    fun atScreen(screenName: String, init: Screen.() -> Unit) {

    }

}