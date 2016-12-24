package com.jabdussa.examples.game_of_life


import Console.{ println => p }
import com.typesafe.config.ConfigFactory


object Conf {

	val c = ConfigFactory.load()

	val cells = c.getString("cells.conf")
	val rest  = c.getInt("tick.rest")
	val pace  = c.getInt("tick.pace")
	val debug = c.getBoolean("debug")

	val status = s"""
	  |
  	| =====> Conf <=====
  	|  debug = $debug
  	|  cells = $cells
		|  rest  = $rest
		|  pace  = $pace
		| ==================
		""".stripMargin

  def dump:Unit = println(status)

	def show:String = status


}
