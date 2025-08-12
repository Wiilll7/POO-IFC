import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class Grafico_Aleatorio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random numRandom = 	new Random();
		int[] numeros;
		System.out.println("Quantos números aleatorios voce quer gerar?");
		int qnt = in.nextInt();
		numeros = new int[qnt+1];
		System.out.println("Valor mínimo que deseja gerar: ");
		int min = in.nextInt();
		System.out.println("Valor máximo que deseja gerar: ");
		int max = in.nextInt();
		if (min > max) {
			int troca = max;
			max = min;
			min = troca;
		}
		StringBuilder linhas = new StringBuilder();
		linhas.append("['Item', 'Série A'],\n");
		for (int i = 1; i <= qnt; i++) {
		    int a = min + numRandom.nextInt((max - min) + 1);
		    linhas.append("['Ponto " + i + "', " + a + "]");
		    if (i < qnt) linhas.append(",\n");
		}
		String caminhoArquivo = "grafico.html";
		String conteudo = "<html>\r\n"
						+ "<head>\r\n"
						+ "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n"
						+ "    <script type=\"text/javascript\">\r\n"
						+ "        google.charts.load('current', { 'packages': ['corechart'] });\r\n"
						+ "        google.charts.setOnLoadCallback(drawChart);\r\n"
						+ "\r\n"
						+ "        function drawChart() {\r\n"
						+ "            var data = google.visualization.arrayToDataTable([\r\n"
						+ 				linhas.toString() + "\r\n"
						+ "            ]);\r\n"
						+ "\r\n"
						+ "            var options = {\r\n"
						+ "                title: 'Company Performance',\r\n"
						+ "                curveType: 'function',\r\n"
						+ "                legend: { position: 'bottom' }\r\n"
						+ "            };\r\n"
						+ "\r\n"
						+ "            var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));\r\n"
						+ "\r\n"
						+ "            chart.draw(data, options);\r\n"
						+ "        }\r\n"
						+ "    </script>\r\n"
						+ "</head>\r\n"
						+ "<body>\r\n"
						+ "    <div id=\"curve_chart\" style=\"width: 900px; height: 500px\"></div>\r\n"
						+ "</body>\r\n"
						+ "</html>\r\n"
						+ "";
		try {
			FileWriter writer = new FileWriter(caminhoArquivo);
			writer.write(conteudo);
			writer.close();
			System.out.println("Arquivo criado com suscesso!");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
		}
		in.close();
	}
}