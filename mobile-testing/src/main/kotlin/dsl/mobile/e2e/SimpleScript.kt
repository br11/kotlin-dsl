package dsl.mobile.e2e

import dsl.mobile.e2e.simple.SimpleApp

class SimpleScript : Script {

    val open = this

    constructor(name: String, init: SimpleScript.() -> Unit) : super(name, {}) {
        this.init()
    }

    fun openApp(appName: String, init: SimpleApp.() -> Unit) {
        super.open(SimpleApp(appName, init))
    }

    infix fun SimpleScript.app(that: String): SimpleApp {
        return SimpleApp(that, { })
    }

    infix fun SimpleApp.than(that: SimpleApp.() -> Unit) {
        this.that()
        super.open(this)
    }
}
