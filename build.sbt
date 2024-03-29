name := "redis"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.13"
libraryDependencies ++= {
  Seq(
    "net.debasishg" %% "redisclient" % "3.42" % Test,
    "com.typesafe" % "config" % "1.4.3" % Test,
    "ch.qos.logback" % "logback-classic" % "1.5.3" % Test,
    "org.scalatest" %% "scalatest" % "3.2.18" % Test
  )
}
