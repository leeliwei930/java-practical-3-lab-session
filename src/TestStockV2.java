public class TestStockV2 {

//    The easiest way

    public static void main(String[] args) {
        Stock[] stock = new Stock[5];
        stock[0] = new Stock("SUNW", "Sun Microsystems Inc.");
        stock[1] = new Stock("BMW", "BMW Malaysia");
        stock[2] = new Stock("TestR", "Test Resources");
        stock[3] = new Stock("MACR", "Malaysian Coal Resources");

        stock[4] = new Stock("ABD", "Australlian Business Deals");
        for (int i = 0; i < stock.length; i++) {
            System.out.println("Stock Name: " + stock[i].getName() + ", " + stock[i].getSymbol());
            stock[i].setPreviousClosingPrice(100);

            stock[i].setCurrentPrice(90);
            System.out.println("Previous Closing Price: " + stock[i].getPreviousClosingPrice());
            System.out.println("Current Price:  " + stock[i].getCurrentPrice());
            System.out.println("Price Change:  " + stock[i].getChangePercent() * 100 + "%");

        }
    }

}

