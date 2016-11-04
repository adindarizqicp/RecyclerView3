package id.sch.smktelkom_mlg.learn.recycleview3.model;

import java.io.Serializable;

/**
 * Created by Adinda Rizqi on 11/2/2016.
 */

public class Hotel implements Serializable {
    public String judul, deskripsi, detail, lokasi, foto;

    public Hotel(String judul, String deskripsi, String detail, String lokasi, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}
