// Defina uma classe abstrata Forma com um método abstrato calcularArea (não pode ser implementado diretamente).
// Crie classes concretas Quadrado e Circulo que herdam de Forma e implementem calcularArea baseado em suas fórmulas.
// Instancie objetos de Quadrado e Circulo e chame calcularArea em cada um.

class Shape {
    constructor() {
      if (new.target === Shape) {
        throw new Error('Abstract class Shape cannot be instantiated directly');
      }
    }
  
    calculateArea(){

    };
  }

class Square extends Form{
    constructor(){
        super()
        this.
    }
    calculateArea(){

    }
}

class Circulo extends Form{
    calculateArea(){

    }
}