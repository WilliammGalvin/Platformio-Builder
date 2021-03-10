package dev.unfair.builder.scenes

import dev.unfair.builder.utils.MouseButton

abstract class Scene {

    abstract fun renderScene(mouseX: Float, mouseY: Float)
    abstract fun onMouseClicked(mouseX: Float, mouseY: Float, mouseButton: MouseButton)

}