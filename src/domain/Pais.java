/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author pav
 */
public class Pais {
    private String nombre;
    private String ISO;

    public Pais(String nombre, String ISO) {
        this.nombre = nombre;
        this.ISO = ISO;
    }

    public String getNombre() {
        return nombre;
    }

    public String getISO() {
        return ISO;
    }
}
