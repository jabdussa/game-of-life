package com.jabdussa.game_of_life


import com.typesafe.config.ConfigFactory
import scala.io.Source.{ fromFile => inhale }
// import scala.collection.immutable.List.{ toList => toL }


object Main {

	def main(args: Array[String]) = {
    
    val seed = inhale(Conf.seed).toList

  }

}
  