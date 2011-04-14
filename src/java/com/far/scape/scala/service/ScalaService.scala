package com.far.scape.scala.service

import com.far.scape.scala.Cast
import com.far.scape.JavaCast

class ScalaService {
  def saveObject(obj: Cast): Boolean = {
    print("Scala Service Saving Scala Trait " + obj.getClass.getName)
    true
  }

  def saveObject(obj: JavaCast): Boolean = {
    print("Scala Service Saving Java Interface " + obj.getClass.getName)
    true
  }
}