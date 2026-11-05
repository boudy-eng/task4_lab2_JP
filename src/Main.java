import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal productCost = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.05");
        int numberOfUnits = 10_000;

        BigDecimal vatPerUnit = productCost.multiply(vatRate);

        BigDecimal totalNetSales = BigDecimal.ZERO;
        BigDecimal totalVat = BigDecimal.ZERO;
        BigDecimal totalGrossSales = BigDecimal.ZERO;

        for (int i = 0; i < numberOfUnits; i++) {
            totalNetSales = totalNetSales.add(productCost);
            totalVat = totalVat.add(vatPerUnit);
            totalGrossSales = totalGrossSales.add(productCost.add(vatPerUnit));
        }

        System.out.println("VAT for one unit: " + vatPerUnit.toPlainString());
        System.out.println("Total net sales: " + totalNetSales.toPlainString());
        System.out.println("Total VAT: " + totalVat.toPlainString());
        System.out.println("Total gross sales: " + totalGrossSales.toPlainString());
    }
}