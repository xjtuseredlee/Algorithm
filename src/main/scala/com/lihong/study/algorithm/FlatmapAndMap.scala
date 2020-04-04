package com.lihong.study.algorithm

/**
  * FlatMap函数有一般的功能和map函数函数一样,就是经过map函数之后多了一个扁平化的过程。
  * 不过有个要求，传入的函数在处理完后返回值必须是List(或Seq)，如果结果不是List(Seq)，那么将出错。
  * 也就是说，传入的函数是有要求的 —— 返回值是Seq才行。这样，每个元素处理后返回一个List，
  * 我们得到一个包含List元素的List，flatMap自动将所有的内部list的元素取出来构成一个List返回。
  *
  */
class FlatmapAndMap {

}

class People(val name: String, val friends: Seq[String])

object FlatmapAndMap extends App {

  val people1 = new People("lihong", Seq("liguoming", "sunsiyu", "wangyang"))
  val people2 = new People("liweihong", Seq("bailirong", "wuqian", "yuxi"))

  val peoples = Seq[People](people1, people2)
  println("map的形式：")

  val mapLike = peoples.map(f => f.friends)
  println(mapLike)
  println("flatmap的形式：")

  val mapflat = peoples.flatMap(f => f.friends)
  println(mapflat)


}