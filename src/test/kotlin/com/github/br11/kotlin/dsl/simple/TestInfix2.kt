package com.github.br11.kotlin.dsl.simple

import com.github.br11.kotlin.dsl.SimpleScript

fun main(args: Array<String>) {

    val scenario = SimpleScript("ct-Login-001") {

        open app "My Bank" than {

            at screen "Tips" than {
                swipe left 2
            }

            at screen "Welcome" than {
                clickAt button "Connect"

                clickAt input "User" than {
                    select range (1 to 10)
                    clear range (1 to 10)

                    this type "myuser"
                }

                clickAt input "Password" type "123456"

                clickAt button "Enter"
            }

            at screen "My Relationship" than {
                clickAt menus arrayOf("Main", "Transfer", "Today")
            }

            at screen "Transfer" than {
                clickAt input "Amount" type "100.00"
                clickAt input "Bank" type "237"
                clickAt input "Account" type "10209.9"
                clickAt button "Send"
            }

        }
    }

    scenario.run()
}
