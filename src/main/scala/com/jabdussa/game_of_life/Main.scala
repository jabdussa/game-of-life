package com.jabdussa.game_of_life


import com.typesafe.config.ConfigFactory
import scala.io.Source.{ fromFile => open }
import scala.collection.mutable.ListBuffer
//import scala.io.BufferedSource.{ getLines => chew }
//import scala.io.Source.{ getLines => chew }
import Console.{ println => p }


object Main {

	def main(args: Array[String]) = {

		val data = open(Conf.seed)

		val seed = new ListBuffer[Cell]()

		var maxRow, maxCol = 0

			for (line <- data.getLines) {
				val r = line.split(",").map(_.trim)
				val row = r(0).toInt
				val col = r(1).toInt
				if (row > maxRow) { maxRow = row }
				if (col > maxCol) { maxCol = col }
				seed += new Cell(row, col, true)
			}

		p (s"not sorted = $seed")

		val seedSorted = collection.SortedSet(seed: _*)

		p (s"sorted =     $seedSorted")

		p (s"maxRow=$maxRow")

		p (s"maxCol=$maxCol")

  }

}
