package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Pedido;

public interface ServicioPedido {
	
	
	public void cargarPedidoTerminado (Long pedidoTerminado);

	public List <Pedido> buscarPedidosTerminado();


}
