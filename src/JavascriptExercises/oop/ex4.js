// Crie uma classe Funcionario com propriedades como nome, departamento e salario.
// Crie uma subclasse Gerente que herda de Funcionario e tenha uma propriedade adicional bonus.
// Sobreponha o método getSalario em Gerente para incluir o bônus.
// Demonstre a criação de objetos e chamadas de método para Funcionario e Gerente.

class Funcionario{
    #nome
    #departamento
    #salario
    constructor(nome,departamento,salario){
        this.#nome = nome;
        this.#departamento = departamento;
        this.#salario = salario;
    }

    get getSalario(){
        return this.#salario;
    }

    set setSalario(v){
        this.#salario = v;
    }
}

class Gerente extends Funcionario{
    constructor(bonus){
        super();
        this.bonus = bonus;
    }

    get getSalario(){
        return super.getSalario+this.bonus;
    }
}

let f1 = new Funcionario('Carlos','Estagiario', 1200);
console.log(f1.getSalario);

let g1 = new Gerente(1000);
g1.setSalario = 5000;
console.log(g1.getSalario);
g1.nome = 'Bernardo';

console.log(g1.nome);