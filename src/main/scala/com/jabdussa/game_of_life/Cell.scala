package com.jabdussa.examples.game_of_life

case class Cell (row: Int, col: Int, alive: Boolean) extends Ordered [Cell] {

    override def toString = s"$row/$col"

    def compare (that: Cell) = {

      if ((this.row == that.row) && (this.col == that.col))
        0
      else if ((this.row == that.row) && (this.col > that.col))
        1
      else if (this.row > that.row)
        1
      else if ((this.row < that.row) && (this.col > that.col))
        -1
      else
        -1

    }


}
