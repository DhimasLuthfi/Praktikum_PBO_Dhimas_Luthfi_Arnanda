/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeluargaAnabul;

/**
 *
 * @author HP
 */
public abstract class Anabul {
    /* Attribut */
    protected String nama;
    /* Method */
    public Anabul() {

    }
    public Anabul(String nama) {
        this.nama = nama;
    }
    public abstract void gerak();
    public abstract void bersuara();
}

