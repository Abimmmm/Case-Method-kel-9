import java.util.Scanner;
public class caseMethod {
    // diisi buat kumpulan method atau fungsi
    Scanner sc = new Scanner(System.in);
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
}
