package com.far.scape

import com.far.scape.scala.Cast

class Chiana implements Cast {

  String name

  String race() {
    "I am Nebari"
  }

  String actor() {
    "Gigi Egdley"
  }

  void save() {
    println "in groovy save"
  }
}
