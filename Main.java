import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date waktuSekarang = new Date();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat formatWaktu = new SimpleDateFormat("HH:mm:ss");
        String tanggalString = formatTanggal.format(waktuSekarang);
        String waktuString = formatWaktu.format(waktuSekarang);


    String username = "jijah1234";
    String password =  "Sulthan";

    Scanner in = new Scanner(System.in);

    System.out.println("Login Terlebih Dahulu");
    System.out.println("Username :");
    String ansUsername = in.nextLine();
    System.out.println("Password :");
    String ansPassword = in.nextLine();


    if((ansUsername.equals(username)) && (ansPassword.equals(password) ))     // Equals
    {
       Scanner cap = new Scanner(System.in);
       String captcha="QwerTy";



       System.out.println("------captcha------");
       System.out.println("Kode   : QwerTy");
       System.out.println("Input  :");
       String ansCaptcha = cap.nextLine();

       if (ansCaptcha.equalsIgnoreCase(captcha))
       {
        System.out.println("MINIMARKET AZIZAH ND");
            System.out.println("Tanggal      :" + tanggalString);
            System.out.println("Waktu        :" + waktuString);
            System.out.println("=======================");
            System.out.println("DATA PELANGGAN");
            System.out.println("-----------------------");

        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Nama Pelanggan: ");
            String namaPelanggan = input.nextLine().trim(); // trim() untuk menghilangkan whitespace di awal dan akhir

            // Panggil method pengolahan string (contoh: mengubah menjadi huruf kapital)
            String namaPelangganUpper = olahString(namaPelanggan);

            System.out.print("No HP        : ");
            String hp = input.nextLine();
            System.out.print("Alamat       : ");
            String alamat = input.nextLine();

            System.out.println("++++++++++++++++++++++");
            System.out.println("DATA PEMBELIAN BARANG");
            System.out.println("----------------------");

            // Memasukkan satu item barang saja
            System.out.print("Kode Barang  : ");
            String kodeBarang = input.next();
            System.out.print("Nama Barang  : ");
            String namaBarang = input.next();
            System.out.print("Harga Barang : ");
            double harga = input.nextDouble();
            System.out.print("Jumlah Beli  : ");
            int jumlahBeli = input.nextInt();

            double total = harga * jumlahBeli;
            System.out.println("Total Bayar  : " + total);
            System.out.println("++++++++++++++++++++++");
            System.out.print("Kasir: ");
            String namaKasir = input.next();

            System.out.print("\n\n ");

            // Membuat array berisi satu item barang
            Pembayaran[] arrBarang = {new Barang(kodeBarang, namaBarang, harga, jumlahBeli)};

            // Membuat transaksi dengan satu item barang
            Transaksi transaksi = new Transaksi(namaPelangganUpper, hp, alamat, arrBarang);

            // Menampilkan detail transaksi
            System.out.println("\nDetail Transaksi:\n" + transaksi);

        } 
        catch (Exception e) 
        {
            System.err.println("Exception !!! Terjadi kesalahan: " + e.getMessage());
        }
       }

       else{
        System.out.println("Error");
       }
  
    }

   else
   {
     System.out.println("Username atau Password Anda Salah");
   }
}
private static String olahString(String input) {
        return input.toUpperCase();
}


    }
    

    
