/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan60.objectorientedakatsuki;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan Identitas karakter Alatsuki
 *                     dengan berbasis objek
 */
public class Ninja {
    protected String nama, asalDesa;
    
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAsalDesa() {
        return this.asalDesa;
    }
    
    public void setAsalDesa(String asalDesa) {
        this.asalDesa = asalDesa;
    }
}
