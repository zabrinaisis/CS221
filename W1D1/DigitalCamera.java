/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d1;

import java.util.Scanner;

public class DigitalCamera {

    private String brand;
    private int resolution;
    private String price;
    private String statement;

    public String CameraDetails() {
        statement = "The " + brand + " camera has a resolution of "
                + resolution + " megapixels, and sells for " + price + ".";
        return statement;
    }

    public DigitalCamera() {
        System.out.print("Please enter a camera brand: ");
        Scanner in1 = new Scanner(System.in);
        String s = in1.next();
        this.brand = s;

        System.out.print("How many megapixels (0 through 10) does it have? ");
        Scanner in2 = new Scanner(System.in);
        int i = in2.nextInt();
        if (i > 10) {
            this.resolution = 10;
        } else {
            this.resolution = i;
        }

        if (this.resolution <= 6) {
            this.price = "$99";
        } else {
            this.price = "$129";
        }

    }

    public DigitalCamera(String brand, int resolution) {
        this.brand = brand;

        if (resolution > 10) {
            this.resolution = 10;
        } else {
            this.resolution = resolution;
        }

        if (this.resolution <= 6) {
            this.price = "$99";
        } else {
            this.price = "$129";
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getPrice() {
        return price;
    }

}

/**
 *
 * @author Zbrodale
 */
