val tasasDeCambio = mapOf(
    "USD_EUR" to 0.85,
    "USD_GBP" to 0.73,
    "EUR_USD" to 1.18,
    "EUR_GBP" to 0.86,
    "GBP_USD" to 1.37,
    "GBP_EUR" to 1.16
)

fun mostrarMenu() {
    println("=== Conversor de Monedas ===")
    println("1. USD a EUR")
    println("2. USD a GBP")
    println("3. EUR a USD")
    println("4. EUR a GBP")
    println("5. GBP a USD")
    println("6. GBP a EUR")
    println("7. Salir")
}

fun convertirMoneda(cantidad: Double, monedaOrigen: String, monedaDestino: String): Double {
    val clave = "${monedaOrigen}_${monedaDestino}"
    val tasa = tasasDeCambio[clave]
    return if (tasa != null) cantidad * tasa else 0.0
}

fun validarCantidad(cantidad: String?): Double? {
    return cantidad?.toDoubleOrNull()?.takeIf { it > 0 }
}

fun main() {
    while (true) {
        mostrarMenu()
        print("Seleccione una opción (1-7): ")
        val opcion = readlnOrNull()?.toIntOrNull()

        if (opcion == null || opcion !in 1..7) {
            println("❌ Opción no válida.")
            continue
        }

        if (opcion == 7) {
            println("👋 Saliendo del programa.")
            break
        }

        val (monedaOrigen, monedaDestino) = when (opcion) {
            1 -> "USD" to "EUR"
            2 -> "USD" to "GBP"
            3 -> "EUR" to "USD"
            4 -> "EUR" to "GBP"
            5 -> "GBP" to "USD"
            6 -> "GBP" to "EUR"
            else -> continue
        }

        print("Ingrese la cantidad en $monedaOrigen: ")
        val cantidad = validarCantidad(readlnOrNull())

        if (cantidad == null) {
            println("❌ Cantidad no válida.")
            continue
        }

        val resultado = convertirMoneda(cantidad, monedaOrigen, monedaDestino)
        println("Resultado: $cantidad $monedaOrigen = $resultado $monedaDestino")
    }
}