package dsl.mobile.e2e

fun main(args: Array<String>) {

    val scenario = build("ct-Login-001") {
        openApp("My Bank") {

            atScreen("Avisos") {
                swipe(SwipeConfig.Right)
                swipe(SwipeConfig.Left.twice())
            }

            atScreen("Welcome") {
                click(Button("Enter"))

                click(Input("User")) {
                    type("myuser")
                }

                click(Input("Password")) {
                    type("123456")
                }

                click(Button("Connect"))
            }

            atScreen("My Relationship") {

                click(Menu("Main")) {
                    click(MenuItem("Transfer", this)) {
                        click(MenuItem("Today", this))
                    }
                }

            }
        }
    }


    scenario.run()


    val simpleScenario = buildSimple("ct-Login-001") {
        openApp("My Bank") {

            atScreen("Avisos") {
                swipeRight(Once)
                swipeLeft(Twice)
            }

            atScreen("Welcome") {
                clickButton("Enter")


                clickInput("User") {
                    type("myuser")
                }

                clickInput("Password") {
                    type("123456")
                }

                clickButton("Connect")

            }

            atScreen("My Relationship") {

                clickMenu("Main") {
                    click(MenuItem("Transfer", this)) {
                        click(MenuItem("Today", this))
                    }
                }

            }

        }
    }

    simpleScenario.run()
}
