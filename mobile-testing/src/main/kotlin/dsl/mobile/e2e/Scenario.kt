package dsl.mobile.e2e

open class Scenario(override val name: String) : Element(name) {

    fun openApp(app: App, action: App.() -> Unit) {

    }

    fun run(){

    }
}

fun build(name: String, action: Scenario.() -> Unit): Scenario {
    val scenario = Scenario(name);
    scenario.action()

    return scenario
}
