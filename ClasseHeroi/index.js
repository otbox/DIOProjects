class heroi {
    constructor  (nome, idade, tipo) {
        this.nome  = nome
        this.idade  = idade
        this.tipo  = tipo
    }

    tipoDoAtaque(){
        switch(this.tipo) {
            case 'mago':
                return 'magia';
                break;
            case 'ninja':
                return 'shuriken';
                break;
            case 'guerreiro':
                return 'espada';
                break;
            case 'monge':
                return 'artes marciais';
                break;
            default: return 'soco';
        }
    }
    atacar() {
        let ataque = this.tipoDoAtaque()
        console.log(`O ${this.tipo} atacou usando ${ataque}`);
    }
}

let Heroi2 = new heroi('Paulo', 35, 'guerreiro2');
Heroi2.atacar()