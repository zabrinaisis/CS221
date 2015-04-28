/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d1;

/* OUTPUT Problem# 4
Please enter a camera brand: Sony
How many megapixels (0 through 10) does it have? 8
The Sony camera has a resolution of 8 megapixels, and sells for $129.
Please enter a camera brand: Samsung
How many megapixels (0 through 10) does it have? 10
The Samsung camera has a resolution of 10 megapixels, and sells for $129.
The Nikon camera has a resolution of 10 megapixels, and sells for $129.
The Cannon camera has a resolution of 5 megapixels, and sells for $99.
*/

public class TestDigitalCamera {
    public static void main(String args[]) {
        DigitalCamera d1 = new DigitalCamera();
        System.out.println(d1.CameraDetails());
        
        DigitalCamera d2 = new DigitalCamera();
        System.out.println(d2.CameraDetails());
        
        DigitalCamera d3 = new DigitalCamera("Nikon", 18);
        System.out.println(d3.CameraDetails());
        
        DigitalCamera d4 = new DigitalCamera("Cannon", 5);
        System.out.println(d4.CameraDetails());
    }
}


/**
 *
 * @author Zbrodale
 */