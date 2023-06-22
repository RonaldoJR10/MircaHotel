
package hotelaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Cliente {
    private String nome;
    private String email;
    private List<Reserva> reservas;
    private String Nome;
    /**
     * Default constructor
     * @param nome
     * @param email
     */
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.reservas = new ArrayList<>();
    }
    
    public void realizarReserva(Quarto quarto, LocalDate dataInicio, LocalDate dataFim) {
    Reserva reserva = new Reserva(this, quarto, dataInicio, dataFim);
    reservas.add(reserva);
    // Lógica adicional para persistir a reserva
    }
    /**
     * 
     */
    private final String nome;

    /**
     * 
     */
    private Float telefone;

    /**
     * 
     */
    private final String email;

    /**
     * @return
     */
    public String getNome() {
                
        return Nome;
    }

    /**
     * @param value
     */
    public void setNome(String value) {
        // TODO implement here
        this.Nome = Nome;
    }

    /**
     * @return
     */
    public Float getTelefone() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setTelefone(Float value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setEmail(String value) {
        // TODO implement here
    }

}