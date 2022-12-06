package com.poke.pokedex.repository;

import com.poke.pokedex.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// En Spring le dao c'est repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}