/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1;

/**
 *
 * @author dellg
 */
public class Kelompok {
    private NamaKelas namaKelas;
    private NomorKelompok nomorKelompok;
    private String namaKelompok;
    /*Mendeklarasikan 3 variabel privat (hanya bisa diakses dalam class ini saja):
      "namaKelas" bertipe data "NamaKelas"
      "nomorKelompok" bertipe data "NomorKelompok"
      "namaKelompok" bertipe data "String" */

    public Kelompok(NamaKelas namaKelas, int nomor, String namaKelompok) {
        this.namaKelas = namaKelas;
        this.nomorKelompok = new NomorKelompok(nomor);
        this.namaKelompok = namaKelompok;
    }
    /*Membuat konstruktor baru untuk kelas "Kelompok" dengan tiga parameter:
      "namaKelas" bertipe data "NamaKelas"
      "nomor" bertipe data "int"
      "namaKelompok" bertipe data "String"
      Konstruktor akan menginisialisasi variabel "namaKelas" dengan nilai dari parameter "namaKelas" yang diterima.
      Konstruktor akan membuat objek baru dari kelas "NomorKelompok" dengan nilai dari parameter "nomor" yang diterima 
      dan menginisialisasi variabel "nomorKelompok" dengan objek tersebut.
      Konstruktor akan menginisialisasi variabel "namaKelompok" dengan nilai dari parameter "namaKelompok" yang diterima. */
    
    
    public String getNamaKelas() {
        return namaKelas.getNama(); /*Mendefinisikan sebuah method bernama "getNamaKelas" yang akan mengembalikan nilai dari variabel 
                                    "namaKelas" yang disimpan pada objek saat ini melalui method getter.*/
    }

    public int getNomorKelompok() {
        return nomorKelompok.getNomor(); /*Mendefinisikan sebuah method bernama "getNomorKelompok" yang akan mengembalikan nilai dari variabel "nomorKelompok" 
                                           yang disimpan pada objek saat ini melalui method getter.*/
    }

    public String getNamaKelompok() {
        return namaKelompok;/*Mendefinisikan sebuah method bernama "getNamaKelompok" yang akan mengembalikan nilai dari variabel "namaKelompok" yang disimpan pada
                             objek saat ini.*/
    }

    public void setNamaKelompok(String namaKelompok) {
        this.namaKelompok = namaKelompok; /*Mendefinisikan sebuah method bernama "setNamaKelompok" yang akan menetapkan nilai baru untuk variabel "namaKelompok" pada 
                                            objek saat ini dengan nilai dari parameter "namaKelompok" yang diterima.*/
    }
}
