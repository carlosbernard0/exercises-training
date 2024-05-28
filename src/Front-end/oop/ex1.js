// Crie uma classe Carro com propriedades como marca, modelo e ano.
// Inclua um método exibirInformacoes que imprime os detalhes do carro.
// Instancie dois objetos de carro e chame exibirInformacoes em cada um.

class Car{
    constructor(brand,model,year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    seeAtributes(){
        console.log('Your car is '+this.model + ', brand: '+this.brand+' of year '+ this.year);
    }
}


let car1 = new Car('Chevrolet', 'Ômega', 1996);
let car2 = new Car('Ford', 'F1000', 1989);

car1.seeAtributes();
car2.seeAtributes();