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

                click(Menu("Main"))

                click(Menu("Main")) {
                    click(MenuItem("Transfer", this)) {
                        click(MenuItem("Today", this))
                    }
                }

                click(Input("User")) {
                    type("myuser")
                }

                click(Input("Password")) {
                    type("123456")
                }

                click(Button("Connect"))
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

                clickMenu("Main")

                clickMenu("Main") {
                    click(MenuItem("Transfer", this)) {
                        click(MenuItem("Today", this))
                    }
                }

                clickInput("User") {
                    type("myuser")
                }

                clickInput("Password") {
                    type("123456")
                }

                clickButton("Connect")

            }

        }
    }

    simpleScenario.run()
}
