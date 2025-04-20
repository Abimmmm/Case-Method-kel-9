public class caseMethod {
    static caseMethodObjek[] penilaians = {
        new caseMethodObjek(new Mahasiswa("22001", "Ali Rahman", "Informatika"), new MataKuliah("MK001", "Struktur Data", 3), 80, 85, 90),
        new caseMethodObjek(new Mahasiswa("22001", "Ali Rahman", "Informatika"), new MataKuliah("MK002", "Basis Data", 3), 60, 75, 70),
        new caseMethodObjek(new Mahasiswa("22002", "Budi Santoso", "Informatika"), new MataKuliah("MK001", "Struktur Data", 3), 75, 70, 80),
        new caseMethodObjek(new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis"), new MataKuliah("MK002", "Basis Data", 3), 85, 90, 95),
        new caseMethodObjek(new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis"), new MataKuliah("MK003", "Desain Web", 3), 80, 90, 65)
    };

    public static void tampilMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (caseMethodObjek p : penilaians) {
            System.out.println("NIM: " + p.mahasiswa.nim + " | Nama: " + p.mahasiswa.nama + " | Prodi: " + p.mahasiswa.prodi);
        }
    }

    public static void tampilMataKuliah() {
        System.out.println("Daftar Mata Kuliah:");
        boolean[] tampil = new boolean[penilaians.length];
        for (int i = 0; i < penilaians.length; i++) {
            if (!tampil[i]) {
                System.out.println("Kode MK: " + penilaians[i].matkul.kodeMK + " | Nama: " + penilaians[i].matkul.namaMK + " | SKS: " + penilaians[i].matkul.sks);
                for (int j = i + 1; j < penilaians.length; j++) {
                    if (penilaians[i].matkul.kodeMK.equals(penilaians[j].matkul.kodeMK)) {
                        tampil[j] = true;
                    }
                }
            }
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
