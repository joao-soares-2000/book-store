package BookStore.bookstore.service;

import BookStore.bookstore.Domain.Livro;
import BookStore.bookstore.repositories.LivroRepository;
import BookStore.bookstore.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public Livro findById(Integer id) {
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado id: " +
                id + "tipo: " + Livro.class.getName()));
    }
}
