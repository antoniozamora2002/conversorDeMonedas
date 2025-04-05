# 📝 **Conversor de Monedas en Kotlin**  

Un programa sencillo en **Kotlin** que convierte entre diferentes monedas utilizando tasas de cambio predefinidas.  

---

## 🚀 **Características**  
✅ Conversión entre **USD, EUR y GBP**.  
✅ Validación de entrada (solo números positivos).  
✅ Menú interactivo fácil de usar.  
✅ Código limpio y modular con funciones dedicadas.  

---

## 📋 **Requisitos**  
- [Kotlin](https://kotlinlang.org/) (versión 1.3+).  
- [Kotlin/JVM](https://kotlinlang.org/docs/jvm-get-started.html) (para ejecutarlo en la JVM).  

---

## 🛠 **Instalación y Ejecución**  
1. Clona el repositorio o copia el código.  
2. Compila y ejecuta con Kotlin:  
   ```bash
   kotlinc ConversorMonedas.kt -include-runtime -d ConversorMonedas.jar
   java -jar ConversorMonedas.jar
   ```
   O usa **Kotlin Script**:  
   ```bash
   kotlin ConversorMonedas.kt
   ```

---

## 🎮 **Uso**  
1. Ejecuta el programa.  
2. Selecciona una opción del menú (ej: `1` para convertir USD a EUR).  
3. Ingresa la cantidad a convertir.  
4. ¡Obtén el resultado!  

**Ejemplo:**  
```
=== Conversor de Monedas ===  
1. USD a EUR  
2. USD a GBP  
...  
Seleccione una opción (1-7): 1  
Ingrese la cantidad en USD: 100  
Resultado: 100.0 USD = 85.0 EUR  
```

---

## 📂 **Estructura del Código**  
- **`tasasDeCambio`**: Mapa con tasas predefinidas.  
- **`mostrarMenu()`**: Muestra las opciones disponibles.  
- **`convertirMoneda()`**: Realiza la conversión.  
- **`validarCantidad()`**: Valida que la entrada sea un número positivo.  
- **`main()`**: Controla el flujo del programa.  

---

## 📧 **Contacto**  
¿Preguntas? ¡Contáctame en [antoniozp02@gmail.com]!  

--- 

🛠️ **¡Diviértete convirtiendo monedas!** 💰➡️💶
