import java.util.Scanner;
public class caseMethodMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                   caseMethod.tampilMahasiswa();
                    break;
                case 2:
                    tampilMataKuliah(); 
                    break;
                case 3:
                    tampilPenilaian(); 
                    break;
                case 4:
                    urutkanMahasiswaBerdasarkanNilaiAkhir(); 
                    break;
                case 5:
                    cariMahasiswaBerdasarkanNIM(); 
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 0);
    }
        
}
