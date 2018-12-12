package dsl.mobile.e2e

class Scenario {

    fun openApp(appName: String, init: App.() -> Unit) {

    }

    fun run(){

    }
}

fun build(configName: String, init: Scenario.() -> Unit): Scenario {
    val scenario = Scenario();
    scenario.init()

    return scenario
}
