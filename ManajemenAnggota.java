import java.util.ArrayList;
import java.util.List;

class ManajemenAnggota {
    private List<Anggota> daftarAnggota;

    public ManajemenAnggota() {
        daftarAnggota = new ArrayList<>();
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }

    public void hapusAnggota(String kodeAnggota) {
        daftarAnggota.removeIf(anggota -> anggota.getKodeAnggota().equals(kodeAnggota));
    }

    public void editAnggota(String kodeAnggota, String namaBaru, String levelKeahlianBaru) {
        for (Anggota anggota : daftarAnggota) {
            if (anggota.getKodeAnggota().equals(kodeAnggota)) {
                anggota.setNama(namaBaru);
                anggota.setLevelKeahlian(levelKeahlianBaru);
            }
        }
    }

    public void tampilkanAnggota() {
        for (Anggota anggota : daftarAnggota) {
            System.out.println("Nama: " + anggota.getNama() + ", Kode Anggota: " + anggota.getKodeAnggota() + ", Level Keahlian: " + anggota.getLevelKeahlian());
        }
    }
}