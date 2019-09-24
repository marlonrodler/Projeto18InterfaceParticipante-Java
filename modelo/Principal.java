/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Participante objParticipante = new Participante();
        
        objParticipante.setNome("Marlon");
        System.out.println("Participante "+ objParticipante.getNome() + ", está: ");
        objParticipante.lendo();
        System.out.print(" e ");
        objParticipante.programando();
        System.out.println("\n\n");
    }
    
}
