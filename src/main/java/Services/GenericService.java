package Services;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.function.Predicate;

public abstract class GenericService <E, Repository extends JpaRepository<E, Long>>{

    protected Repository repository;

    public GenericService(Repository repository) {
        this.repository = repository;
    }

    public E find(Long id){
        return repository.findById(id).get();
    };

    public List<E> all(){
        return this.repository.findAll();
    }

    public E update(E entity){
        return repository.save(entity);
    }

    public void delete(Long id){
        this.repository.deleteById(id);
    }

}
