package com.lihong.study.matchtest

/**
  *
  */
class matchTest {
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "many"
  }

  def matchTest2(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala int"
    case _ => "many"
  }

  def matchTest3(): Unit = {
    val lihong = new Person("lihong", 20)
    val liweihong = new Person("liweihong", 12)
    val liyimo = new Person("liyimo", 2)
    val liyixin = new Person("liyixin", 1)

    val list = List(lihong, liweihong, liyimo, liyixin)

    for (person <- list) {
      person match {
        case Person("lihong", 20) => println("hello lihong")
        case Person("liweihong", 12) => println("hello liweihong")
        case Person("liyimo", 1) => println("hello liyimo")
        case Person(name, age) =>
          println("name is:" + name + " age is:" + age)
      }
    }
  }

  case class Person(name: String, age: Int)

}

object matchTest {
  def main(args: Array[String]): Unit = {
    val test2 = new matchTest()
    println(test2.matchTest(23))
    println(test2.matchTest2(23))
    println(test2.matchTest3())

  }
}