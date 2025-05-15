public class Kendaraan {
    private double bbm;
    private double tanki;

    public Kendaraan(double tanki) {
        this.tanki = tanki;
        this.bbm = 0;
    }

    public Kendaraan() {
    }

    public double getbbm() {
        return bbm;
    }

    public void setbbm() {
        if (bbm >= 0 && bbm <= tanki) {
            this.bbm = bbm;
        } else {
            System.out.println("Tidak valid! Masukkan Ulang.");
        }
    }

    public void isibbm(double liter) {
        if (liter <= 0) {
            System.out.println("Harus lebih dari 0.");
            return;
        }

        if (bbm + liter > tanki) {
            System.out.println("Bahan bakar melebihi kapasitas tanki.");
            bbm = tanki;
        } else {
            bbm += liter;
            System.out.println("Berhasil mengisi bahan bakar " + liter + " liter.");
        }
    }

    public void info() {
        System.out.println("Bahan bakar: " + bbm + " / " + tanki + " liter.");
    }
}
