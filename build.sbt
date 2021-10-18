name := "redis"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.6"
libraryDependencies ++= {
  Seq(
    "net.debasishg" %% "redisclient" % "3.30" % Test,
    "com.typesafe" % "config" % "1.4.1" % Test,
    "ch.qos.logback" % "logback-classic" % "1.2.6" % Test,
    "org.scalatest" %% "scalatest" % "3.2.10" % Test
  )
}
