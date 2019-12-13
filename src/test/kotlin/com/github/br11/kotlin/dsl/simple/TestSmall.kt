package com.github.br11.kotlin.dsl.simple

import com.github.br11.kotlin.dsl.SimpleScript

fun main(args: Array<String>) {

    val scenario = SimpleScript("ct-Login-001") {

        openApp("My Bank") {

            atScreen("Avisos") {
                swipeLeft() { twice() }
            }

            atScreen("Welcome") {

                clickButton("Enter")

                clickInput("User") {
                    selectContent { whole() }
                    type("myuser")
                }

                clickInput("Password") { type("123456") }

                clickButton("Connect")
            }

            atScreen("My Relationship") {

                clickMenu("Main") {
                    clickItem("Transfer") {
                        clickItem("Today")
                    }
                }

            }

            atScreen("Transfer") {

                clickInput("Amount") { type("100.00") }
                clickInput("Bank") { type("237") }
                clickInput("Account") { type("0923797") }

                clickButton("Send")
            }


        }

    }

    scenario.run()
}
