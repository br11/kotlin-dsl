package dsl.mobile.e2e

import dsl.mobile.e2e.actions.Open
import dsl.mobile.e2e.contexts.App
import dsl.mobile.e2e.contexts.Context

open class Script : Context {

    constructor(name: String, init: Script.() -> Unit) : super(name, init as Context.() -> Unit) {

    }

    fun openApp(app: App) {
        actions.add(Open(app))
    }
}
