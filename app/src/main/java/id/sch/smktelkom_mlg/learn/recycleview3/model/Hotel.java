package id.sch.smktelkom_mlg.learn.recycleview3.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Adinda Rizqi on 11/2/2016.
 */

public class Hotel {
    public String judul, deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
