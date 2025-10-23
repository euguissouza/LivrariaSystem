package com.projeto_de_pesquisa.Livraria_System.Prateleira;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="Editora")
public class Editora {
    private String nome;
    private Genero genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
