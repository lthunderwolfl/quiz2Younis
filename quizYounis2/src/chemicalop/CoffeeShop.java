package chemicalop;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri
        int otherExpenses = 65000; // tetri
        int totalExpenses;

        // TODO 1
        // include all the expences that are provided in the expences.txt file

         double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {

        // TODO 2
        // Finish this function

        int profitInLaris = (pricePerCoffee + numCoffeeSold + totalCostOfBeans + otherExpenses) / 100;
        return profitInLaris;
    }
}
