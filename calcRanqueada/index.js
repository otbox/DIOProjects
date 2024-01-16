let vitorias = 10
let derrotas = 2

function CalcularSaldoDeVitorias (vitorias, derrotas) {
    return vitorias - derrotas   
}

function Ranking (vitorias) {
    if (vitorias <= 10) {return "Ferro"}
    else if ((vitorias >= 11)&&(vitorias <= 20)) {
        return "Bronze"}
    else if ((vitorias >= 21)&&(vitorias <= 50)) {
        return "Prata"}
    else if ((vitorias >= 51)&&(vitorias <= 80)) {
        return "Ouro"}
    else if ((vitorias >= 81)&&(vitorias <= 90)) {
        return "Diamante"}
    else if ((vitorias >= 91)&&(vitorias <= 100)) {
        return "Lendário"}
    else if (vitorias >= 101) {return "Imortal"}
}

console.log(`O Herói tem de saldo de **${CalcularSaldoDeVitorias(vitorias, derrotas)}** 
está no nível de **${Ranking(vitorias)}**`)