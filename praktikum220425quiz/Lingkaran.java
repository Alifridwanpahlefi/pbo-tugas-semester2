/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum220425quiz;

/**
 *
 * @author Lif Rdwn
 */

public class Lingkaran {
    private double r;

    public Lingkaran() {
        this.r = 0;
    }

    public Lingkaran(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getDiameter() {
        return 2 * r;
    }

    public double getKeliling() {
        return 2 * 3.14 * r;
    }

    public double getLuas() {
        return 3.14 * r * r;
    }

    @Override
    public String toString() {
        return " Sebuah Lingkaran dengan jari-jari = " + r;
    }
}

