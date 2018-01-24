package br.edu.ifrs.canoas.tcc.sisbov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifrs.canoas.tcc.sisbov.model.Animal;

public interface Animais extends JpaRepository<Animal, Long> {

}