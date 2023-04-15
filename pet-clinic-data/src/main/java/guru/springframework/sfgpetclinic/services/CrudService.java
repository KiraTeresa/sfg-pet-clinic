package guru.springframework.sfgpetclinic.services;

import java.util.Set;

// This CrudService mimiks the Spring Data Repository
public interface CrudService<T, ID>{
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteByIc(ID id);
}
