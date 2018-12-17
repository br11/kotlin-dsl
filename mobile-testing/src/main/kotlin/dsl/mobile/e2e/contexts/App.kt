package dsl.mobile.e2e.contexts

import dsl.mobile.e2e.actions.Find


open class App(name: String, init: App.() -> Unit) : Context(name, init as Context.() -> Unit   ) {

    fun <T : Screen> atScreen(screen: T) {
        actions.add(Find(screen))
    }

}