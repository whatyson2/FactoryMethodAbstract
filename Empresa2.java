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
public class Empresa2 extends PanetoneFactory{

    @Override
    Panetone criarPanetone(String nome, String peso) {
        if(nome.equals("Garoto") && peso.equals("600")){
            System.out.println("Produto: "+nome+ " Peso: "+peso+"g");
            return new PanetoneGaroto(nome,peso);
        }
        else if(nome.equals("Garoto") && peso.equals("800")){
            System.out.println("Produto: "+nome+ " Peso: "+peso+"g");
            return new PanetoneGaroto(nome,peso);
        }
        else if(nome.equals("Bauducco") && peso.equals("800")){
            System.out.println("Produto: "+nome+ " Peso: "+peso+"g");
            return new PanetoneBauducco(nome,peso);
        }
        else{
            System.out.println("Nenhum fornecedor disponivel");
        }
        
        return null;
    
    }
    
}
