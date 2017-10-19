package test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.MesaDAO;
import datos.Mesa;
import datos.Pedido;
import negocio.MesaABM;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context-servlet.xml");

		MesaABM mesaabm = context.getBean(MesaABM.class);
		Mesa mesa = new Mesa();
		mesa.setActiva(true);
		mesa.setCantidadComensales(5);
		mesa.setMesa("44");

		;

		System.out.println("Mesas::" + mesa);

		List<Mesa> list = mesaabm.traerMesas();

		for (Mesa m : list) {
			System.out.println("Mesa List::" + m);
		}
		// close resources
		context.close();

	}

}
