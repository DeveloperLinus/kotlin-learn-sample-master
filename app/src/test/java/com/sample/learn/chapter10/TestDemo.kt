package com.sample.learn.chapter10

import com.google.common.base.Objects
import org.junit.Test
import java.util.*
import kotlin.collections.HashSet

class TestDemo {
    @Test
    fun test1() {
        val user1 = User().apply {
            userName = "huqinghui"
            userId = 131235
            age = 27
            hobby = "漫画"
        }
        val user2 = User().apply {
            userName = "huqinghui"
            userId = 131235
            age = 27
            hobby = "漫画"
        }
        val set = HashSet<User>()
        val table = Hashtable<Int, User>()
        table[1] = user1
        set.add(user1)
        println("set contains user2->${set.contains(user2)}")

        println("user1 hashCode->${user1.hashCode()}, user2 hashCode-> ${user2.hashCode()}")

        println("table contains user2->${table.contains(user2)}")
    }

    @Test
    fun test2() {
        val apple = Food().apply {
            name = "苹果"
            weight = 1.0f
            price = 25
        }
        val foodSet = HashSet<Food>()
        foodSet.add(apple)
        var table1 = Hashtable<Int, Food>()
        table1[1] = apple
        println("foodSet contains food->${foodSet.contains(apple)}")
        println("foodTable contains food->${table1.contains(apple)}")
        val apple2 = Food().apply {
            name = "苹果"
            weight = 1.0f
            price = 25
        }
        println("foodSet contains food->${foodSet.contains(apple2)}")
        println("foodTable contains food->${table1.contains(apple2)}")

        println("apple1 hashCode->${apple.hashCode()}, apple2 hashCode-> ${apple2.hashCode()}")
    }
}

class Food {
    var name: String? = null
    var price: Int? = null
    var weight: Float? = null
}

class User{
     var userName: String? = null
    var userId:Int? = null
   var age:Int? = null
    var hobby:String? = null

    override fun equals(other: Any?): Boolean { // 重写equals的目的:原有的equals是继承了Object的equals方法，比较的是内存地址，要比较内容的话需要重写equals
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val that = other as User
        return that.userName == userName && that.userId == userId && that.age == age && that.hobby == hobby
    }

    override fun hashCode(): Int { // 重写hashCode的目的：默认hashCode是基于对象的ID实现的，若重写equals，基于内容实现，保持hashCode实现不变，会导致两个对象内容“相等”，而hashCode不一样。会出现找不到
         return Objects.hashCode(userName, userId, age, hobby) // hashCode方法返回的是一个int值，可以看做是一个对象的唯一编码，如果两个对象的hashCode值相同，我们应该认为这两个对象是同一个对象。
    }
}

// 归纳知识点：
// 1、重写equals方法时需要重写hashCode方法，主要是针对Map、Set等集合类型的使用；
//a: Map、Set等集合类型存放的对象必须是唯一的；
//b: 集合类判断两个对象是否相等，是先判断equals是否相等，如果equals返回TRUE，还要再判断HashCode返回值是否ture,只有两者都返回ture,才认为该两个对象是相等的。
//2、由于Object的hashCode返回的是对象的hash值，所以即使equals返回TRUE，集合也可能判定两个对象不等，所以必须重写hashCode方法，以保证当equals返回TRUE时，hashCode也返回Ture，这样才能使得集合中存放的对象唯一。