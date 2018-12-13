package dsl.mobile.e2e.simple

import dsl.mobile.e2e.App
import dsl.mobile.e2e.Element


class SimpleApp(override val name: String) : App(name) {

    fun atScreen(screenName: String, action: SimpleScreen.() -> Unit) {

    }

}