package dsl.mobile.e2e

import dsl.mobile.e2e.simple.SimpleApp

class SimpleScript(name: String = "", val init: SimpleScript.() -> Unit) : Script(name, init as Script.() -> Unit) {

    fun openApp(appName: String, init: SimpleApp.() -> Unit) {
        super.openApp(SimpleApp(appName, init))
    }

}
