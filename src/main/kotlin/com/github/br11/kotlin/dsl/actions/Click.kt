package com.github.br11.kotlin.dsl.actions

import com.github.br11.kotlin.dsl.contexts.Context

open class Click(override val target: Context) : Action<Context>(target) {

}
