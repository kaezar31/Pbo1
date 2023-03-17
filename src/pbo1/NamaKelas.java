package pbo1;

/**
 *
 * @author dellg
 */
public class NamaKelas {
    private String nama; /*Mendeklarasikan sebuah variabel privat (hanya bisa diakses dalam class ini saja) 
                           yang bertipe data String dan diberi nama "nama".*/

    public NamaKelas(String nama) {
        this.nama = nama; /*Membuat konstruktor baru untuk kelas "NamaKelas" dengan satu parameter bertipe data String 
                            yang diberi nama "nama".
                            Konstruktor akan menginisialisasi variabel "nama" dengan nilai dari parameter "nama" yang diterima.
                           */
    }

    public String getNama() { 
        return nama;
    }
                            /*Mendefinisikan sebuah method bernama "getNama" yang akan mengembalikan nilai dari variabel "nama" 
                            yang disimpan pada objek saat ini.*/
    public void setNama(String nama) {
        this.nama = nama;
    }
}
/*Mendefinisikan sebuah method bernama "setNama" yang akan menetapkan nilai baru untuk variabel "nama" pada objek saat ini dengan 
nilai dari parameter "nama" yang diterima. */

/*Dengan demikian, kelas "NamaKelas" memiliki sebuah variabel privat "nama" yang hanya bisa diakses melalui 
method getter dan setter. Konstruktor digunakan untuk menginisialisasi nilai awal dari variabel "nama" saat 
objek baru dibuat. */