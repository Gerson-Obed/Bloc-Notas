/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Interfaz;

/**
 *
 * @author Gerson
 */
public class BlocNotas {
    String nombre;
    String notas;
    int codigo;
    
    static int codigoultimanota=0;
    
    public BlocNotas(int codigo, String nombre, String notas){
    this.codigo=codigo;
    this.nombre=nombre;
    this.notas=notas;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public static int getCodigoultimanota() {
        return codigoultimanota;
    }
    
        public static void setCodigoultimanota(int codigoultimanota) {
        BlocNotas.codigoultimanota = codigoultimanota;
    }
    
}
