package dsl.mobile.e2e


open class App(override val name: String) : Element(name) {

    fun atScreen(screen: Screen, action: Screen.() -> Unit) {

    }

}