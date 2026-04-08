public class BankBNI extends Bank {
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah: 4%"); 
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        
        int biayaAdmin = bankTujuan.equalsIgnoreCase("BNI") ? 0 : 6500;
        
        System.out.println("Proses Transfer BNI ke " + bankTujuan + "...");
        System.out.println("Nominal: Rp" + jumlah);
        System.out.println("Tujuan: " + rekeningTujuan);
        System.out.println("Biaya Admin: Rp" + biayaAdmin);
        System.out.println("Total yang ditarik: Rp" + (jumlah + biayaAdmin));
    }
}