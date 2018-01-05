# How To Kotlin

### Points to cover
* [Java interoperability](https://kotlinlang.org/docs/reference/java-interop.html)
* Type inference ![check]
* Smart cast
* Method references
* inline if-else and try-catch
* Expression body methods
* Default closed classes
* Null safety
* default parameters and named parameters
* infix methods
* Extension functions
* String templates
* Compile time constants using `const`
* lateinit and delegated properties
* [Operator overloading](https://kotlinlang.org/docs/reference/operator-overloading.html)
* Arrays
* Collections
* Object expressions and declarations (Singleton, anonymous objects etc.)
* [Range expressions](https://kotlinlang.org/docs/reference/ranges.html)
* [Data classes](https://kotlinlang.org/docs/reference/data-classes.html)
* [Higher-Order Functions and Lambdas](https://kotlinlang.org/docs/reference/lambdas.html)


#### lateinit and delegated properties

Property delegates don’t have to implement any
 interface, but they have to provide a getValue() function (and setValue() 
```kotlin
val lazyGuy: LazyGuy by lazy { LazyGuy("is always late") }
```


* ##### TODO
Helpful functions right out of the box.

```kotlin
fun toBeImplemented() {
    TODO("Your reason")
}
```
Written as expression body
```kotlin
fun toBeImplemented() = TODO("Your reason")
```

* ##### Named and default arguments


* ##### Classes are final by default

```kotlin
class Pet(val name: String)

class Dog(name: String):Pet(name) // WON'T WORK: Pet is default final
```
We need to specify the `open` keyword
```kotlin
open class Pet(val name: String)
```

* ###### inlined if-else
```kotlin
fun testThis(str: String) = if(str.lenght > 2) "Test1" else "Test2"
```

* ##### inline try-catch
```kotlin

```



[logo]: https://kotlinlang.org/assets/images/open-graph/kotlin_250x250.png "Kotlin logo"

[check]: https://github.com/CriPstian/how-to-kotlin/raw/master/checkmark.png "Checked"