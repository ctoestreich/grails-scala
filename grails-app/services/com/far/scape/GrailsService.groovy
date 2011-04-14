package com.far.scape

//import com.far.scape.scala.Cast

class GrailsService {

    static transactional = true

    def saveObject(JavaCast cast) {
      println "Grails Service saving object ${cast.class.name}"
      cast.save()
      true
    }
}
