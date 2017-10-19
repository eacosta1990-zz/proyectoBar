package controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import datos.TipoProducto;
import negocio.TipoProductoABM;

@Controller
public class ControladorTipoProducto {

	@Autowired
	private TipoProductoABM abm;

	@Qualifier(value = "abm")
	public void setAbm(TipoProductoABM abm) {
		this.abm = abm;
	}

	@RequestMapping(value = "/tipoProductos", method = RequestMethod.GET)
	public ModelAndView traerLst(ModelAndView model) {
		List<TipoProducto> lst = abm.traerTipoProductos();
		model.addObject("lst", lst);
		model.setViewName("tipoProducto");

		return model;

	}

	@RequestMapping(value = "/formularioTipoProducto", method = RequestMethod.GET)
	public String agregarTipoProducto() {
		System.out.println("hola");

		TipoProducto t = new TipoProducto();
		t.setTipoProducto("cerveza");
		abm.agregarTipoProducto(t);

		return "index";

	}

	//@RequestMapping(value = "/agregar", method = RequestMethod.POST)
	public String agregarTipoProducto(@ModelAttribute TipoProducto tipoProducto) {
		TipoProducto t = new TipoProducto();
		TipoProductoABM tabm = new TipoProductoABM();
		t.setTipoProducto("cerveza");
		tabm.agregarTipoProducto(t);
	
		ModelAndView model = new ModelAndView();
		agregarTipoProducto(tipoProducto);

		return "index";

	}

}
