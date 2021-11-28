/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysvisualization;

/**
 *
 * @author seanp
 */

import java.awt.Color;

class Line {
    
    private Color color;
    private double[] data;
    
    public Line(double[] data, Color color) {
        this.color = color;
        this.data = data;
    }

    public Color getColor() {
        return color;
    }

    public double[] getData() {
        return data;
    }
    
}
