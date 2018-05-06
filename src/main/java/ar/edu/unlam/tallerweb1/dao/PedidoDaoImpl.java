package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Pedido;
import javassist.runtime.Desc;

@Repository("daoPedido")
public class PedidoDaoImpl implements PedidoDao {

	@Inject
	private SessionFactory sessionFactory;

	@Override
	public void cargarPedidoTerminado(Pedido pedidoTermiando) {

		// if (!pedidoTermiando.getPedidoTerminado().equals("")) {
		sessionFactory.getCurrentSession().save(pedidoTermiando);
		// }

	}

	@Override
	public List<Pedido> mostrarUltimosPedidosIngresados() {

		return sessionFactory.getCurrentSession().createCriteria(Pedido.class)
				.addOrder(Order.desc("fecha"))
				.setMaxResults(10)
				.list();
	}

}
