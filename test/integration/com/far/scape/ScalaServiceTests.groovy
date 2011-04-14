package com.far.scape

import grails.test.GrailsUnitTestCase
import com.far.scape.scala.Crichton
import com.far.scape.scala.service.ScalaService

class ScalaServiceTests  extends GrailsUnitTestCase {

  def scalaService = new ScalaService()

  protected void setUp() {
    super.setUp()
  }

  protected void tearDown() {
    super.tearDown()
  }

  void testSaveGroovyObject() {
    def chiana = new Chiana(name: "Chiana")
    assertTrue scalaService.saveObject(chiana)
  }

  void testSaveJavaObject() {
    def kadargo = new Kadargo(name: "Ka'Dargo")
    assertTrue scalaService.saveObject(kadargo)
  }

  void testSaveScalaObject() {
    def crichton = new Crichton(name: "Crichton")
    assertTrue scalaService.saveObject(crichton)
  }
}

