package com.projeto_de_pesquisa.Livraria_System.Prateleira;

import jakarta.persistence.*;

@Entity
@Table(name ="Livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private Editora editora;
    private Genero genero;
    private Capa capa;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Capa getCapa() {
        return capa;
    }

    public void setCapa(Capa capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Id=" + Id +
                ", editora=" + editora +
                ", genero=" + genero +
                ", capa=" + capa +
                '}';
    }
}
