#Conway's Game Of Life (in Scala)


## Conway's Game of Life (Wikipedia)
https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life


## Underpopulation
Any live cell with fewer than two live neighbours dies, as if by underpopulation.


## Overpopulation
Any live cell with more than three live neighbours dies, as if by overcrowding.


## Community / Continuity
Any live cell with two or three live neighbours lives, unchanged, to the next generation.


## Birth / Rebirth
Any dead cell with exactly three live neighbours cells will come to life.


## Details
The initial pattern constitutes the seed of the system. 

The first generation is created by applying the above rules simultaneously 
to every cell in the seed—births and deaths occur simultaneously, 
and the discrete moment at which this happens is sometimes called a tick 
(in other words, each generation is a pure function of the preceding one). 

The rules continue to be applied repeatedly to create further generations.


## ~/.sbt/0.13/global.sbt

#### cat ~/.sbt/0.13/global.sbt
#### offline := true
####
#### resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
