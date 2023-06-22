
package hotelaria;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Quarto {
    private int numero;
    private TipoQuarto tipo;
    private final List<Reserva> reservas;

    public Quarto(int numero, TipoQuarto tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.reservas = new ArrayList<>();
    }

    // Getters e setters
    public enum TipoQuarto {
    INDIVIDUAL,
    DUPLO,
    TRIPLO,
    SUITE
    }
    
    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    /**
     * 
     */
    private Int numero;

    /**
     * 
     */
    private String tipo;

    /**
     * 
     */
    private Float preco;

    /**
     * @return
     */
    public Int getNumero() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setNumero(Int value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getTipo() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setTipo(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Float getPreco() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setPreco(Float value) {
        // TODO implement here
    }

}