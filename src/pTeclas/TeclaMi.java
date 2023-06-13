package pTeclas;

import pConstantes.Constantes;
import pSounds.ThreadPlay;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class TeclaMi extends Tecla {

    @Override
    public void play() {
        super.play(); //optional
        System.out.println("Tecla MI...");
//        MakeSound ms = new MakeSound();
        //ms.playSound("C:\\Users\\oscar\\Downloads\\DoReMiFaSolLaSi\\mi.wav");
        new ThreadPlay(Constantes.RUTAWAVS + "mi.wav").start();
    }
}
