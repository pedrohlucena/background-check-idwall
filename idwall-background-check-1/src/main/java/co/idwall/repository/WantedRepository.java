package co.idwall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.idwall.model.Wanted;

@Repository()
public interface WantedRepository extends JpaRepository<Wanted, Integer> {}


//@Repository
//public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
//    List<Ingredient> findByName(String name);
//}