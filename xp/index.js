
//Projeto XP heroi DIO
let Experience = 4000
let nome = "Pedro"
let nivel;

if (Experience <= 1000) {
    nivel = "ferro"
}
else if ((Experience >= 1001)&&(Experience <= 2000)) {nivel = "Bronze"}
else if ((Experience >= 2001)&&(Experience <= 5000)) {nivel = "Prata"}
else if ((Experience >= 5001)&&(Experience <= 7000)) {nivel = "Ouro"}
else if ((Experience >= 7001)&&(Experience <= 8000)) {nivel = "Platina"}
else if ((Experience >= 8001)&&(Experience <= 9000)) {nivel = "Ascendente"}
else if ((Experience >= 9001)&&(Experience <= 10000)) {nivel = "Imortal"}
else if (Experience >= 10001) {nivel = "Radiante"}

console.log(`O herói de nome **${nome}** está no nível de **${nivel}**`)