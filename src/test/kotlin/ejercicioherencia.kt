fun main() {


    val lista = listOf(
        Gato(2.0),
        Perro(20.0),
        Persona(89.0),
        Gato(3.0),
        Perro(15.0),
        Persona(79.0),
        Gato(3.0),
        Perro(25.0),
        Persona(99.0)
    )

        // Haz un ejercicio como output tenga:
    // El peso medio de los gatos es:
    println("El peso medio de los gatos es ${calcularPesoMedioGatos(lista)}")
    // El peso medio de los perros es:
    println("El peso medio de los perros es ${calcularPesoMedioPerros(lista)}")
    // El peso medio de las personas es:
    println("El peso medio de las personas es ${calcularPesoMedioPersonas(lista)}")

    // Utiliza Herencia para Calcular desviación respecto a su peso ideal.
    // Peso ideal del perro = 22
    // Peso ideal del gato = 2.2
    // Peso ideal de la persona = 85
    lista.forEach {
        // Para el gato 1, el resutlado es -0,2. Para el perro 1 - 2.0, para la persona 1 es + 4.
        println("Este animal tiene un peso de ${it.calcularDesviacionDelPesoIdeal()} sobre lo esprado")//
   }





}

abstract class Animales( var peso : Double){
    abstract var pesoIdeal:Double
    fun calcularDesviacionDelPesoIdeal(): Double {
        return peso-pesoIdeal
    }
    }

fun calcularPesoMedioPersonas(lista: List<Animales>):Double {

    var sum = 0.0
    var cont = 0.0
    lista.forEach {
        if (it is Persona) {
            sum += it.peso
            cont ++

        }
    }
    return(sum/cont)
}

fun calcularPesoMedioPerros(lista: List<Animales>):Double {

    var sum= 0.0
    var cont = 0
    lista.forEach {
        if (it is Perro) {
            sum += it.peso
            cont ++

        }
    }
    return sum/cont

}

fun calcularPesoMedioGatos(lista: List<Animales>):Double{

    var sum = 0.0
    var cont = 0.0
    lista.forEach {
        if (it is Gato) {
            sum += it.peso
            cont ++

        }
    }
    return(sum/cont)

}





class Gato(peso:Double):Animales(peso){
     override var pesoIdeal=2.2
}
class Perro(peso:Double):Animales(peso){
    override var pesoIdeal=22.0
}

class Persona(peso:Double):Animales(peso){
    override var pesoIdeal=85.0
}


