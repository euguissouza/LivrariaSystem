package com.projeto_de_pesquisa.Livraria_System.Repositories;

import com.projeto_de_pesquisa.Livraria_System.Prateleira.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, String> {
}
