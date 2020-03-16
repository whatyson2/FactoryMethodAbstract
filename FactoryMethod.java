/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author whaty
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PanetoneFactory teste1 = new Empresa1();
       Panetone panetoneTeste1 = teste1.criarPanetone("CacauShow", "600");//
       Panetone panetoneTeste2 = teste1.criarPanetone("CacauShow", "600");
       Panetone panetoneTeste3 = teste1.criarPanetone("Bauducco", "800");//
       
       PanetoneFactory teste2 = new Empresa2();
       Panetone panetoneTeste4 = teste1.criarPanetone("Garoto", "600");//
       Panetone panetoneTeste5 = teste1.criarPanetone("Bauducco", "600");
    }
    
}
