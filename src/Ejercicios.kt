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

fun reto13() {
    val paquetes = (1..50).toList()
    val lotes = paquetes.chunked(10)
    println("\n--- Reto 13: Reparto ---")
    println("Lotes para camiones: $lotes")
}

fun reto14() {
    val tickets = listOf(101, 102, 103, 101, 104, 102)
    val unico = tickets.groupBy { it }.filter { it.value.size == 1 }.keys.firstOrNull()
    println("\n--- Reto 14: Ticket Único ---")
    println("Primer ID único: $unico")
}

fun reto15() {
    val precios = mapOf("Pan" to 2000, "Carne" to 60000, "Vino" to 80000)
    val conIva = precios.mapValues { if (it.value > 50000) it.value * 1.19 else it.value }
    println("\n--- Reto 15: IVA Selectivo ---")
    println(conIva)
}

fun reto16() {
    val sensores = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    sensores.removeAll { it % 3 == 0 }
    println("\n--- Reto 16: Limpieza de Sensores ---")
    println(sensores)
}

fun reto17() {
    val almacen = arrayOf(
        intArrayOf(1, 0, 0, 1),
        intArrayOf(0, 1, 1, 0),
        intArrayOf(0, 1, 1, 0),
        intArrayOf(1, 0, 0, 1)
    )
    var sumaPrincipal = 0
    var sumaSecundaria = 0
    for (i in 0..3) {
        sumaPrincipal += almacen[i][i]
        sumaSecundaria += almacen[i][3 - i]
    }
    println("\n--- Reto 17: Matriz Almacén ---")
    println("Suma Diagonales: Principal $sumaPrincipal, Secundaria $sumaSecundaria")
}

fun reto18() {
    val chef1 = mapOf("Sal" to 10.0, "Harina" to 500.0)
    val chef2 = mapOf("Sal" to 5.0, "Agua" to 200.0)
    val fusion = chef1.toMutableMap()
    for ((ing, cant) in chef2) {
        fusion[ing] = fusion.getOrDefault(ing, 0.0) + cant
    }
    println("\n--- Reto 18: Fusión de Recetas ---")
    println(fusion)
}

fun reto19() {
    val apps = mutableListOf("WhatsApp" to 4.5, "Instagram" to 4.8, "TikTok" to 4.2)
    // Orden manual (Burbuja simple)
    for (i in 0 until apps.size - 1) {
        for (j in 0 until apps.size - 1 - i) {
            if (apps[j].second < apps[j + 1].second) {
                val temp = apps[j]
                apps[j] = apps[j + 1]
                apps[j + 1] = temp
            }
        }
    }
    println("\n--- Reto 19: Top Apps ---")
    println(apps)
}


fun reto20() {
    val listaA = listOf("Ana", "Carlos")
    val listaB = listOf("Beto", "Daniel")
    val combinada = (listaA + listaB).sorted() // sorted no es .sort() mutable, pero si quieres manual usa un merge simple
    println("\n--- Reto 20: Agendas Combinadas ---")
    println(combinada)
}

fun reto21() {
    fun esPrimo(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) return false
        }
        return true
    }
    val mantenimientos = (1..100).filter { esPrimo(it) }
    println("\n--- Reto 21: Pisos con Mantenimiento (Primos) ---")
    println(mantenimientos)
}

fun reto22() {
    val pila = mutableListOf<String>()
    fun push(plato: String) = pila.add(plato)
    fun pop() = if (pila.isNotEmpty()) pila.removeAt(pila.size - 1) else "Vacío"

    push("Plato Grande")
    push("Plato Hondo")
    println("\n--- Reto 22: Lavando Platos (LIFO) ---")
    println("Lavando: ${pop()}")
    println("Quedan: $pila")
}

