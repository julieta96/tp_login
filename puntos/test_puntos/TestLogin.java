package test_puntos;

import static org.junit.Assert.*;

import org.junit.Test;

import puntos.Administrador;
import puntos.Cliente;
import puntos.Perfumeria;
import puntos.Usuario;

public class TestLogin {

	@Test
	public void testQueAgregueAlSistemaUsuarios() {

		Usuario administrador = new Administrador("Lucia", "Perez", "lu_perez@gmail.com", "1234q", 12);
		Perfumeria unlam = new Perfumeria("UNLAM", (Administrador) administrador);
		Usuario cliente1 = new Cliente("Jose", "Diaz", "josedz@gmail.com", "789p", 456);
		Usuario cliente2 = new Cliente("Marta", "Guzman", "margz@gmail.com", "abc10", 490);
		Usuario cliente3 = new Cliente("Lorenzo", "Rodriguez", "lorenzorz@gmail.com", "9014p", 500);
		Usuario cliente4 = new Cliente("Sofia", "Aguirre", "sofiag@gmail.com", "4520", 512);
		Usuario cliente5 = new Cliente("Fernando", "Lopez", "fer_lopez@gmail.com", "57io", 515);

		assertTrue(unlam.agregarUsuario((Cliente) cliente1));
		assertTrue(unlam.agregarUsuario((Cliente) cliente2));
		assertTrue(unlam.agregarUsuario((Cliente) cliente3));
		assertTrue(unlam.agregarUsuario((Cliente) cliente4));
		assertTrue(unlam.agregarUsuario((Cliente) cliente5));

		assertEquals(5, unlam.getListaUsuarios().size());

	}

	@Test
	public void testQueLogueeUsuarios() {

		Usuario administrador = new Administrador("Lucia", "Perez", "lu_perez@gmail.com", "1234q", 12);
		Perfumeria unlam = new Perfumeria("UNLAM", (Administrador) administrador);
		Usuario cliente1 = new Cliente("Jose", "Diaz", "josedz@gmail.com", "789p", 456);
		Usuario cliente2 = new Cliente("Marta", "Guzman", "margz@gmail.com", "abc10", 490);
		Usuario cliente3 = new Cliente("Lorenzo", "Rodriguez", "lorenzorz@gmail.com", "9014p", 500);
		Usuario cliente4 = new Cliente("Sofia", "Aguirre", "sofiag@gmail.com", "4520", 512);
		Usuario cliente5 = new Cliente("Fernando", "Lopez", "fer_lopez@gmail.com", "57io", 515);

		unlam.agregarUsuario((Cliente) cliente1);
		unlam.agregarUsuario((Cliente) cliente2);
		unlam.agregarUsuario((Cliente) cliente3);
		unlam.agregarUsuario((Cliente) cliente4);
		unlam.agregarUsuario((Cliente) cliente5);

		assertTrue(unlam.loguearUsuario("josedz@gmail.com", "789p"));
		assertTrue(unlam.loguearUsuario("margz@gmail.com", "abc10"));
		assertTrue(unlam.loguearUsuario("lorenzorz@gmail.com", "9014p"));
		assertTrue(unlam.loguearUsuario("sofiag@gmail.com", "4520"));
		assertTrue(unlam.loguearUsuario("fer_lopez@gmail.com", "57io"));

	}

	@Test
	public void testQueAlIngresarEmailOPasswordIncorrectoNoPuedaIngresar() {

		Usuario administrador = new Administrador("Lucia", "Perez", "lu_perez@gmail.com", "1234q", 12);
		Perfumeria unlam = new Perfumeria("UNLAM", (Administrador) administrador);
		Usuario clientee = new Cliente("Luz", "Rodriguez", "luzrz@gmail.com", "ghjf", 530);

		unlam.agregarUsuario((Cliente) clientee);

		assertFalse(unlam.loguearUsuario("luzrz@gmail.com", "fdg"));

	}

	@Test
	public void testQueAlIntentarLoguearse5VecesNoPuedaIngresar() {

		Usuario administrador = new Administrador("Lucia", "Perez", "lu_perez@gmail.com", "1234q", 12);
		Perfumeria unlam = new Perfumeria("UNLAM", (Administrador) administrador);
		Usuario cliente = new Cliente("Oscar", "Sosa", "oss@gmail.com", "685", 520);

		unlam.agregarUsuario((Cliente) cliente);

		assertFalse(unlam.loguearUsuario("josedz@gmail.com", "709"));
		assertFalse(unlam.loguearUsuario("josedz@gmail.com", "700"));
		assertFalse(unlam.loguearUsuario("josedz@gmail.com", "20"));
		assertFalse(unlam.loguearUsuario("josedz@gmail.com", "123"));
		assertFalse(unlam.loguearUsuario("josedz@gmail.com", "40"));

	}
	
	@Test
	public void testQueElimineUnUsuario() {

		Usuario administrador = new Administrador("Lucia", "Perez", "lu_perez@gmail.com", "1234q", 12);
		Perfumeria unlam = new Perfumeria("UNLAM", (Administrador) administrador);
		Usuario cliente1 = new Cliente("Jose", "Diaz", "josedz@gmail.com", "789p", 456);
		Usuario cliente2 = new Cliente("Marta", "Guzman", "margz@gmail.com", "abc10", 490);
		Usuario cliente3 = new Cliente("Lorenzo", "Rodriguez", "lorenzorz@gmail.com", "9014p", 500);
		Usuario cliente4 = new Cliente("Sofia", "Aguirre", "sofiag@gmail.com", "4520", 512);
		Usuario cliente5 = new Cliente("Fernando", "Lopez", "fer_lopez@gmail.com", "57io", 515);

		unlam.agregarUsuario((Cliente) cliente1);
		unlam.agregarUsuario((Cliente) cliente2);
		unlam.agregarUsuario((Cliente) cliente3);
		unlam.agregarUsuario((Cliente) cliente4);
		unlam.agregarUsuario((Cliente) cliente5);

	    unlam.loguearUsuario("josedz@gmail.com", "789p");
		unlam.loguearUsuario("margz@gmail.com", "abc10");
		unlam.loguearUsuario("lorenzorz@gmail.com", "9014p");
		unlam.loguearUsuario("sofiag@gmail.com", "4520");
		unlam.loguearUsuario("fer_lopez@gmail.com", "57io");
		
		assertTrue(unlam.eliminarUsuario(515));

	}
	
	@Test
	public void testQueVerifiqueQueElOLaAdministradorSeaCorrecto() {

		Usuario administrador = new Administrador("Lucia", "Perez", "lu_perez@gmail.com", "1234q", 12);
		Perfumeria unlam = new Perfumeria("UNLAM", (Administrador) administrador);
		
		
		assertEquals(administrador , unlam.getAdministrador());

	}
	
	
	
	
	

}
