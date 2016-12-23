package com.jabdussa.game_of_life

import scala.io.Source
import com.typesafe.config.ConfigFactory

/**
  *  A singleton bcuz you only get one. :)
  */

object Main {

	def main(args: Array[String]) = {

    val seedConf = ConfigFactory.load().getString("seed")

  }

}
