name := "redis"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.15"
libraryDependencies ++= {
  Seq(
    "net.debasishg" %% "redisclient" % "3.42" % Test,
    "com.typesafe" % "config" % "1.4.3" % Test,
    "ch.qos.logback" % "logback-classic" % "1.5.15" % Test,
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
