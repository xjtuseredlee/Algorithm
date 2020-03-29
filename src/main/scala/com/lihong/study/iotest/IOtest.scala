package com.lihong.study.iotest

import java.io.{File, PrintWriter}

import scala.io.{Source, StdIn}

class IOtest {

  def writeText(path: String, str: String): Unit = {
    val writer = new PrintWriter(new File(path));
    writer.write(str)
    writer.close()
  }
}

object IOtest {
  def main(args: Array[String]): Unit = {
    val path: String = "D:\\text.txt"
    print("please input string:")
    val line = StdIn.readLine()
    println("line:" + line)
    val str: String = "this is a scala program"
    val test = new IOtest()
    test.writeText(path, line)

    Source.fromFile("D:\\text.txt").foreach {
      print
    }
  }
}