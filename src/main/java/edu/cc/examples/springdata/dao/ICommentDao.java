package edu.cc.examples.springdata.dao;

import edu.cc.examples.springdata.models.Comentarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentDao extends JpaRepository<Comentarios, Long>{

	// ya temdriamos los prinicpales métodos CRUD
	// y podemos crear nuestros propios métodos
}
