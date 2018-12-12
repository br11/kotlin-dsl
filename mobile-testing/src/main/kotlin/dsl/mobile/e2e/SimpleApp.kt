package dsl.mobile.e2e


class SimpleApp(override val name: String) : Element(name) {

    fun atScreen(screenName: String, init: SimpleScreen.() -> Unit) {

    }

}