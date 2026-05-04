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

