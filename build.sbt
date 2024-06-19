ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.19"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.18" % Test

lazy val root = (project in file("."))
  .settings(
    name := "UnderstandingScala"
  )
