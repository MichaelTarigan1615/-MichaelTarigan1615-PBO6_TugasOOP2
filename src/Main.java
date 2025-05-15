public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil(75);
        Kendaraan motor = new Motor(30);
        Kendaraan truk = new Truk(120);

        System.out.println("Selamat Datang di Pertamina Fasilkom");

        System.out.println("");
        mobil.isibbm(50);
        mobil.info();

        System.out.println("");
        motor.isibbm(25);
        motor.info();

        System.out.println("");
        truk.isibbm(100);
        truk.info();

        System.out.println("");
        System.out.println("Terima Kasih Sudah Mengisi Bahan Bakar");
    }
}