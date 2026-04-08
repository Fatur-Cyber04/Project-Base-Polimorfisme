public class BankBCA extends Bank {
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BCA adalah: 4.5%"); 
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        
        int biayaAdmin = bankTujuan.equalsIgnoreCase("BCA") ? 0 : 2500;
        
        System.out.println("Proses Transfer BCA ke " + bankTujuan + "...");
        System.out.println("Nominal: Rp" + jumlah);
        System.out.println("Tujuan: " + rekeningTujuan);
        System.out.println("Biaya Admin: Rp" + biayaAdmin);
        System.out.println("Total Transaksi: Rp" + (jumlah + biayaAdmin));
    }
}