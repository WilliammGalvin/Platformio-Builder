package dev.unfair.builder.elements.button

import dev.unfair.builder.Builder
import dev.unfair.builder.utils.MouseButton
import processing.core.PConstants

class Button(val text: String, val x: Float, val y: Float, val width: Float, val height: Float, val bal: ButtonActionListener) {

    private val gr = Builder.INSTANCE

    fun render(mouseX: Float, mouseY: Float) {
        gr.fill(33f, 37f, 43f)
        gr.rect(x, y, width, height)
        gr.textAlign(PConstants.CENTER)
        gr.fill(255f, 255f, 255f, if (isHovered(mouseX, mouseY)) 255f else 175f)
        gr.text(text, x + width / 2f, y + height / 2f)
    }

    fun onMouseClicked(mouseX: Float, mouseY: Float, mouseButton: MouseButton) {
        if (isHovered(mouseX, mouseY) && mouseButton == MouseButton.LEFT) bal.onButtonClicked()
    }

    private fun isHovered(mouseX: Float, mouseY: Float): Boolean {
        return mouseX > x && mouseX < x + width && mouseY > y && mouseY < y + height
    }

}