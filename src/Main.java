public class Main {
    public static void main(String[] args) {
        double productCost = 9.99;
        double vatRate = 0.05;
        int numberOfUnits = 10_000;

        double vatPerUnit = productCost * vatRate;

        double totalNetSales = 0.0;
        double totalVat = 0.0;
        double totalGrossSales = 0.0;

        for (int i = 0; i < numberOfUnits; i++) {
            totalNetSales += productCost;
            totalVat += vatPerUnit;
            totalGrossSales += productCost + vatPerUnit;
        }

        System.out.println("VAT for one unit: " + vatPerUnit);
        System.out.println("Total net sales: " + totalNetSales);
        System.out.println("Total VAT: " + totalVat);
        System.out.println("Total gross sales: " + totalGrossSales);
    }
}