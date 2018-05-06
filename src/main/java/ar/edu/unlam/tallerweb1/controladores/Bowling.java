package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Pedido;
import ar.edu.unlam.tallerweb1.servicios.ServicioPedido;

@Controller
public class Bowling {

	//
	@Inject
	private ServicioPedido servicioPedido;

	@RequestMapping(path = "iracargarpedido")
	public ModelAndView irACargarPedido() {

		ModelMap modelo = new ModelMap();

		return new ModelAndView("cargarpedidoterminado", modelo);

	}

	@RequestMapping(path = "cargarpedidoterminado")
	public ModelAndView cargarPedido(@RequestParam(value = "pedido") String pedido) {

		if (pedido=="") {
			return new ModelAndView("redirect:/iracargarpedido");
		}
		
		
  		servicioPedido.cargarPedidoTerminado(Long.parseLong(pedido));
  		return new ModelAndView("redirect:/iracargarpedido");

	}
	
	@RequestMapping  (path = "mostrarpedidosterminados")
	public ModelAndView mostrarPedidosTerminado () {
		
		ModelMap modelo = new ModelMap();
		List <Pedido> pedidosTerminados=servicioPedido.buscarPedidosTerminado();		
		
		
		if (pedidosTerminados.size()>=1) {
		Pedido ultimoPedido = pedidosTerminados.get(0);
		modelo.put("ultimoPedido", ultimoPedido);
		pedidosTerminados.remove(ultimoPedido);
		modelo.put("pedidosanteriores",pedidosTerminados);	
		modelo.put("cantidadpedidos", pedidosTerminados.size());
		
		}
		return new ModelAndView("mostrarpedidosterminados",modelo);
	}

}
