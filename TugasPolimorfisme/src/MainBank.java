public class MainBank {
    public static void main(String[] args) {
        Bank bankUmum = new Bank();
        BankBNI bni = new BankBNI();
        BankBCA bca = new BankBCA();

        System.out.println("=== DEMO METHOD OVERLOADING (Class Bank) ===");
        bankUmum.transferUang(500000, "12345678");
        bankUmum.transferUang(1000000, "88776655", "MANDIRI");
        bankUmum.transferUang(200000, "11223344", "BRI", "Bayar Kost");
        bankUmum.sukuBunga();

        System.out.println("\n=== DEMO METHOD OVERRIDING & BONUS (Bank BNI) ===");
        bni.sukuBunga();
        
        bni.transferUang(50000, "998877", "BCA");

        System.out.println("\n=== DEMO METHOD OVERRIDING & BONUS (Bank BCA) ===");
        bca.sukuBunga();
        
        bca.transferUang(300000, "554433", "BCA");
    }
}