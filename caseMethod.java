import java.util.Scanner;
public class caseMethod {
    Scanner sc = new Scanner(System.in);
    static caseMethodObjek[] penilaians = {
        new caseMethodObjek(new Mahasiswa("22001", "Ali Rahman", "Informatika"), new MataKuliah("MK001", "Struktur Data", 3), 80, 85, 90),
        new caseMethodObjek(new Mahasiswa("22001", "Ali Rahman", "Informatika"), new MataKuliah("MK002", "Basis Data", 3), 60, 75, 70),
        new caseMethodObjek(new Mahasiswa("22002", "Budi Santoso", "Informatika"), new MataKuliah("MK001", "Struktur Data", 3), 75, 70, 80),
        new caseMethodObjek(new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis"), new MataKuliah("MK002", "Basis Data", 3), 85, 90, 95),
        new caseMethodObjek(new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis"), new MataKuliah("MK003", "Desain Web", 3), 80, 90, 65)
    };

    public static void tampilNilai() {
        System.out.println("Data Nilai Mahasiswa:");
        for (caseMethodObjek p : penilaians) {
            p.tampilPenilaian();
        }
    }
    public static void tampilMahasiswa() {
        System.out.println("=== Daftar Mahasiswa ===");
        System.out.println("NIM: 22001 | Nama: Ali Rahman      | Prodi: Informatika");
        System.out.println("NIM: 22002 | Nama: Budi Santoso    | Prodi: Informatika");
        System.out.println("NIM: 22003 | Nama: Citra Dewi      | Prodi: Sistem Informasi Bisnis");
    }

    public static void tampilMataKuliah() {
        System.out.println("=== Daftara Mata Kuliah ===");
        System.out.println("Kode MK: MK001 | Nama: Struktur Data | SKS: 3");
        System.out.println("Kode MK: MK002 | Nama: Basis Data | SKS: 3");
        System.out.println("Kode MK: MK003 | Nama: Desain Web | SKS: 3");
    }

    public static void urutkanMahasiswaBerdasarkanNilaiAkhir() {
        for (int i = 0; i < penilaians.length - 1; i++) {
            for (int j = 0; j < penilaians.length - i - 1; j++) {
                if (penilaians[j].nilaiAkhir < penilaians[j + 1].nilaiAkhir) {
                    caseMethodObjek temp = penilaians[j];
                    penilaians[j] = penilaians[j + 1];
                    penilaians[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan berdasarkan nilai akhir (DESC).");
        tampilNilai();
    }

    public static int cariMahasiswaBerdasarkanNIM(String cari) {
        int posisi = -1;
        for (int i = 0; i < penilaians.length; i++) {
            if (penilaians[i].mahasiswa.nim.equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public static void tampilPencarian(String x, int pos) {
        if (pos != -1) {
            System.out.println("Mahasiswa Ditemukan: NIM: " + penilaians[pos].mahasiswa.nim + " | Nama: " + penilaians[pos].mahasiswa.nama + " | Prodi: " + penilaians[pos].mahasiswa.prodi);
        } else {
            System.out.println("Data Mahasiswa dengan NIM: " + x + " Tidak ditemukan.");
        }
    }
}
