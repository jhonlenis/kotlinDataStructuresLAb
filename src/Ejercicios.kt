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

fun reto6() {
    val interesesP1 = setOf("Fútbol", "Programación", "Cine", "Gaming")
    val interesesP2 = setOf("Cine", "Lectura", "Gaming", "Viajes")
    val comparten = interesesP1.intersect(interesesP2)
    val exclusivosP1 = interesesP1.subtract(interesesP2)
    println("\n--- Reto 6: Match de Intereses ---")
    println("Comparten: $comparten | Solo P1: $exclusivosP1")
}

fun reto7() {
    val despensa = mutableMapOf("Arroz" to 5, "Café" to 2, "Leche" to 1)
    fun consumir(producto: String) {
        val cantidad = despensa[producto] ?: 0
        if (cantidad > 1) {
            despensa[producto] = cantidad - 1
        } else {
            despensa.remove(producto)
            println("¡Alerta! $producto se ha agotado.")
        }
    }
    println("\n--- Reto 7: Inventario ---")
    consumir("Leche")
    println("Estado despensa: $despensa")
}

fun reto8() {
    val notas = listOf(Pair(4.5, 0.3), Pair(3.8, 0.3), Pair(5.0, 0.4))
    var definitiva = 0.0
    for (nota in notas) {
        definitiva += nota.first * nota.second
    }
    println("\n--- Reto 8: Nota Definitiva ---")
    println("Promedio ponderado: $definitiva")
}

fun reto9() {
    val paises = mapOf("CO" to "Colombia", "MX" to "México", "AR" to "Argentina")
    println("\n--- Reto 9: Códigos ISO ---")
    for ((codigo, nombre) in paises) {
        println("El código $codigo pertenece a $nombre")
    }
}

fun reto10() {
    val empleados = mutableListOf("Alex", "Beto", "Cata", "Dani", "Ely", "Fer", "Gabi")
    val k = 2
    repeat(k) {
        val ultimo = empleados.removeAt(empleados.size - 1)
        empleados.add(0, ultimo)
    }
    println("\n--- Reto 10: Rotación de Turnos ---")
    println(empleados)
}

fun reto11() {
    val objetos = listOf("Camisa" to 1, "Laptop" to 3, "Zapatos" to 2, "Libro" to 1)
    val maleta = objetos.groupBy({ it.second }, { it.first })
    println("\n--- Reto 11: Maleta por Peso ---")
    println(maleta)
}

fun reto12() {
    val ruta = listOf("0,0", "1,2", "3,3", "1,2", "0,0")
    var esEspejo = true
    for (i in 0 until ruta.size / 2) {
        if (ruta[i] != ruta[ruta.size - 1 - i]) {
            esEspejo = false
            break
        }
    }
    println("\n--- Reto 12: Ruta Espejo ---")
    println("¿Es reversible?: $esEspejo")
}

