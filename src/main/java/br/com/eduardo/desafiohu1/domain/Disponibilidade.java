package br.com.eduardo.desafiohu1.domain;

import java.util.Date;

/**
 * @author: eduardo.barbosa
 * @since: 30/09/2015
 */
public class Disponibilidade {

    private Hotel hotel;

    private Date date;

    private Boolean available;

    public Disponibilidade(Hotel hotel, Date date, Boolean available) {
        this.hotel = hotel;
        this.date = date;
        this.available = available;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disponibilidade)) return false;

        Disponibilidade that = (Disponibilidade) o;

        if (!hotel.equals(that.hotel)) return false;
        if (!date.equals(that.date)) return false;
        return available.equals(that.available);

    }

    @Override
    public int hashCode() {
        int result = hotel.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + available.hashCode();
        return result;
    }
}
