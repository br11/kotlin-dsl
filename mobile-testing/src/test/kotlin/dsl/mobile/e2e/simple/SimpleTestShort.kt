package dsl.mobile.e2e.simple

import dsl.mobile.e2e.SimpleScript

fun main(args: Array<String>) {

    val scenario = SimpleScript("ct-Login-001") {

        openApp("My Bank") {

            atScreen("Tips") {
                swipeLeft() { twice() }
            }

            atScreen("Welcome") {
                clickButton("Connect")

                clickInput("User") {
                    selectContent {
                        whole()
                        clear()
                    }

                    type("myuser")
                }

                clickInput("Password") { type("123456") }

                clickButton("Enter")
            }

            atScreen("My Relationship") {
                clickMenu("Main") {
                    clickItem("Transfer") {
                        clickItem("Today")
                    }
                }
            }

        }
    }

    scenario.run()
}
