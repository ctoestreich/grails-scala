package com.far.scape

import grails.test.GrailsUnitTestCase
import com.far.scape.scala.Crichton

class GrailsServiceTests extends GrailsUnitTestCase {

  def grailsService

  protected void setUp() {
    super.setUp()
  }

  protected void tearDown() {
    super.tearDown()
  }

  void testSaveGroovyObject() {
    def chiana = new Chiana(name: "Chiana")
    assertTrue grailsService.saveObject(chiana)
  }

  void testSaveJavaObject() {
    def kadargo = new Kadargo(name: "Ka'Dargo")
    assertTrue grailsService.saveObject(kadargo)
  }

  void testSaveScalaObject() {
    def crichton = new Crichton(name: "Crichton")
    assertTrue grailsService.saveObject(crichton)
  }
}
