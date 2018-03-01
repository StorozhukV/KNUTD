package com.company;

import javafx.scene.paint.Color;

import java.util.Random;

public class RandomColor {
        private static final Random r = new Random();

        public static Color getRandom() {
            return Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble());
        }
    }

