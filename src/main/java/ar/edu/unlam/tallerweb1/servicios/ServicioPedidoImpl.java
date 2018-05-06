package ar.edu.unlam.tallerweb1.servicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.PedidoDao;
import ar.edu.unlam.tallerweb1.modelo.Pedido;

@Service("servicioPedido")
@Transactional
public class ServicioPedidoImpl implements ServicioPedido {

	@Inject
	private PedidoDao PedidoDao;

	@Override
	public void cargarPedidoTerminado(Long numeroPedidoTerminado) {

		if (numeroPedidoTerminado >= 0L) {
		SimpleDateFormat formato = new SimpleDateFormat("yyMMddyyHHmmss");
		Date ahora = new Date();
		// System.out.println(formato.format(ahora));

		;
		Pedido pedidoTermiando = new Pedido();
		
		pedidoTermiando.setPedidoTerminado(numeroPedidoTerminado);
		pedidoTermiando.setFecha(Long.parseLong((formato.format(ahora))));

		PedidoDao.cargarPedidoTerminado(pedidoTermiando);
		}
	}

	@Override
	public List<Pedido> buscarPedidosTerminado() {
		
		return PedidoDao.mostrarUltimosPedidosIngresados();
	}

}
