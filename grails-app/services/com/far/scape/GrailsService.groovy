package com.far.scape

import com.far.scape.scala.Cast

class GrailsService {

    static transactional = true

    def saveObject(Cast cast) {
      println "try to save object ${cast.class.name}"
      cast.save()
    }
}
