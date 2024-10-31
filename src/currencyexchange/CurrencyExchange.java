package currencyexchange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurrencyExchange {
    private String menuMessage = """
                    Choose currency you want to convert:
                    1 - USD
                    2 - EUR
                    3 - RUB
                    4 - BYN
                    5 - CNY
                    6 - to quit""";
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();
        currencyExchange.start(currencyExchange.getMenuMessage());
    }
    public void start(String menuMessage){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String inputLine = "";
            int menuItemNumber = 0;
            double amount = 0;
            System.out.println(menuMessage);
            while(!(inputLine = br.readLine()).equals("6")){
                try{
                    menuItemNumber = Integer.parseInt(inputLine);
                    if(menuItemNumber < 1 || menuItemNumber > 6) throw new NumberFormatException();
                }catch (NumberFormatException e){
                    System.out.println("Incorrect input data");
                    System.out.println(menuMessage);
                    continue;
                }
                System.out.println("Enter amount");
                amount = inputAmountMenu(br);
                break;
            }
            switch (menuItemNumber) {
                case 1 -> printConvertedCurrencies(ExchangeRates.USD, amount);
                case 2 -> printConvertedCurrencies(ExchangeRates.EUR, amount);
                case 3 -> printConvertedCurrencies(ExchangeRates.RUB, amount);
                case 4 -> printConvertedCurrencies(ExchangeRates.BYN, amount);
                case 5 -> printConvertedCurrencies(ExchangeRates.JPY, amount);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private double inputAmountMenu(BufferedReader br) throws IOException{
        double amount = 0;
        while(true){
            try{
                amount = Double.parseDouble(br.readLine());
                if(amount <= 0) throw new NumberFormatException();
            }catch (NumberFormatException e){
                System.out.println("Incorrect input data");
                System.out.println("Enter amount");
                continue;
            }
            return amount;
        }
    }
    private void printConvertedCurrencies(ExchangeRates exchangeRates, double amount){

        for(int i = 0; i < ExchangeRates.values().length; i++) {
            if(ExchangeRates.values()[i] == exchangeRates) continue;
            double resultAmount = exchangeRates.getRate() * amount /  ExchangeRates.values()[i].getRate();
            System.out.printf("%.4f %s = %.4f %s%n",
                    amount, exchangeRates.getName(), resultAmount, ExchangeRates.values()[i].getName());
        }
    }

    public String getMenuMessage() {
        return menuMessage;
    }
}
