package dsl.mobile.e2e

open class Text(override val name: String, val value: String = "") : Element(name) {

    open fun whole(): String {
        return value
    }

    open fun range(begin: Int, end: Int): String {
        return value.substring(begin, end)
    }

}