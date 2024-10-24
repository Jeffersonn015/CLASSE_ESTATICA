package conversor;

public class Main {
    public static void main(String[] args) {
    	
        // Definindo valores para as conversões
        double celsius = 25.0;       // Temperatura em Celsius
        double quilometros = 10.0;   // Distância em quilômetros
        double gramas = 500.0;       // Massa em gramas

        // Chamando os métodos da classe ConversorUnidades para realizar as conversões
        double fahrenheit = ConversorUnidades.celsiusParaFahrenheit(celsius);
        double milhas = ConversorUnidades.quilometrosParaMilhas(quilometros);
        double libras = ConversorUnidades.gramasParaLibras(gramas);

        // Exibindo os resultados das conversões no console
        System.out.println(celsius + " °C é igual a " + fahrenheit + " °F");
        System.out.println(quilometros + " km é igual a " + milhas + " milhas");
        System.out.println(gramas + " g é igual a " + libras + " lbs");
    }
}
