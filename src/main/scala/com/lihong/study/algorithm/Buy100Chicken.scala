package com.lihong.study.algorithm

/** 【程序2】
  * 公鸡3元一只,母鸡2元一只,小鸡1元3只.有100元要买100只鸡,必须花光钱,怎样买
  */
class Buy100Chicken {

}


object Buy100Chicken extends App {
  for (x <- 1 to 100) {
    for (y <- 1 to 100) {
      for (z <- 1 to 100) {
        if ((x + y + 3 * z == 100) && (3 * x + 2 * y + z == 100)) {

          println("公鸡:%s 只;母鸡:%s 只;小鸡:%s 只".format(x, y, 3*z))

        }

      }
    }
  }

}