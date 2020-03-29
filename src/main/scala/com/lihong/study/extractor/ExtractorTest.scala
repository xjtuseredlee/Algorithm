package com.lihong.study.extractor

class ExtractorTest {


}

object ExtractorTest {
  def apply(x: Int): Int = x * 2

  def main(args: Array[String]): Unit = {

    val x = ExtractorTest(5)

    println("x..." + x)
  }
}
