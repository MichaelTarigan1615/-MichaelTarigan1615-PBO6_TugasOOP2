class Motor extends Kendaraan {
    public Motor(double tanki) {
        super(tanki);
    }

    @Override
    public void isibbm(double liter) {
        System.out.println("Motor sedang diisi bensin ....");
        super.isibbm(liter);
    }
}
