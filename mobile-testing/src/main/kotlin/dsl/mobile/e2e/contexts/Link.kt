package dsl.mobile.e2e.contexts

open class Link(name: String, init: Link.() -> Unit) : Context(name, init as Context.() -> Unit)  {

}