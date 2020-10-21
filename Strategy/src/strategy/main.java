package strategy;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Context context = new Context(new CaixaAlta());
		String text = scanner.nextLine();
		System.out.println(context.executeString(text));
		context = new Context(new CaixaBaixa());
		System.out.println(context.executeString(text));
		context = new Context(new Negrito());
		System.out.println(context.executeString(text));
		context = new Context(new Italico());
		System.out.println(context.executeString(text));
	}

}
