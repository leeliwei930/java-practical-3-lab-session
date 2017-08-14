public class TestStock {
    public static void main(String[] args) {

        String[][] stockArray = {
                {"BMW", "BMW Malaysia"},
                {"TestR", "Test Resources"},
                {"MACR", "Malaysia Coal Resources"},
                {"ABD", "Australian Business Deals"}
        };
        for (int i = 0; i < stockArray.length; i++) {
            Stock stock = new Stock(stockArray[i][0], stockArray[i][1]);
            System.out.println("Stock Name: " + stockArray[i][0] + ", " + stockArray[i][1]);
            stock.setPreviousClosingPrice(100);

            stock.setCurrentPrice(90);
            System.out.println("Previous Closing Price: " + stock.getPreviousClosingPrice());
            System.out.println("Current Price:  " + stock.getCurrentPrice());
            System.out.println("Price Change:  " + stock.getChangePercent() * 100 + "%");

        }
    }
}
