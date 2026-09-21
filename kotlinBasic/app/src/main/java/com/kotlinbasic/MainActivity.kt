package com.kotlinbasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlinbasic.ui.theme.KotlinBasicTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            KotlinBasicTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        week04Functions()
        week04Collections()
    }
}
private fun week04Functions() {
    println("======== Kotlin Classes =========")

    class Student{
        var name: String = ""
        var age: Int = 0

        fun introduce(){
            println("Hi, I'm $name and I'm $age years old")
        }
    }
    val student1 = Student()
    student1.name = "Mirae"
    student1.age = 21
    student1.introduce()

    data class Person(val name: String, val age: Int)

    val person1 = Person("Kim", 23)
    val person2 = Person("Park", 21)
    println("Person1 : $person1")
    println("Person1 : ${person1.name}")
    println("Person1 : ${person1.age}")
    println("Person2 : $person2")

}

private fun week04Collections() {
    println("========== Kotlin Collections ===========")

    val fruits = listOf("apple","banana","orange")
    val mutableFruits = mutableListOf("kiwi", "watermelon")
    //fruits.add("kiwi" // imutable
    mutableFruits.add("banana")
    println("Fruits: $fruits")
    println("Mutable Fruits: $mutableFruits")
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
,    )
}