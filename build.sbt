enablePlugins(JavaAppPackaging)

ThisBuild / scalaVersion := "2.13.2"
ThisBuild / organization := "io.github.asakaev"

lazy val leftpad = (project in file("."))
  .settings(
    name := "leftpad",
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.1" % "test"
  )
