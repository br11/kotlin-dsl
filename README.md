# kotlin-dsl

## Mobile Automation Domain-specific Language in Kotlin


#### Small and Non-Orthogonal
````kotlin
package dsl.mobile.e2e.simple

import dsl.mobile.e2e.SimpleScript

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

                clickAt button "Enter"
            }

        }
    }

    scenario.run()
}
````


#### Using Infix Fucntions - good to read but no so good to write

````kotlin
package dsl.mobile.e2e.simple

import dsl.mobile.e2e.SimpleScript

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
                clickAt input "100.00" type "Amount"
                clickAt input "237" type "Bank"
                clickAt input "10209.9" type "Account"

                clickAt button "Send"
            }

        }
    }

    scenario.run()
}
````

#### Orthogonal
````kotlin
package dsl.mobile.e2e

import dsl.mobile.e2e.contexts.*

fun main(args: Array<String>) {

    val scenario = Script("ct-Login-001") {

        open(App("My Bank", {

            at(Screen("Avisos", {
                swipe(SwipeConfig.Left) { twice() }
            }))

            at(Screen("Welcome", {
                find(Button("Enter", {}))

                click(Button("Enter", {}))

                select(Text("User ID", {}))

                click(Input("User", {
                    selectContent {
                        whole()
                    }
                    type("myuser")
                }))

                click(Input("Password", {
                    type("123456")
                }))

                click(Button("Connect", {}))
            }))

            at(Screen("My Relationship", {

                click(Menu("Main", {
                    click(MenuItem("Transfer", this, {})) {
                        click(MenuItem("Today", this, {}))
                    }
                }))

            }))
        }))
    }

    scenario.run()
}
````