package dsl.mobile.e2e.contexts

import dsl.mobile.e2e.actions.Click
import dsl.mobile.e2e.actions.Find
import dsl.mobile.e2e.actions.Select
import dsl.mobile.e2e.actions.Swipe

open class Screen(name: String, init: Screen.() -> Unit) : Context(name, init as Context.() -> Unit) {

    fun <T : Context> click(elem: T) {
        this.actions.add(Click(elem))
    }

    fun <T : Text> select(elem: T) {
        this.actions.add(Select(elem))
    }

    fun <T : SwipeConfig> swipe(config: T, init: T.() -> Unit) {
        config.init()
        this.actions.add(Swipe(config))
    }

    fun <T : Context> find(elem: T) {
        this.actions.add(Find(elem))
    }

    companion object {
        val Left = SwipeConfig(1, Direction.Left)
        val Right = SwipeConfig(1, Direction.Left)
    }
}


