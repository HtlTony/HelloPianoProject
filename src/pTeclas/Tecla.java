package pTeclas;

import pSounds.MakeSound;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class Tecla {

    MakeSound ms = null;

    public Tecla() {
        ms = new MakeSound();
    }

    public void play() {
        System.out.println("Tecla haciendo play con MakeSound!!!!");
    }
}
