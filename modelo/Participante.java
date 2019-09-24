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
public class Participante implements ILeitor, IProgramador{

    private String nome;

    public Participante() {
    }

    public Participante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void lendo() {
        System.out.print("Lendo");
    }

    @Override
    public void programando() {
        System.out.print("Programando");
    }
    
}
