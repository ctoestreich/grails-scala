package grails.scala

import com.far.scape.Chiana
import com.far.scape.scala.Crichton
import com.far.scape.Kadargo

class MoyaController {
    def index = {
      def characters = [new Chiana(), new Kadargo(), new Crichton()].asList()
      [view:"index","characters":characters]
    }
}
