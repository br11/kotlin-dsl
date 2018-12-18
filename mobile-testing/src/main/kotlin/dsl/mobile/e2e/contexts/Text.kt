package dsl.mobile.e2e.contexts

open class Text(name: String, init: Text.() -> Unit) : Context(name, init as Context.() -> Unit) {

    var selection: Pair<Int, Int> = 0 to 0

    open fun whole() {
        selection = 0 to Int.MAX_VALUE
    }

    open fun range(begin: Int, end: Int) {
        selection = begin to end
    }

}