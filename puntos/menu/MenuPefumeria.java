package menu;

import java.util.Scanner;

import puntos.Administrador;
import puntos.Cliente;
import puntos.Perfumeria;
import puntos.Producto;
import puntos.Usuario;

public class MenuPefumeria {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int opciones = 3;
		int i = 0;
		int menu = 0;
		int cantidadUsuarios = 0;
		int contador = 0;
		String nombrePerfumeria = "UNLAM";
		char categorias = ' ';
		String categoriaElegida = " ";

		Usuario admi = new Administrador("Lucia", "Perez", "lu_perez@gmail.com", "1234q", 12);
		Perfumeria miPerfumeria = new Perfumeria(nombrePerfumeria, (Administrador) admi);

		System.out.println("Ingrese cantidad de usuario:");
		cantidadUsuarios = teclado.nextInt();

		do {
			i++;
			System.out.println("\t MENU \t");
			System.out.println("1.Agregarse en el sistema");
			System.out.println("2.Loguearse");
			System.out.println("3.SALIR");
			menu = teclado.nextInt();

			switch (menu) {

			case 1:
				System.out.println("\t*******************\t");
				for (contador = 0; contador < cantidadUsuarios; contador++) {
					System.out.println((contador + 1) + ".Ingrese nombre:");
					String nombre = teclado.next();
					System.out.println((contador + 1) + ".Ingrese apellido:");
					String apellido = teclado.next();
					System.out.println((contador + 1) + ".Ingrese email:");
					String email = teclado.next();
					System.out.println((contador + 1) + ".Ingrese password:");
					String password = teclado.next();
					System.out.println((contador + 1) + ".Ingrese id:");
					Integer id = teclado.nextInt();
					System.out.println("\t*******************\t");
					miPerfumeria.agregarUsuario(new Cliente(nombre, apellido, email, password, id));
				}
				break;

			case 2:

				System.out.println("\t*******************\t");
				for (contador = 0; contador < cantidadUsuarios; contador++) {

					System.out.println((contador + 1) + ".Email:");
					String email = teclado.next();
					System.out.println((contador + 1) + ".Password:");
					String password = teclado.next();
					System.out.println("estado de ingreso: " + miPerfumeria.loguearUsuario(email, password));
					System.out.println("\t*******************\t");
					if (miPerfumeria.loguearUsuario(email, password) == true) {

						System.out.println("\t Bienvenido a Perfumeria " + nombrePerfumeria + "\t");
						System.out.println("Elija categoria del producto que desea buscar:");
						System.out.println("a.fragancia");
						System.out.println("b.cosmetico");
						System.out.println("c.limpieza");
						categorias = teclado.next().charAt(0);
						switch (categorias) {

						case 'a':
							System.out.println("Tenemos fragancias para:");
							System.out.println("Mujer/Hombre/Niños");
							System.out.println("Ingrese la categoria deseada... ");
							categoriaElegida = teclado.next();

							if (categoriaElegida.equalsIgnoreCase("mujer")) {
								System.out.println("\t*******************\t");
								Integer codProducto1 = 0213;
								Double precio1 = 3200.0;
								String descripcion1 = "FRAGANCIA WORLD EDT KENZO";
								Producto fragancia1 = new Producto(precio1, 15, codProducto1, descripcion1);
								System.out.println("(" + codProducto1 + ")" + descripcion1);
								System.out.println("precio = " + precio1);
								System.out.println("\t*******************\t");
								Integer codProducto2 = 0453;
								Double precio2 = 3500.0;
								String descripcion2 = "LADY MILLION LUCKY EDP PACO RABANNE";
								Producto fragancia2 = new Producto(precio2, 20, codProducto2, descripcion2);
								System.out.println("(" + codProducto2 + ")" + descripcion2);
								System.out.println("precio = " + precio2);
								System.out.println("\t*******************\t");
								Integer codProducto3 = 030;
								Double precio3 = 3800.0;
								String descripcion3 = "XS BLACK HER EDP PACO RABANNE";
								Producto fragancia3 = new Producto(precio3, 35, codProducto3, descripcion3);
								System.out.println("(" + codProducto3 + ")" + descripcion3);
								System.out.println("precio = " + precio3);
								System.out.println("\t*******************\t");
								System.out.println("Si desea comprar ingrese el codigo del producto:");

							}
							if (categoriaElegida.equalsIgnoreCase("hombre")) {

								System.out.println("\t*******************\t");
								Integer codProducto1 = 0121;
								Double precio1 = 4200.0;
								String descripcion1 = "POLO BLUE ULTRABLUE ";
								Producto fragancia1 = new Producto(precio1, 15, codProducto1, descripcion1);
								System.out.println("(" + codProducto1 + ")" + descripcion1);
								System.out.println("precio = " + precio1);
								System.out.println("\t*******************\t");
								Integer codProducto2 = 0111;
								Double precio2 = 6500.0;
								String descripcion2 = "KENZO HOMME EDP";
								Producto fragancia2 = new Producto(precio2, 40, codProducto2, descripcion2);
								System.out.println("(" + codProducto2 + ")" + descripcion2);
								System.out.println("precio = " + precio2);
								System.out.println("\t*******************\t");
								Integer codProducto3 = 010;
								Double precio3 = 700.0;
								String descripcion3 = "MEN OCEAN EDT ALTAI";
								Producto fragancia3 = new Producto(precio3, 5, codProducto3, descripcion3);
								System.out.println("(" + codProducto3 + ")" + descripcion3);
								System.out.println("precio = " + precio3);
								System.out.println("\t*******************\t");
								System.out.println("Si desea comprar ingrese el codigo del producto:");

							}

							if (categoriaElegida.equalsIgnoreCase("niños")) {

								System.out.println("\t*******************\t");
								Integer codProducto1 = 03;
								Double precio1 = 500.0;
								String descripcion1 = "DISNEY PRINCESA PERFUME MANZANA BLANCANIEVES";
								Producto fragancia1 = new Producto(precio1, 15, codProducto1, descripcion1);
								System.out.println("(" + codProducto1 + ")" + descripcion1);
								System.out.println("precio = " + precio1);
								System.out.println("\t*******************\t");
								Integer codProducto2 = 04;
								Double precio2 = 300.0;
								String descripcion2 = "PACO FUTBOL EDT 60ML";
								Producto fragancia2 = new Producto(precio2, 10, codProducto2, descripcion2);
								System.out.println("(" + codProducto2 + ")" + descripcion2);
								System.out.println("precio = " + precio2);
								System.out.println("\t*******************\t");
								Integer codProducto3 = 05;
								Double precio3 = 280.0;
								String descripcion3 = "DANIELLE MY LITTLE LATA";
								Producto fragancia3 = new Producto(precio3, 15, codProducto3, descripcion3);
								System.out.println("(" + codProducto3 + ")" + descripcion3);
								System.out.println("precio = " + precio3);
								System.out.println("\t*******************\t");
								System.out.println("Si desea comprar ingrese el codigo del producto:");

							}

							break;

						case 'b':
							if (categoriaElegida.equalsIgnoreCase("cosmetico")) {

								

							}

						}

					}

				}

				break;

			case 3:

				System.out.println("SESION CERRADA");
				break;

			default:
				System.err.println("ERROR 404 NOT FOUND");

			}

		} while (i < opciones);
	}

}
