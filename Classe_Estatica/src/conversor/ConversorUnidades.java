package conversor;

public class ConversorUnidades {
    // Método para converter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        // Fórmula de conversão de Celsius para Fahrenheit
        return (celsius * 1.8) + 32; // Retorna a temperatura em Fahrenheit
    }

    // Método para converter quilômetros para milhas
    public static double quilometrosParaMilhas(double quilometros) {
        // 1 milha equivale a aproximadamente 1.609 quilômetros
        return quilometros / 1.609; // Retorna a distância em milhas
    }

    // Método para converter gramas para libras
    public static double gramasParaLibras(double gramas) {
        // 1 libra equivale a aproximadamente 453.592 gramas
        return gramas * 0.00220462; // Retorna a massa em libras
    }
}
