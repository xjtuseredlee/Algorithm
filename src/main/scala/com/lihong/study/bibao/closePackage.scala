package com.lihong.study.bibao

class closePackage {
  val str = "lihong"
  val closePackage: String = {
    "this is closePackage..." + str
  }

  val factor = 2
  val mutiplier: Int => Int = (i: Int) => i * factor

}

object closePackage {

  def main(args: Array[String]): Unit = {
    val close_package = new closePackage()
    println("value of mutiplier(3) is:" + close_package.mutiplier(3))
    println("value of mutiplier(4) is:" + close_package.mutiplier(4))
    println("value of mutiplier(4) is:" + close_package.closePackage)


  }
}