/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labsix;

/**
 *
 * @author Chandana
 */
public class LandTract {
    private float trackLength;
    private float trackWidth;

    public float getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(float trackLength) {
        this.trackLength = trackLength;
    }

    public double getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(float trackWidth) {
        this.trackWidth = trackWidth;
    }
    public static double getArea(float trackLength, float trackWidth){
        return trackLength*trackWidth;
    }

    @Override
    public String toString() {
        return "LandTract{" + "trackLength=" + trackLength + ", trackWidth=" + trackWidth + '}';
    }


    public boolean equals(float trackLength , float trackWidth) {
        boolean isEquals = false;
        if(trackLength == trackWidth){
            isEquals = true;
        }
        return isEquals;
    }
    
}
