package currencyexchange;

public enum ExchangeRates {
    USD("USD", 1.0), EUR("EUR", 1.0821), RUB("RUB",0.0103),
    BYN("BYN",0.3038), JPY("JPY",0.0065);
    private final String name;
    private final double rate;
     ExchangeRates(String name, double rate){
         this.name = name;
         this.rate = rate;
     }
     public double getRate(){
         return this.rate;
     }

    public String getName() {
        return name;
    }
}
