package dsl.mobile.e2e

fun main(args: Array<String>) {

    val scenario = build("ct-Login-001") {
        openApp(App("My Bank")) {

            atScreen(Screen("Avisos")) {
                swipe(SwipeConfig.Left.twice())
            }

            atScreen(Screen("Welcome")) {
                find(Button("Enter"))

                click(Button("Enter"))

                select(Text("User ID"))

                click(Input("User")) {
                    selectContent {
                        whole()
                    }
                    type("myuser")
                }

                click(Input("Password")) {
                    type("123456")
                }

                click(Button("Connect"))
            }

            atScreen(Screen("My Relationship")) {

                click(Menu("Main")) {
                    click(MenuItem("Transfer", this)) {
                        click(MenuItem("Today", this))
                    }
                }

            }
        }
    }


    scenario.run()
}
