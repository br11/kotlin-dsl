package com.github.br11.kotlin.dsl.simple

import com.github.br11.kotlin.dsl.SimpleScript

fun main(args: Array<String>) {

    val scenario = SimpleScript("ct-Login-001") {

        openApp("My Bank") {

            atScreen("Tips") {
                swipeLeft { twice() }
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
                clickMenu("Main", "Transfer", "Today")
            }

            atScreen("Transfer") {
                type { "100.00" into "Amount" }
                type { "237" into "Bank" }
                type { "10209.9" into "Account" }

                clickButton("Send")
            }

        }
    }

    scenario.run()
}
