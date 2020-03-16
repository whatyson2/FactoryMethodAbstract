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
public class Empresa1 extends PanetoneFactory {

    @Override
    public Panetone criarPanetone(String nome, String peso) {
        if(nome.equals("CacauShow") && peso.equals("600")){
            System.out.println("Produto: "+nome+ " Peso: "+peso+"g");
            return new PanetoneCacauShow(nome,peso);
        }
        else if(nome.equals("Bauducco") && peso.equals("600")){
            System.out.println("Produto: "+nome+ " Peso: "+peso+"g");
            return new PanetoneBauducco(nome,peso);
        }
        else{
            System.out.println("Nenhum fornecedor disponivel");
        }
        return null;
    }
    
}
