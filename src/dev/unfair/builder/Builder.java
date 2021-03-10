package dev.unfair.builder;

import dev.unfair.builder.scenes.Scene;
import processing.core.PApplet;

public class Builder extends PApplet {

    public static Builder INSTANCE = new Builder();
    private final int WIDTH = 1250, HEIGHT = 750;

    private Scene scene;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
//        scene.renderScene(mouseX, mouseY);
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"ProcessingTest"}, INSTANCE);
    }
}
