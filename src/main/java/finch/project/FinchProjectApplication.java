package finch.project;

import finch.project.controller.Pedido;
import finch.project.controller.Produtos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class FinchProjectApplication {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);


		Pedido PedidoJose = new Pedido(001,"01/12/21", "Jose", 2);


		Produtos x_bacon = new Produtos("X-BACON", "Bacon, Hamburguer de Carne e Queijo", 4.90f);
		Produtos x_burger = new Produtos("X-BURGER", "Hamburguer de Carne e Queijo", 4.50f);
		Produtos x_egg = new Produtos("X-EGG","Ovo, Hamburguer de Carne e Queijo", 5.30f);
		Produtos x_egg_bacon = new Produtos("X-EGG BACON","Ovo, Bacon, Hamburguer de Carne e Queijo", 7.30f);

		Pedido pedidoJose = new Pedido(1010, "29/03/2021", "Jose", 5);
		pedidoJose.addItem(x_bacon, 2);
		pedidoJose.addItem(x_egg, 1);
		pedidoJose.addItem(x_egg_bacon, 2);

		Pedido pedidoAntonio = new Pedido(2020, "30/03/2021", "Antonio", 10);
		pedidoAntonio.addItem(x_bacon, 10);

		Pedido pedidoLais = new Pedido(3030, "01/04/2021", "Lais", 4);
		pedidoLais.addItem(x_egg_bacon, 2);
		pedidoLais.addItem(x_egg_bacon, 2);

		pedidoJose.print();
		pedidoAntonio.print();
		pedidoLais.print();







		SpringApplication.run(FinchProjectApplication.class, args);
	}

}
