package com.github.br11.kotlin.dsl

import com.github.br11.kotlin.dsl.Script
import com.github.br11.kotlin.dsl.contexts.*

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
