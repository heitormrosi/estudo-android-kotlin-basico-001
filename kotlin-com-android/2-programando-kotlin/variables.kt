fun main() {
    /**  
     * Var define uma variável mutável em tempo de execução. 
     * 
     * A instrução ": Int" define o tipo da variável. 
     * 
     * Em Kotlin, é obrigatório que uma variável tenha um valor inicial.
     */
    var idade: Int = 22
    
    /**
     * Kotlin também possui inferência de tipo.
     */
    var x = 10
    
    /**
     * As variáveis em Kotlin são objetos convertidos em tipos primitivos 
     * pela JVM quando possível.
     * 
     * Tipos:
     * Int
     * Double
     * Float
     * Long
     * Short
     * Byte
     * String
     * Char
     * Boolean
     * Unit
     * ...
     */
    idade = 18
     
     /**
      * Em Kotlin, Val define uma variável imutável em tempo de execução.
      *
      * O uso de val é preferível por conta de sua segurança com relação 
      * à alteração dos valores das variáveis. O uso de var é por escolha 
      * de design e necessidade do programa.
      */
    val y: Int = 20
    
    val r = x + y

    println(r)
}