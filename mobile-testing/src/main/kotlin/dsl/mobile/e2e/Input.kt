package dsl.mobile.e2e

open class Input(override val name: String, var content: String = "") : Element(name) {

    var innerText = Text("content", content)

    fun type(content: String) {
        innerText = Text("content", content)
    }

    fun clear() {
        innerText = Text("content", "")
    }

    open fun selectContent(action: Text.() -> String = { whole() }): String {
        return innerText.action()
    }
}