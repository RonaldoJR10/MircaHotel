
package hotelaria;

import java.time.LocalDate;

/**
 * 
 */
public class Reserva {
    private final Cliente cliente;
    private final Quarto quarto;
    private final LocalDate dataInicio;
    private final LocalDate dataFim;

    public Reserva(Cliente cliente, Quarto quarto, LocalDate dataInicio, LocalDate dataFim) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    public double calcularValorTotal() {
        // Lógica para calcular o valor total da reserva
        return 0;
        // Lógica para calcular o valor total da reserva
    }

    /**
     * 
     */
    private Float dataCheckin;

    /**
     * 
     */
    private Float dataCheckOut;

    /**
     * 
     */
    private String Cliente;

    /**
     * 
     */
    private Int numQuarto;

    /**
     * @return
     */
    public Float getDataCheckin() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Float getDataCheckOut() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setDataCheckin(Float value) {
        // TODO implement here
    }

    /**
     * @param value
     */
    public void setDataCheckOut(Float value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getCliente() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setCliente(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Int getNumQuarto() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setNumQuarto(Int value) {
        // TODO implement here
    }

}