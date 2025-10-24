package com.projeto_de_pesquisa.Livraria_System.Controllers;


import com.projeto_de_pesquisa.Livraria_System.Prateleira.Editora;
import com.projeto_de_pesquisa.Livraria_System.Prateleira.Livro;
import com.projeto_de_pesquisa.Livraria_System.Repositories.EditoraRepository;
import com.projeto_de_pesquisa.Livraria_System.Repositories.LivroRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prateleira")
public class Controller {
    private LivroRepository livroRepository;
    private EditoraRepository editoraRepository;

    public Controller(LivroRepository livroRepository, EditoraRepository editoraRepository){
        this.editoraRepository = editoraRepository;
        this.livroRepository = livroRepository;
    }

    @PostMapping("editoras")
    ResponseEntity<Editora> criarEditora(@RequestBody Editora editora){
        editoraRepository.save(editora);
        System.out.println("Elemento EDITORA cadastrado");
       return ResponseEntity.ok(editora);
    }

    @PostMapping("/livros")
    ResponseEntity<Livro> adicionaLivro(@RequestBody Livro livro){
        livroRepository.save(livro);
        System.out.println("Elemento LIVRO adicionado com sucesso");
        return ResponseEntity.ok(livro);
    }


}
