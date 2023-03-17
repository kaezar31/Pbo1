package pbo1;

/**
 *
 * @author dellg
 */
public class NomorKelompok {
    private int nomor; /* Mendeklarasikan sebuah variabel privat (hanya bisa diakses dalam class ini saja) 
                          yang bertipe data integer dan diberi nama "nomor". */

    public NomorKelompok(int nomor) {
        this.nomor = nomor; /*Membuat konstruktor baru untuk kelas "NomorKelompok" dengan satu parameter bertipe 
                              data integer yang diberi nama "nomor". Konstruktor akan menginisialisasi variabel 
                              "nomor" dengan nilai dari parameter "nomor" yang diterima. */
    }
    
    public int getNomor() {
        return nomor; /*Mendefinisikan sebuah method bernama "getNomor" yang akan mengembalikan nilai dari variabel 
                       "nomor" yang disimpan pada objek saat ini.*/
    }

    public void setNomor(int nomor) {
        this.nomor = nomor; /*Mendefinisikan sebuah method bernama "setNomor" yang akan menetapkan nilai baru untuk variabel
                            "nomor" pada objek saat ini dengan nilai dari parameter "nomor" yang diterima.*/
    }
}
