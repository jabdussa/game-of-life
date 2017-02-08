To include ScalaTest 3.0.1 in your sbt project:

1. Add these lines to your build file:

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

The dependency on Scalactic, ScalaTest's sister library focused on quality through types, is recommended but not required.


2. We also recommend you also include the SuperSafe Community Edition Scala compiler plugin, 
which will flag errors in your ScalaTest (and Scalactic) code at compile time, by first adding 
this line to ~/.sbt/0.13/global.sbt:

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"


3. Then adding the following line to project/plugins.sbt:

addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.0")


