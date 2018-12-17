package dsl.mobile.e2e.contexts

open class Text(name: String, init: Text.() -> Unit) : Context(name, init as Context.() -> Unit) {

    var selection: String = ""

    open fun whole() {
        selection = name
    }

    open fun range(begin: Int, end: Int) {
        selection = name.substring(begin, end)
    }

}