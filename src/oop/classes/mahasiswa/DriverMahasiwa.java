package oop.classes.mahasiswa;

public class DriverMahasiwa {
    public static void main(String[] args) {
        Prodi pr1 = new Prodi();
        pr1.setKode("IF");
        pr1.setNama("Teknik Informatika");

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim("1301194376");
        mhs1.setNama("Raihan Romzi");
        mhs1.setProdi(pr1);

        System.out.println("Nama = " + mhs1.getNama());
        System.out.println("Nim = " + mhs1.getNim());
        System.out.print("Angkatan = "); mhs1.getAngkatan();
        System.out.print("Prodi = "); mhs1.getProdi();
    }
}
