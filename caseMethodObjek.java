public class caseMethodObjek {
    Mahasiswa mahasiswa;
    MataKuliah matkul;
    int tugas, uts, uas;
    double nilaiAkhir;

    public caseMethodObjek(Mahasiswa mahasiswa, MataKuliah matkul, int tugas, int uts, int uas) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.nilaiAkhir = (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    void tampilPenilaian() {
        System.out.println(mahasiswa.nama + " | " + matkul.namaMK + " | Nilai Akhir: " + nilaiAkhir);
    }
}

