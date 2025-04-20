public class caseMethod {
    static caseMethodObjek[] penilaians = {
        new caseMethodObjek(new Mahasiswa("22001", "Ali Rahman", "Informatika"), new MataKuliah("MK001", "Struktur Data", 3), 80, 85, 90),
        new caseMethodObjek(new Mahasiswa("22001", "Ali Rahman", "Informatika"), new MataKuliah("MK002", "Basis Data", 3), 60, 75, 70),
        new caseMethodObjek(new Mahasiswa("22002", "Budi Santoso", "Informatika"), new MataKuliah("MK001", "Struktur Data", 3), 75, 70, 80),
        new caseMethodObjek(new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis"), new MataKuliah("MK002", "Basis Data", 3), 85, 90, 95),
        new caseMethodObjek(new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis"), new MataKuliah("MK003", "Desain Web", 3), 80, 90, 65)
    };
    static Mahasiswa[] mahasiswa = {
        new Mahasiswa("22001", "Ali Rahman", "Informatika"),
        new Mahasiswa("22002", "Budi Santoso", "Informatika"),
        new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
    };
    static MataKuliah[] matkul = {
        new MataKuliah("MK001", "Struktur Data", 3),
        new MataKuliah("MK002", "Basis Data", 3),
        new MataKuliah("MK003", "Desain Web", 3)
    };

    public static void tampilMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mahasiswa2 : mahasiswa) {
            mahasiswa2.tampilMahasiswa();
        }
    }

    public static void tampilMataKuliah() {
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah mk : matkul) {
            mk.tampilMataKuliah();
        }
    }

    public static void tampilPenilaian() {
        System.out.println("Data Penilaian:");
        for (caseMethodObjek p : penilaians) {
            p.tampilPenilaian();
        }
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
        tampilPenilaian();
    }

}
