// Desenvolva uma classe ItemDaLista com atributos para titulo, descricao e concluido.
// Crie uma classe ListaDeTarefas que gerencia uma coleção de objetos ItemDaLista.
// Inclua métodos em ListaDeTarefas para adicionar, remover, marcar como concluído/pendente e exibir a lista.
// Teste a criação, manipulação e exibição de itens da lista de tarefas.

class Product{
    #title
    #description
    #completed

    constructor(title, description){
        this.#title = title;
        this.#description = description;
        this.#completed = false;
    }

    /**
     * @param {boolean} #completed
     */
    set setCompleted(value){
        this.#completed=  value;

    }

    get getCompleted(){
        return this.#completed;
    }

    get getTitle(){
        return this.#title;
    }

    
}

class ListProduct extends Product{
    #list = [];
    

    constructor(list){
        super();
        this.#list = list;
    }

    get getList(){
        return this.#list;
    }

    add(title, description){
        let item = new Product(title, description);
        this.#list.push(item);
    }

    remove(title){
        let itemRemove = this.verifyItemExists(title) ;
        this.#list.splice(itemRemove,1);
        console.log(itemRemove.getTitle+' removido com sucesso!!');
    }

    verifyItemExists(title){
        for (let i =  0; i < this.#list.length; i++) {
            if(this.#list[i].getTitle == title){
                return this.#list[i];
            }else{
                console.log('Item Not Found!');
            };

            
        }   
    }

    completedCheck(title){
        let itemCheck = this.verifyItemExists(title);        
        itemCheck.setCompleted = true;
        console.log('Check in '+itemCheck.getTitle+ '!!');
    }


    seeList(){
        for (let i = 0; i < this.#list.length; i++) {
            console.log('Item '+ this.#list[i].getTitle+' is completed: '+this.#list[i].getCompleted);
        }
    }


}

let p1 = new Product('Car', 'Automobile for move');
let p2 = new Product('Computer', 'Object for acess for internet');
let products = [p1,p2];
console.log(products);


let l1 = new ListProduct(products);
console.log(l1.getList);


l1.add('Sound Box','Produce music for listen');
console.log(l1.getList)

l1.remove('Car');
console.log(l1.getList)

l1.completedCheck('Computer');
l1.seeList();
