package com.fzapatadev.forohub.services;
import java.util.List;
public interface CRUD {
    // Metodo GET
    List<topicos> findAll();
    topicos findByID(Integer id);

    // Metodo POST
    topicos save(topicos topicos);

    //Metodo PUT
    topicos update(Integer id, topicos topicos);

    //Metodo DELETE
    void deleteById(Integer id);
}
