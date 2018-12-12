package dsl.mobile.e2e

class SimpleScenario {

    fun openApp(appName: String, init: SimpleApp.() -> Unit) {

    }

    fun run(){

    }
}

fun buildSimple(configName: String, init: SimpleScenario.() -> Unit): SimpleScenario {
    val scenario = SimpleScenario();
    scenario.init()

    return scenario
}
