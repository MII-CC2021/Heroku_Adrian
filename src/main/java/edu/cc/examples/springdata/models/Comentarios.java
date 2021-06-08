package edu.cc.examples.springdata.models;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="comentarios")
public class Comentarios implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private User user;
	private String nombre;
	private String comentario;
	
}