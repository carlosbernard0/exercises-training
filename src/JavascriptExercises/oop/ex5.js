// Crie uma classe abstrata Animal com um método abstrato fazerSom.
// Implemente classes concretas Cachorro e Gato que herdam de Animal e forneçam seus sons específicos em fazerSom.
// Defina um array de objetos de animais e itere por ele, chamando fazerSom em cada elemento (utilizando polimorfismo).

class Animal{
    makeSound(){

    }
}

class Dog extends Animal{
    makeSound(){
        return 'Au-Au!';
    }
}

class Cat extends Animal{
    makeSound(){
        return 'Miau-Miau!';
    }
}

let animals = [];
let d1 = new Dog();
let c1 = new Cat();
let d2 = new Dog();
let c2 = new Cat();
let c3 = new Cat();
animals.push(d1,c1,c2,c3,d2);

for (let i = 0; i < animals.length; i++) {
    console.log(animals[i].makeSound());   
}

