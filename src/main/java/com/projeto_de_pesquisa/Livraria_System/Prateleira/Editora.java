package com.projeto_de_pesquisa.Livraria_System.Prateleira;

import jakarta.persistence.*;

@Entity
@Table(name ="Editora")
public class Editora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
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

    @Override
    public String toString() {
        return "Editora{" +
                "nome='" + nome + '\'' +
                ", genero=" + genero +
                '}';
    }
}
