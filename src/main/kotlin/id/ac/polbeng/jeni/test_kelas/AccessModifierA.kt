package id.ac.polbeng.jeni.test_kelas

open class Mahasiswa(var nama: String, var nrp: Int) {
    open fun info() {
        println("$nama\n$nrp")
    }

    // Menggunakan override untuk menimpa metode toString bawaan
    override fun toString(): String {
        return "Mahasiswa{nama= $nama, nrp= $nrp}"
    }
}

class KetuaHima(nama: String, nrp: Int, val jurusan: String) : Mahasiswa(nama, nrp) {
    // Tidak perlu @Override, cukup gunakan override
    override fun info() {
        println("$nama\n$nrp\n$jurusan")
    }

    // Anda juga dapat menambahkan toString untuk KetuaHima jika diperlukan
    override fun toString(): String {
        return "KetuaHima{nama= $nama, nrp= $nrp, jurusan= $jurusan}"
    }
}

fun main() {
    val budi = Mahasiswa("Budi Gunawan", 1106123)
    val anton = KetuaHima("Anton", 1106789, "Teknik Informatika")

    // Menggunakan metode toString yang ditimpa
    println(anton.toString())
    println()

    // Memanggil info dari objek anton
    anton.info()
    println("Jenis Kelas = " + anton.javaClass.simpleName)
    println()

    // Memanggil info dari objek budi
    budi.info()
    println("Jenis Kelas = " + budi.javaClass.simpleName)

    // Objek ucok
    val ucok = KetuaHima("Ucok", 1105239, "Teknik Elektro")
    println()

    // Memanggil info dari objek ucok
    ucok.info()
    println("Jenis Kelas = " + ucok.javaClass.simpleName)
}
