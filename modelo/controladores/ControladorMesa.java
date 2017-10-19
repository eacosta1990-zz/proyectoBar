package controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import datos.Mesa;
import negocio.MesaABM;

@Controller
@RequestMapping(value = "/mesa/**")
public class ControladorMesa {
	@Autowired
	private MesaABM abm;

	@Qualifier(value = "abm")
	public void setAbm(MesaABM abm) {
		this.abm = abm;
	}

	@RequestMapping(value = "/nuevo", method = RequestMethod.GET)
	public ModelAndView formNuevaMesa(ModelAndView model) {

		Mesa mesa = new Mesa();
		model.addObject("mesa", mesa);
		model.setViewName("formularioMesaNuevo");

		return model;
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public ModelAndView guardaMesa(@ModelAttribute Mesa mesa) {
		ModelAndView model = new ModelAndView();
		try {
			abm.agregarMesa(mesa);
			model.addObject("msg", "Agregada correctamente: " + mesa);

		} catch (Exception e) {
			model.addObject("error", e);

		}
		model.setViewName("index");
		return model;

	}

	@RequestMapping(value = "/mesas", method = RequestMethod.GET)
	public ModelAndView traerMesas(ModelAndView model) {
		List<Mesa> lstMesas = abm.traerMesas();

		model.addObject("lstMesas", lstMesas);
		model.setViewName("mesa");

		return model;

	}

	@RequestMapping(value = "/mesasActivas", method = RequestMethod.GET)
	public ModelAndView traerMesasActivas(ModelAndView model) {
		List<Mesa> lstMesas = abm.traerMesasActivas();

		model.addObject("lstMesas", lstMesas);

		return model;

	}

	@RequestMapping(value = "/borrar/{idMesa}")
	public ModelAndView borrarMesa(@PathVariable("idMesa") int idMesa) {

		try {
			abm.eliminarMesa(abm.traerMesa(idMesa));

		} catch (Exception e) {

			e.printStackTrace();
		}

		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editar/{id}")
	public ModelAndView traerMesa(@PathVariable("id") int id, ModelAndView model) {
		Mesa mesa = new Mesa();

		try {
			mesa = abm.traerMesa(id);
			model.addObject(mesa);
			model.setViewName("formularioMesaEditar");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return model;
	}

	@RequestMapping(value = "/editar/guardar")
	public ModelAndView guardarMesa(@ModelAttribute Mesa mesa, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("idMesa"));
		try {
			Mesa m = abm.traerMesa(id);

			m.setMesa(mesa.getMesa());
			m.setActiva(mesa.isActiva());
			m.setCantidadComensales(mesa.getCantidadComensales());
			abm.actualizarMesa(m);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ModelAndView("redirect:/");

	}

}
