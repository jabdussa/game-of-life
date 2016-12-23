import Console.{ println => p }
import com.typesafe.config.{ ConfigFactory => Confy }


object Scratch {

  def main ( args:Array[String] ) = {

		val c = Confy.load()
		val seed = c.getString("seed.conf")
		val rest = c.getInt("tick.rest")
		val pace = c.getInt("tick.pace")

		p (s" seed = $seed")
		p (s" rest = $rest")
		p (s" pace = $pace")

    val rr = Array.ofDim[Int](4,4)

    for ( r <- 0 to rr.size ; c <- 0 to rr.size ) {
      p ( s" $r-$c" )
    }



  }

}
