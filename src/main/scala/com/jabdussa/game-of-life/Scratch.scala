import Console.{ println => p }
import com.typesafe.config.{ ConfigFactory => Conf }


object Scratch {

  def main ( args:Array[String] ) = {

		val conf = Conf.load()
		val seed = conf.getString("seed.conf")
		val rest = conf.getInt("tick.rest")
		val pace = conf.getInt("tick.pace")

		p (s" seed = $seed")
		p (s" rest = $rest")
		p (s" pace = $pace")

    val rr = Array.ofDim[Int](4,4)

    for ( r <- 0 to rr.size ; c <- 0 to rr.size ) {
      p ( s" $r-$c" )
    }



  }

}
