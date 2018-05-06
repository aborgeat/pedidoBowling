package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Pedido;

public interface PedidoDao {

	void cargarPedidoTerminado(Pedido pedidoTermiando);

	List<Pedido> mostrarUltimosPedidosIngresados();

}
