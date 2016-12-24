package com.jabdussa.examples.game_of_life


import com.typesafe.config.ConfigFactory
import scala.io.Source.{ fromFile => open }
import scala.collection.mutable.ListBuffer
import Console.{ println => p }
import com.jabdussa.examples.game_of_life.Utils.{ d => d }



object Main {

	def main(args: Array[String]) = {

		d(Conf.show)

		val eden = open(Conf.cells)
		val cells = new ListBuffer[Cell]()
		var maxRow, maxCol = 0

		//for (line <- eden.explore) {
		for (line <- eden.getLines) {
			val r = line.split(",").map(_.trim)
			val row = r(0).toInt
			val col = r(1).toInt
			if (row > maxRow) { maxRow = row }
			if (col > maxCol) { maxCol = col }
			cells += new Cell(row, col, true)
		}

		val cellsSorted = collection.SortedSet(cells: _*)

		d(s"initial cells = $cells")
		d(s"sorted cells  = $cellsSorted")
		d(s"maxRow = $maxRow")
		d(s"maxCol = $maxCol")

		val b = new GameBoard(cellsSorted, maxRow, maxCol)

  }

}
