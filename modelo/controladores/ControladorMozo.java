package controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import datos.Mozo;
import negocio.MozoABM;

@Controller
@RequestMapping("/mozos")
public class ControladorMozo {
	@Autowired
	private MozoABM abm;

	@Qualifier(value = "abm")
	public void setAbm(MozoABM abm) {
		this.abm = abm;
	}

	@RequestMapping(value = "/mozos", method = RequestMethod.GET)
	public String traerMesas(Model model) {
		System.out.println("entro al controlador de mozos");
		List<Mozo> lstMozo = abm.traerMozos();
		Mozo mozo = new Mozo();
		mozo = lstMozo.get(0);
		model.addAttribute("lstMozo", mozo);
		model.addAttribute("mensaje", "HOLAAA SPRINGGG");

		return "mozo";

	}

}
