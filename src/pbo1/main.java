
package pbo1;

/**
 *
 * @author dellg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    NamaKelas kelasB = new NamaKelas("Kelas B");
    Kelompok kelompok1 = new Kelompok(kelasB, 1, "Topan - 41155050220005" +" , " +"Satria Putra Ramadhan - 41155050220051");
/*Mendeklarasikan dan menginisialisasi objek kelasA dari kelas NamaKelas dan objek kelompok1 dari kelas Kelompok dengan parameter namaKelas, nomor, dan namaKelompok.*/


    System.out.println("Nama Kelas: " + kelompok1.getNamaKelas());
    System.out.println("Nomor Kelompok: " + kelompok1.getNomorKelompok());
    System.out.println("Anggota Kelompok: " + kelompok1.getNamaKelompok());
//Mencetak hasil dari method getNamaKelas(), getNomorKelompok(), dan getNamaKelompok() pada objek kelompok1 menggunakan System.out.println().

    kelompok1.setNamaKelompok("Kelompok B1"); //Memanggil method setNamaKelompok() pada objek kelompok1 untuk mengubah nilai dari namaKelompok.
    
    System.out.println("Nama Kelompok (setelah diubah): " + kelompok1.getNamaKelompok()); //Mencetak hasil dari method getNamaKelompok() pada objek kelompok1 setelah nilai namaKelompok diubah menggunakan System.out.println().
    
    }   
}
 /*Pada method main, dibuat objek kelasA dari class NamaKelas dengan nilai "Kelas A". Kemudian dibuat objek kelompok1 dari class Kelompok dengan argumen kelasA, 1, dan "Kelompok 1". 
Selanjutnya, dilakukan beberapa pemanggilan method getter dan setter pada objek kelompok1 dan hasilnya ditampilkan pada layar.

Prinsip assosiasi, agregasi, dan komposisi terletak pada class Kelompok.

Pada prinsip assosiasi, class Kelompok memiliki sebuah objek namaKelas dari class NamaKelas.

Pada prinsip agregasi, class Kelompok memiliki sebuah objek nomorKelompok dari class NomorKelompok. Objek nomorKelompok tidak sepenuhnya bergantung pada objek kelompok dan dapat digunakan di tempat lain.

Pada prinsip komposisi, class Kelompok memiliki sebuah objek namaKelompok dari tipe data String. Objek namaKelompok hanya ada pada objek kelompok dan akan dihapus ketika objek kelompok dihapus.
*/