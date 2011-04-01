package com.far.scape.scala.service

import com.far.scape.scala.Cast

class ScalaService {
  def save(obj: Cast) {
    print("Saving " + obj.getClass.getName)
  }
}