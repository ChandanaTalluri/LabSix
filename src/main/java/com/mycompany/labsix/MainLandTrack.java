/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labsix;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Chandana
 */
public class MainLandTrack {
    
     public static int getNoOfTracks(){
        String strnoOfTracks = JOptionPane.showInputDialog("Please enter the numbers of tracks :");
        int noOfTracks = 0;
      ArrayList arrlist = new ArrayList();
        try {
             noOfTracks = (int) Float.parseFloat(strnoOfTracks);
            
        } catch(Exception e){
                System.out.println( "Alphabets and special charecters are not allowed.");
            }   
        return noOfTracks;
    }
    public static ArrayList getArea(int noOfTracks){
        float area = 0.0F;
        int count = 1;
        LandTract objLandTrack = new LandTract();
        ArrayList arrLstArea = new ArrayList();
        for(int trackCount = 0; trackCount<noOfTracks ; trackCount++){
            String strTrackLength = JOptionPane.showInputDialog("Please enter the length of the track " +count + " : ");
            String strTrackWidth = JOptionPane.showInputDialog("Please enter the Width of the track " +count + " : ");
            
            try {
                float trackLength = Float.parseFloat(strTrackLength);
                float trackWidth = Float.parseFloat(strTrackWidth);
                boolean isEqual = objLandTrack.equals(trackLength, trackWidth);
                String strTrackEqual = null;
                if(isEqual){
                    strTrackEqual = "Lentgh and with of track are equal";
                }
                else{
                    strTrackEqual = "Lentgh and with of track are not equal";
                }
                area = trackLength*trackWidth;
                String strResult = "Area of the track "+ count + " is "+ area +" and "+ strTrackEqual;
                arrLstArea.add(strResult);
                count++;
            }
            catch(Exception e){
                System.out.println( "Alphabets and special charecters are not allowed.");
            }   
        }
        return arrLstArea;
    }
    
    public static void main(String[] args) {
        
        try{
            int noOfTracks = getNoOfTracks();
            ArrayList arrString = getArea(noOfTracks);
            for(int i=0 ; i<arrString.size();i++){
                System.out.println(arrString.get(i));
            }
            
        }catch(Exception e){
            
        }
    }
}
