package dsl.mobile.e2e.simple

import dsl.mobile.e2e.contexts.App


class SimpleApp(name: String, init: SimpleApp.() -> Unit) : App(name, init as App.() -> Unit) {

    fun atScreen(screenName: String, init: SimpleScreen.() -> Unit) {
        super.atScreen(SimpleScreen(screenName, init))
    }

}