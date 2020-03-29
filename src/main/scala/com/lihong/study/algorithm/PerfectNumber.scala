package com.lihong.study.algorithm

/**
  * 【程序9】
  * 题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程 找出1000以内的所有完数。
  * 知识点：
  * scala的for 循环具有返回值，yield可以将遍历的值返回的相同的数据结构中
  */
class PerfectNumber {

}

object PerfectNumber extends App {

  println("number from 1 to 1000:")

  val iList = for (i <- 1 to 1000 if isPerfectNumber(i))
    yield i

  println(iList.mkString(","))

  def isPerfectNumber(i: Int): Boolean = {
    var num = 0
    for (j <- 1 to (i / 2)) {
      if (i % j == 0) num = num + j
    }
    if (i == num) {
      true
    } else {
      false
    }
  }
}