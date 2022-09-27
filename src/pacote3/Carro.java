package pacote3;

import java.util.InputMismatchException;

public class Carro implements Acelerador, Autenticavel {
    private String letrasPlaca;
    private int numerosPlaca;
    private int numChassi;
    private int velocidadeAtual;
    private Motorista motorista;

    // public Carro() { }

    // public Carro(String placa, int numChassi) {
    //     setPlaca(placa);
    //     this.numChassi = numChassi;
    // }

    public Carro(Motorista motorista) {
        this.motorista = motorista;
        this.motorista.setVeiculoAtual(this);
    }

    public Carro(String placa, int numChassi, Motorista motorista) {
        this(motorista);
        setPlaca(placa);
        this.numChassi = numChassi;
    }

    @Override
    public int acelerar() {
        velocidadeAtual++;
        return velocidadeAtual;
    }

    @Override
    public int acelerar(int limite) {
        for (int i = velocidadeAtual; i < limite; i++) {
            acelerar();
        }

        return velocidadeAtual;
    }

    public boolean frear() {
        return false;
    }

    public String getPlaca() {
        if ("ERRO!!!".equals(this.letrasPlaca)) {
            return this.letrasPlaca;
        } else {
            return this.letrasPlaca + this.numerosPlaca;
        }
    }

    public void setPlaca(String placa) {
        if (placa == null) {
            throw new NullPointerException("O valor da placa não pode ser nulo");
        }

        if (placa.length() != 7) {
            throw new InputMismatchException("A placa deve ter 7 caracteres");
        }

        if (!placa.matches("[A-Z]{3}\\d{4}")) {
            throw new InputMismatchException("Os últimos 4 caracteres precisam ser númericos");
        }

        this.letrasPlaca = placa.substring(0, 3);
        this.numerosPlaca = Integer.parseInt(placa.substring(3));
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String obterCredenciais() {
        
        return getPlaca();
    }
}
