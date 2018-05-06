package ar.edu.unlam.tallerweb1.modelo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {

	// La anotacion id indica que este atributo es el utilizado como clave primaria
	// de la entity, se indica que el valor es autogenerado.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long pedidoTerminado;

	public Long fecha;

	public Long getFecha() {
		return fecha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPedidoTerminado() {
		return pedidoTerminado;
	}

	public void setPedidoTerminado(Long pedidoTerminado) {
		this.pedidoTerminado = pedidoTerminado;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

}
