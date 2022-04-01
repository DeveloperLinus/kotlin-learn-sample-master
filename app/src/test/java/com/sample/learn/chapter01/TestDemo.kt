package com.sample.learn.chapter01

import org.junit.Test
import java.util.*

class TestDemo {
    @Test
    fun  test08() {
        val say = { name: String, age: Int ->
            "ni hao, my name is $name, i am $age years old"
        }
        show("xiao min", say)

        show("xiao li") { name: String, age: Int ->
            "ni hao, my name is $name, i am $age years old"
        }
    }

    fun show(name: String, say: (String, Int) -> String) {
        val age = Random().nextInt(40)
        val words = say(name, age)
        println(words)
    }

    @Test
    fun test09() {
        val predicate:(Char) -> Boolean = {
            it == 's'
        }
        val count01 = "MissYou".count(predicate = predicate)
        println("count01=$count01")

        val count02 =  "MissYou".count(predicate = {it == 's'})
        println("count02=$count02")

        val count03 =  "MissYou".count{it == 's'}
        println("count03=$count03")
    }

    @Test
    fun test10() {
        val greeting : (String)-> String = {
            "ni hao $it"
        }
        say(greeting)
    }

    private fun say(greeting: (String) -> String) {
        val name = "xiao min"
//        val words = greeting(name)
        val words = greeting.invoke(name)
        println(words)
    }
}