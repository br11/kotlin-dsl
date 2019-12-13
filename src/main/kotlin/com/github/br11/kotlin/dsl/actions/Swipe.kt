package com.github.br11.kotlin.dsl.actions

import com.github.br11.kotlin.dsl.contexts.SwipeConfig

open class Swipe(override val target: SwipeConfig) : Action<SwipeConfig>(target) {

}
