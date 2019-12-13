package com.github.br11.kotlin.dsl.actions

import com.github.br11.kotlin.dsl.actions.Action

open class Type(override val target: String) : Action<String>(target) {

}
