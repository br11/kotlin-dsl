package dsl.mobile.e2e.simple

import dsl.mobile.e2e.Scenario

class SimpleScenario(override val name: String) : Scenario(name) {

    fun openApp(appName: String, action: SimpleApp.() -> Unit) {

    }

}

fun build(name: String, action: SimpleScenario.() -> Unit): SimpleScenario {
    val scenario = SimpleScenario(name);
    scenario.action()

    return scenario
}
