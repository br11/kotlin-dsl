package com.github.br11.kotlin.dsl.actions

import com.github.br11.kotlin.dsl.contexts.*

open class Action<T>(open val target: T) {

    override fun toString(): String {
        return "${javaClass.kotlin.simpleName} ${target.toString()}"
    }

    fun eval() {
        println(this)
        if (target is Context) {
            (target as Context).run()
        }
    }

}

fun main(args: Array<String>) {
    println(Action(Button("ok", {})))
    println(Click(Button("ok", {})))
    println(Select(Text("ok", {})))
    println(Swipe(SwipeConfig(2, Direction.Left)))
}