package com.jabdussa.examples.game_of_life

import scala.collection.SortedSet

case class Board(
		val rows:Int,
		val cols:Int,
		val seeds:List((Int,Int)
	)
)

}
