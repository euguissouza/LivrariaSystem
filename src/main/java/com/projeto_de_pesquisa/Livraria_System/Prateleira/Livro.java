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
}
