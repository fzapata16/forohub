package com.fzapatadev.forohub.services;

import com.fzapatadev.forohub.models.Theme;
import com.fzapatadev.forohub.repositories.ThemeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ThemeService implements CRUD {

    private final ThemeRepository repositorio;
    private Integer id;

    @Override
    public List<Theme> findAll() {
        return repositorio.findAll();
    }

    @Override
    public topicos findByID(Integer id) {
        return null;
    }

    @Override
    public topicos save(topicos topicos) {
        return repositorio.findById(id).orElseThrow();
    }

    @Override
    public topicos update(Integer id, topicos topicos) {
        topicos.setId(id);
        return repositorio.save(topicos);
    }

    @Override
    public void deleteById(Integer id) {
    repositorio.deleteById(id);
    }
}
