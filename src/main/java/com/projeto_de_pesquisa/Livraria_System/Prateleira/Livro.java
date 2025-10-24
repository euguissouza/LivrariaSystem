package com.projeto_de_pesquisa.Livraria_System.Prateleira;

import com.projeto_de_pesquisa.Livraria_System.Services.SendStatus;
import jakarta.persistence.*;

@Entity
@Table(name ="Livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "editora_id")
    private Editora editora;

    private Genero genero;
    private Capa capa;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public SendStatus responseStatus(Editora editor){
        if(this.genero != editor.getGenero()){
            return new SendStatus("Essa editora só produz material do genero " + editora.getGenero());
        }
        return new SendStatus("Livro Cadastrado com sucesso");
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Id=" + Id +
                ", titulo=" + titulo +
                ", editora=" + editora +
                ", genero=" + genero +
                ", capa=" + capa +
                '}';
    }
}
