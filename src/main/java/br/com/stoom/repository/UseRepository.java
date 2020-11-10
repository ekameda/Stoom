package br.com.stoom.repository;

import br.com.stoom.entity.Use;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface UseRepository extends JpaRepository<Use, Long> {
}
