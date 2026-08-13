package flamingo.aprendendo.introducao;

import java.time.LocalDate;

public class ExercicioPraticaBasica {
    static void main(String[] args) {
        String nome = "Yago Pinho";
        String endereco = "Rua Doutor talala, macapá";
        short salario = 20000;
        String data = String.valueOf(LocalDate.now());
        System.out.println("EU: " + nome);
        System.out.println("Morando no endereço:" + endereco);
        System.out.println(" de salário:" + salario);
        System.out.println(" na data: " + data);

    }
}
