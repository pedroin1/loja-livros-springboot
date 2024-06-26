package com.estudo.lojalivros.repository;

import com.estudo.lojalivros.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    LivroEntity findByCodigo(Long codigo);

    boolean existsByNome(String nomeLivro);

}
