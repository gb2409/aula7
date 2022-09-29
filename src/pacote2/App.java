package pacote2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import pacote3.Acelerador;
import pacote3.Autenticador;
import pacote3.Carro;
import pacote3.Motorista;
import pacote3.Passageiro;
import pacote3.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // Carro car = new Carro("ABC1234", 456789);
        // Motorista mot = new Motorista(car);

        // System.out.println("Passageiro: Motorista, acelera o carro até 100km/h");
        // System.out.println("Motorista: Ok! Vamos lá!");

        // mot.acelerar(100);
        // System.out.printf("Velocidade do carro: %s km/h", car.getVelocidadeAtual());

        // Motorista mot = new Motorista("Leandro", 123456);
        // Carro car = new Carro(mot);
        // try {
        //     car.setPlaca(null);
        //     System.out.println("Passageiro: Motorista, acelera o carro até 100km/h");
        //     System.out.println("Motorista: Ok! Vamos lá!");

        //     car.getMotorista().acelerar(100);
        //     System.out.println(car.getPlaca());

        //     System.out.printf("Velocidade do carro: %s km/h", car.getVelocidadeAtual());
        // } catch (InputMismatchException ex) {
        //     System.out.println(ex.getMessage());
        //     System.out.println("Programa encerrado");
        //     return;
        // } catch (NullPointerException ex) {
        //     System.out.println(ex.getMessage());
        //     System.out.println("O programa continuará com a placa ABC1234");
        //     car.setPlaca("ABC1234");
        // }

        //Acelerador[] aceleradores = new Acelerador[3];
       // Motorista mot = new Motorista("João", 12345);

       // aceleradores[0] = new Carro("ABC1234", 3121212, mot);
       // aceleradores[1] = new Carro("DEF5678", 31113, mot);
        //aceleradores[2] = mot;

        //for (Acelerador a: aceleradores) {
        //    System.out.printf("Chamada do método em objeto do tipo %s", a.getClass().getSimpleName());
        //    System.out.printf(" - Velocidade atual: %d\n", a.acelerar());
       // }

            // Autenticador aut = new Autenticador();

            // Motorista mot = new Motorista("João", 12345);

            // if (aut.autenticar(mot)){

            //     System.out.println("Acesso autorizado");

            // }

            // else{

            //     System.out.println("Acesso não autorizado");

            // }

            // Carro car = new Carro("ABC1234", 565656, new Motorista("Maria", 1209));

            // if (aut.autenticar(car)){

            //     System.out.println("Acesso autorizado");
                
            // }

            // else {

            //     System.out.println("Acesso não autorizado");

            // }

            List <Pessoa> pessoas = new ArrayList<>();
                pessoas.add(new Passageiro("Passageiro 1" , "1234567890"));
                pessoas.add(new Passageiro("Passageiro 2" , "9876543210"));
                pessoas.add(new Motorista("Motorista 1"  , "8976543210"));
            
                System.out.println("Total de pessoas: " + pessoas.size());

                if (pessoas.contains(new Motorista("Motorista 2" , "3456789012"))){
                    System.out.println("Ja existe pessoa com este cpf!!");
                }

                else {
                    System.out.println("Pessoa não localizada!!");
                }

                Pessoa p = pessoas.remove(1);
                System.out.printf("A pessoa %s foi removida! A lista agora possui %d pessoas. \n"
                  ,  p.getNome(),pessoas.size());

                  System.out.println("Pessoas da lista: ");
                  for(Pessoa pes : pessoas ){
                    System.out.printf("Nome: %s - Cpf: %s - Tipo: %s \n" 
                    , pes.getNome() , pes.getCpf() , pes.getClass().getSimpleName());
                  }

    }
}   