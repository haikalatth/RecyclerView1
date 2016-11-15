package id.sch.smktelkom_mlg.learm.recyclerview1.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Mic on 15/11/2016.
 */

public class Hotel
{
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
