package pConstantes;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oscar
 */
public class Constantes {

    //public static String RUTAWAVS = "/home/usuario/Downloads/HelloProject/src/";
    //public static String RUTAIMG = "/home/usuario/Downloads/HelloProject/src/";
    public static String RUTAWAVS = "C:\\Users\\Profesor\\Downloads\\HelloPianoProject\\HelloPianoProject\\src\\pResources\\";
    public static String RUTAIMG = "C:\\Users\\Profesor\\Downloads\\HelloPianoProject\\HelloPianoProject\\src\\pResources\\";
    
            
    public static ArrayList<String> arrnotas = new ArrayList<String>();

    public Constantes() {
        arrnotas.add("Do");
        arrnotas.add("Re");
        arrnotas.add("Mi");
        arrnotas.add("Fa");
        arrnotas.add("Sol");
        arrnotas.add("La");
        arrnotas.add("Si");
    }
}
