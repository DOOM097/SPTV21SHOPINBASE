/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvshopnemchenko;

/**
 *
 * @author pupil
 */
public class SPTVShopNemchenko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length > 0 && "base".equals(args[0])){
            App.saveToBase = true;
        }else{
            App.saveToBase = false;
        }
        App app = new App();
        app.run();

    }
    
}
