# kotlin-dsl
Domain-specific Language in Kotlin


````kotlin
fun main(args: Array<String>) {

    val scenario = build("ct-Login-001") {

        openApp("My Bank") {

            atScreen("Avisos") {
                swipeLeft() { twice() }
            }

            atScreen("Welcome") {
                findButton("Enter")

                clickButton("Enter")

                selectText("User ID")

                clickInput("User") {
                    selectContent {
                        whole()
                    }
                    type("myuser")
                }

                selectText("Password") { range(0, 2) }

                clickInput("Password") {
                    type("123456")
                }

                clickButton("Connect")
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
````
