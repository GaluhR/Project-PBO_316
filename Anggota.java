class Anggota {
    private String nama;
    private String kodeAnggota;
    private String levelKeahlian;

    public Anggota(String nama, String kodeAnggota, String levelKeahlian) {
        this.nama = nama;
        this.kodeAnggota = kodeAnggota;
        this.levelKeahlian = levelKeahlian;
    }

    public String getNama() {
        return nama;
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public String getLevelKeahlian() {
        return levelKeahlian;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLevelKeahlian(String levelKeahlian) {
        this.levelKeahlian = levelKeahlian;
    }
}