

class Carro {
    String modelo;
    int velocidade;
    String cor;
    String placa;

    Carro(String modelo, int velocidade, String cor, String placa) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.cor = cor;
        this.placa = placa;
    }
}

class Pessoa {
    String nome;
    Carro carro;

    Pessoa(String nome, Carro carro) {
        this.nome = nome;
        this.carro = carro;
    }

    void dirigir() {
        System.out.println(nome + " está dirigindo o " + carro.modelo +" da cor "+ carro.cor + " e da placa "+ carro.placa + " a "+ carro.velocidade + "Km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota",90, "Preto", "ABC1234");
        Pessoa pessoa1 = new Pessoa("João", carro1);
       
        Carro carro2 = new Carro("Chevrollet",80, "Azul", "DFG5678");
        Pessoa pessoa2 = new Pessoa("Gabriel", carro2);
       
        Carro carro3 = new Carro("Honda",100, "Prata", "HIJ9101");
        Pessoa pessoa3 = new Pessoa("Paulo", carro3);
        
        pessoa1.dirigir();
        pessoa2.dirigir();
        pessoa3.dirigir();
    }
}