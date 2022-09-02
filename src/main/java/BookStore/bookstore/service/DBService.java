package BookStore.bookstore.service;

import BookStore.bookstore.Domain.Categoria;
import BookStore.bookstore.Domain.Livro;
import BookStore.bookstore.repositories.CategoriaRepository;
import BookStore.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public void instanciaBaseDeDados() {
            Categoria cat1 = new Categoria(null, "informatica", "livros de informatica");
            Categoria cat2 = new Categoria(null, "logica", "livros de logica");

            Livro liv1 = new Livro(null, "Clean code", "Robert", "Lorem ipsun", cat1);
            Livro liv2 = new Livro(null, "matematica discreta", "Julio", "1 + 1 = 3", cat2);
            Livro liv3 = new Livro(null, "Logicamente", "Augusto", "a > b logo girafas voam", cat2);
            Livro liv4 = new Livro(null, "Dirty code", "Flavio", "ipsum lorem", cat1);

            cat1.getLivros().addAll(Arrays.asList(liv1,liv4));
            cat2.getLivros().addAll(Arrays.asList(liv2,liv3));


            categoriaRepository.saveAll((Arrays.asList(cat1, cat2)));
            livroRepository.saveAll((Arrays.asList(liv1, liv2, liv3, liv4)));
    }
}

