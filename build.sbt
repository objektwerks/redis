name := "redis"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.12"
libraryDependencies ++= {
  Seq(
    "net.debasishg" %% "redisclient" % "3.42" % Test,
    "com.typesafe" % "config" % "1.4.2" % Test,
    "ch.qos.logback" % "logback-classic" % "1.4.14" % Test,
    "org.scalatest" %% "scalatest" % "3.2.17" % Test
  )
}
