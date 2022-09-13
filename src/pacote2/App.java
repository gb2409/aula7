package pacote2;

import java.util.InputMismatchException;

import pacote3.Carro;
import pacote3.Motorista;

public class App {
    public static void main(String[] args) throws Exception {
        // Carro car = new Carro("ABC1234", 456789);
        // Motorista mot = new Motorista(car);

        // System.out.println("Passageiro: Motorista, acelera o carro até 100km/h");
        // System.out.println("Motorista: Ok! Vamos lá!");

        // mot.acelerar(100);
        // System.out.printf("Velocidade do carro: %s km/h", car.getVelocidadeAtual());

        Motorista mot = new Motorista("Leandro", 123456);
        Carro car = new Carro(mot);
        try {
            car.setPlaca(null);
            System.out.println("Passageiro: Motorista, acelera o carro até 100km/h");
            System.out.println("Motorista: Ok! Vamos lá!");

            car.getMotorista().acelerar(100);
            System.out.println(car.getPlaca());

            System.out.printf("Velocidade do carro: %s km/h", car.getVelocidadeAtual());
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Programa encerrado");
            return;
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
            System.out.println("O programa continuará com a placa ABC1234");
            car.setPlaca("ABC1234");
        }
    }
}
