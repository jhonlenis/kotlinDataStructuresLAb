fun reto1() {
    val gastos = arrayOf(10.2, 30.5, 30.0, 45.1, 22.2, 15.2, 44.1, 36.4, 40.0, 60.0, 5.0, 80.0, 20.0, 35.0)
    var total = 0.0
    var maximo = gastos[0]
    var minimo = gastos[0]

    for (gasto in gastos) {
        total += gasto
        if (gasto > maximo) maximo = gasto
        if (gasto < minimo) minimo = gasto
    }
    val promedio = total / gastos.size

    println("--- Reto 1: Control de Gastos ---")
    println("Total: $total, Promedio: $promedio, Máximo: $maximo, Mínimo: $minimo")
}

fun reto2(){
    val empleados = listOf("Jhon" to 33, "Mariana" to 35, "Andres" to 19, "Samuel" to 40, "luis" to 18)
    val seniorNames = empleados
        .filter { it.second > 30 }
        .map { it.first.uppercase() }

    println("\n--- Reto 2: Filtro Senior ---")
    println("empleados senior: $seniorNames")
}

fun reto3(){
    val contactos = listOf("321654", "654321", "987654", "654987", "321654", "654321", "987654")
    val unicos = contactos.toSet().sorted()

    println("\n--- Reto 3: Contactos Duplicados ---")
    println("Contactos unicos: $unicos")
}

fun reto4(){
    val carrito = listOf("Arroz", "Cafe", "Arepas", "Galletas", "Frutiño")
    val conteo = mutableMapOf<String, Int>()
    for (producto in carrito) {
        conteo[producto] = conteo.getOrDefault(producto, 0) + 1
    }
    println("\n --- Reto 4: Carrito de compras ---")
    println("conteo: $conteo")
}

fun reto5() {
    val urls = arrayOf("google.com", "github.com", "stackoverflow.com", "medium.com", "kotlinlang.org")
    val invertido = mutableListOf<String>()
    for (i in urls.size - 1 downTo 0) {
        invertido.add(urls[i])
    }
    println("\n--- Reto 5: Historial Invertido ---")
    println(invertido)
}

