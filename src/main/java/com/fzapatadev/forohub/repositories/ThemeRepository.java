package com.fzapatadev.forohub.repositories;

import com.fzapatadev.forohub.models.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeRepository extends JpaRepository<Theme, Integer> {
    Theme findByID(Integer id);
}
