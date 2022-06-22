package designpatterns.observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {
    private int startTime;
    private String stock;
    private double price;

    private StockGrabber stockGrabber;

    public GetTheStock(StockGrabber stockGrabber, int newStartTime, String newStock, double newPrice){
        this.stockGrabber = stockGrabber;
        startTime = newStartTime;
        stock = newStock;
        price = newPrice;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++){
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println("RunnableThread interrupted");
            }

            // generate rand num between -.03 and .03
            double randNum = (Math.random() * (.06)) - .03;

            DecimalFormat df = new DecimalFormat("#.##");

            price = Double.valueOf(df.format(price + randNum));

            if (stock == "IBM"){
                stockGrabber.setIBMPrice(price);
            }
            if (stock == "AAPL"){
                stockGrabber.setAAPLPrice(price);
            }
            if (stock == "GOOG"){
                stockGrabber.setGOOGPrice(price);
            }

            System.out.println(stock + ": " + df.format(price + randNum) + " " + df.format(randNum));

            System.out.println();
        }

    }
}
