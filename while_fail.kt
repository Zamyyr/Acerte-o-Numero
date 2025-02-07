fun main() {
  println("Olá Jogador, Qual é seu nome?")
  val nome = readLine()?.trim() ?: "Anônimo"
  println("Escolha um número de até 02 digitos.")
  var escolha: Int? = null
do {
  println("Escolha um número")
  escolha = readLine()?.toIntOrNull()
  if (escolha != null) {
  when { 
    escolha < 10 -> println("Tenha mais ambição jogador, tente novamente!")
    escolha > 10 -> println("Você voou alto demais $nome, Tente de Novo!")
  }
  }
}else
  while (escolha!=10)
    println ("Parabéns Jogador $nome, Você venceu")
  
}
