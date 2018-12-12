package dsl.mobile.e2e

class Input(override val name: String) : Element(name) {

    var value: String? = null

    fun type(text: String) {
        value = text
    }

    fun clear() {
        value = ""
    }
}