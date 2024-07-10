package records.part3;

import java.util.List;

public class Application {

    private static double simulatePrice(String ticker) {
       return Math.round(Math.random() * 1000.0);
    }

    private static void fetchPrices(List<String> tickers) {
        // Records double as Tuples
        // use local record
        record Stock(String ticker, double price) {
            public String toString() {
                return String.format("Ticker: %s, Price: %.2f", ticker, price);
            }
        }

        tickers.stream()
                .map(ticker -> new Stock(ticker, simulatePrice(ticker)))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        fetchPrices(List.of("A", "B", "C", "D", "E", "F", "G"));
    }
}
