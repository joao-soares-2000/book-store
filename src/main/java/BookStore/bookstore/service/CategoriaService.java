package BookStore.bookstore.service;

import BookStore.bookstore.repositories.CategoriaRepository;
import BookStore.bookstore.Domain.Categoria;
import BookStore.bookstore.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não Encontrado id: " + id +
                "tipo: " + Categoria.class.getName()));
    }
}
