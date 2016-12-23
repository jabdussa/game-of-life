package com.jabdussa.game_of_life

import Console.{ println => p }
import com.typesafe.config.ConfigFactory


object Conf {
	
	val c = ConfigFactory.load()
	
	val seed = c.getString("seed.conf")
	val rest = c.getInt("tick.rest")
	val pace = c.getInt("tick.pace")

  def dump = {
  	p("\n\n ===> Conf Dump <=== \n\n")
  	p(s"seed = $seed")
		p(s"rest = $rest")
		p(s"pace = $pace")
		p("\n\n =================== \n\n")
  }
  
	
} 
