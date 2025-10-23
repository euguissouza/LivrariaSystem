package com.projeto_de_pesquisa.Livraria_System.Prateleira;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="Editora")
public class Editora {
    private String nome;
    private Genero genero;
}
