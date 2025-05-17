package basics.printf_test;

public class Receipt_format_challenge {
    public static void main(String[] args) {
        /*
         * It should provide this output
         *  ========= ABC STORE =========
            Item             Qty   Price     Total
            --------------------------------------
            Apple            2     15.00     30.00
            Banana           5      7.50     37.50
            Chocolate Bar    1     50.00     50.00
            --------------------------------------
            TOTAL:                          117.50
            ==============================
            Thank you for shopping!

         * 
        */

        /* Note: Everything in here is hardcoded, continue improving it after learning loops, array and also add
         * scanner.
        */
        

        System.out.println("========= ABC STORE =========");
        System.out.printf("%-10s %-3s %-6s %s%n", "Item", "Qty", "Price", "Total");
        System.out.println("-----------------------------");

        System.out.printf("%-10s %-3s %-6s %s%n", "Apple", "2", "15.00", "30.00");
        System.out.printf("%-10s %-3s %-6s %s%n", "Banana", "5", "7.50", "37.50");
        System.out.printf("%-10s %-3s %-6s %s%n", "Chocolate Bar", "1", "50.00", "50.00");

        System.out.println("-----------------------------");

    }
}
