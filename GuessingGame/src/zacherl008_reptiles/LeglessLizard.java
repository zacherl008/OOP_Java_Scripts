/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zacherl008_reptiles;

/**
 *
 * @author kzacherl
 */
public class LeglessLizard extends NoLegsSlither {
    public LeglessLizard (){
        super("Legless Lizard");
    }
    
    @Override
    public String clue() {
        return "I am a lizard!";
    }
    
}
