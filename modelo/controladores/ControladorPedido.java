package controladores;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import datos.Mesa;
import datos.Mozo;
import datos.Pedido;
import datos.Producto;
import datos.ProductoCantidad;
import datos.TipoProducto;
import funciones.Funciones;
import negocio.MesaABM;
import negocio.MozoABM;
import negocio.PedidoABM;
import negocio.ProductoABM;
import negocio.ProductoCantidadABM;
import negocio.TipoProductoABM;

@Controller
@RequestMapping("/pedido/**")
public class ControladorPedido {
	@Autowired
	private PedidoABM abm;
	@Autowired
	private MesaABM mesaabm;
	@Autowired
	private MozoABM mozoabm;
	@Autowired
	private ProductoABM productoabm;
	@Autowired
	private PedidoABM pedidoabm;
	@Autowired
	private ProductoCantidadABM productoCantidadabm;
	@Autowired
	private TipoProductoABM tipoProductoabm;

	@Qualifier(value = "abm")
	public void setAbm(PedidoABM abm) {
		this.abm = abm;
	}

	@RequestMapping(value = "/pedidos")
	public ModelAndView traerPedidos(ModelAndView model) {

		List<Pedido> lstPedidos = abm.traerPedidos();

		model.addObject("lstPedidos", lstPedidos);
		model.setViewName("pedido");

		return model;

	}

	@RequestMapping(value = "/nuevo")
	public ModelAndView formNuevoPedido(ModelAndView model) {
		Pedido pedido = new Pedido();
		Mesa mesa = new Mesa();
		List<Mesa> lstMesa = mesaabm.traerMesasActivas();
		List<Mozo> lstMozo = mozoabm.traerMozos();

		model.addObject("lstMozo", lstMozo);
		model.addObject("pedido", pedido);
		model.addObject("lstMesa", lstMesa);
		model.addObject("mesa", mesa);

		model.setViewName("formularioPedidoNuevo");
		return model;

	}

	@RequestMapping(value = "/guardar", method = RequestMethod.GET)
	public ModelAndView guardaPedido(HttpServletRequest request) {
		Pedido pedido = new Pedido();
		Mozo mozo = new Mozo();
		Mesa mesa = new Mesa();
		int id = Integer.parseInt(request.getParameter("idMesa"));
		try {
			mesa = mesaabm.traerMesa(id);
			mozo = mozoabm.traerMozo(1);
			pedido.setMozo(mozo);
			pedido.setMesa(mesa);
			mesa.setActiva(false);
			mesaabm.actualizarMesa(mesa);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Funciones funcion = new Funciones();
		GregorianCalendar fecha = funcion.obtenerFecha();
		pedido.setFecha(fecha);
		pedido.setHoraCarga(fecha);
		pedido.setHoraCierre(fecha);

		abm.agregarPedido(pedido);

		return new ModelAndView("redirect:/");

	}

	@RequestMapping(value = "/cargar/{idPedido}")
	public ModelAndView cargarProductos(@PathVariable("idPedido") int idPedido) {
		ModelAndView model = new ModelAndView();
		TipoProducto tipoProducto = new TipoProducto();

		model.addObject("pedidoCant", productoCantidadabm.traerProductoCantidadXPedido(idPedido));
		model.addObject("pedido", abm.traerPedido(idPedido));
		model.addObject("tipoProducto", tipoProducto);
		model.addObject("lstTipoProducto", tipoProductoabm.traerTipoProductos());
		model.setViewName("vistaPedido");
		return model;
	}

	@RequestMapping(value = "cargar/productos")
	public ModelAndView traerProductos(HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		Producto producto = new Producto();
		ProductoCantidad productoCantidad = new ProductoCantidad();
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("llego a cargar productos");
		model.addObject("producto", producto);
		model.addObject("idPedido", request.getParameter("pedido"));
		model.addObject("productoCantidad", productoCantidad);
		model.addObject("lstProducto", productoabm.traerProductosXTipo(id));
		model.setViewName("vistaProductosXTipo");
		return model;
	}

	@RequestMapping(value = "cargar/guardarProducto")
	public ModelAndView guardarProductos(@RequestParam("producto") int idProducto,
			@RequestParam("cantidad") int cantidad, @RequestParam("pedido") int idPedido) {
		ModelAndView model = new ModelAndView();
		Pedido pedido = new Pedido();
		ProductoCantidad productoCantidad = new ProductoCantidad();

		Producto producto = new Producto();

		productoCantidad = productoCantidadabm.traerProductoCantidadXPedidoYIdProducto(idPedido, idProducto);
		pedido = pedidoabm.traerPedido(idPedido);

		if (productoCantidad != null) {

			productoCantidad.setCantidad(productoCantidad.getCantidad() + cantidad);
			productoCantidadabm.actualizarProductoCantidad(productoCantidad);

		}
		if (productoCantidad == null) {

			producto = productoabm.traerProducto(idProducto);
			System.out.println("prod " + producto.getIdProducto() + producto.getPrecio() + producto.getProducto());
			ProductoCantidad p = new ProductoCantidad();
			p.setCantidad(cantidad);
			p.setPedido(pedido);
			p.setProducto(producto);
			System.out.println("prod cant " + p);
			productoCantidadabm.agregarProductoCantidad(p);
		}

		model.addObject("pedidoCant", productoCantidadabm.traerProductoCantidadXPedido(idPedido));
		model.addObject("lstTipoProducto", tipoProductoabm.traerTipoProductos());
		model.addObject("pedido", abm.traerPedido(idPedido));
		model.setViewName("vistaPedido");
		return model;

	}

	@RequestMapping(value = "/borrarProducto/{idProductoCantidad}")
	public ModelAndView borrarProductoCantidad(@PathVariable("idProductoCantidad") int idProductoCantidad) {
		ProductoCantidad productoCantidad = productoCantidadabm.traerPedidoXIdProductoCantidad(idProductoCantidad);
		ModelAndView model = new ModelAndView();
		productoCantidadabm.eliminarProductoCantidad(productoCantidadabm.traerProductoCantidad(idProductoCantidad));

		model.setViewName("vistaPedido");

		return traerPedidos(model);

	}

}
