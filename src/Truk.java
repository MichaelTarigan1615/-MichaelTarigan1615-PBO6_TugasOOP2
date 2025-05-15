class Truk extends Kendaraan {
    public Truk(double tanki) {
        super(tanki);
    }

    @Override
    public void isibbm(double liter) {
        System.out.println("Truk sedang diisi bensin ....");
        super.isibbm(liter);
    }
}
