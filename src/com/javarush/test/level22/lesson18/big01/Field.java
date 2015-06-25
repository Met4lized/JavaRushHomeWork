package com.javarush.test.level22.lesson18.big01;

import java.lang.reflect.Array;

/**
 * Created by ausholohov on 25.06.2015.
 */
public class Field {
    private int width;
    private int height;
    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public void print() {
    }

    public void removeFullLines() {
    }

    public Integer getValue(int x, int y) {
        return null;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}
