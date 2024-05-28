// Desenvolva uma classe ContaBancaria com propriedades privadas para saldo e numeroDaConta.
// Forneça métodos públicos para depositar, sacar (com validação para evitar saldo negativo) e obterSaldo.
// Crie uma instância de conta bancária e teste a funcionalidade.

class BankCount{
    #saldo;
    #numeroConta;
    constructor(saldo, numeroConta){
        this.#numeroConta = numeroConta;
        this.#saldo = saldo;
    }

    depositar(valor){
        this.#saldo += valor;
        console.log('Valor depositado, saldo: R$'+this.#saldo);

    }

    sacar(valor){
        if(valor > this.#saldo){
            console.log('Seu saldo é insuficiente!');
        }else{
            this.#saldo -= valor;
            console.log('Valor sacado, saldo: R$'+this.#saldo);
        }
    }

    obterSaldo(){
        console.log('Saldo: R$'+this.#saldo);
    }
}

let conta1 = new BankCount(2000, 1);

conta1.depositar(1000);
conta1.sacar(1500);
conta1.obterSaldo();