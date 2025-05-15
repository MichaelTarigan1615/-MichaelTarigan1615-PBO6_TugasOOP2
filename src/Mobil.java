class Mobil extends Kendaraan {
    public Mobil(double tanki) {
        super(tanki);
    }

    @Override
    public void isibbm(double liter) {
        System.out.println("Mobil sedang diisi bensin ....");
        super.isibbm(liter);
    }
}
