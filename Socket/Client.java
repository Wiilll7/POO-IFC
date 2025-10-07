package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		Socket cliente = null;
		
		PrintStream saida = null;
		BufferedReader dados = null;
		try{
			cliente = new Socket("26.247.75.31",1306);
			String texto1 = String.valueOf(cliente.getInetAddress());
			texto1 = texto1.replaceAll("/","");
			System.out.println(texto1);
			dados = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
		
			saida = new PrintStream(cliente.getOutputStream());
			do{
				System.out.print("\nAdicionar evento [qualquer letra];\nEvento por fuso [1];\n");
				if (entrada.nextLine().equals("1")) {
					saida.println("data");
					System.out.print("Entre com o fuso: ");
					saida.println(entrada.nextLine());
					//System.out.println(dados.readLine());
					String[] eventos = dados.readLine().split(";");
					for (int i = 0; i < eventos.length; i++) {
						System.out.println(eventos[i]);
					}
				} else {
					StringBuilder texto = new StringBuilder();
					
					System.out.print("Descrição: ");
					texto.append(entrada.nextLine());
					texto.append(";");
					System.out.print("Local: ");
					texto.append(entrada.nextLine());
					texto.append(";");
					System.out.print("Data []: ");
					texto.append(entrada.nextLine());
					texto.append(";");
					System.out.print("Fuso: ");
					texto.append(entrada.nextLine());
					
					saida.println(texto.toString());
				}
				
			}while(true);
		}catch(IOException e){
			System.out.println("Algo errado aconteceu");
		}finally{
			cliente.close();
		}
		entrada.close();
	}
}