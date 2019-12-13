package com.github.br11.kotlin.dsl.actions

import com.github.br11.kotlin.dsl.contexts.App

open class Open(override val target: App) : Action<App>(target) {

}
