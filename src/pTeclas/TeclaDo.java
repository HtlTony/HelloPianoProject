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
public class TeclaDo extends Tecla {

    @Override
    public void play() {
        super.play();
        System.out.println("Tecla DO...");
//        MakeSound ms = new MakeSound();
        //ms.playSound("C:\\Users\\oscar\\Downloads\\DoReMiFaSolLaSi\\do.wav");
        new ThreadPlay(Constantes.RUTAWAVS + "do.wav").start();
    }
}
