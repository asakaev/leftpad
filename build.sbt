ThisBuild / scalaVersion := "2.13.6"

ThisBuild / organization := "io.github.asakaev"
ThisBuild / organizationName := "io.github.asakaev"
ThisBuild / organizationHomepage := Some(url("https://github.com/asakaev"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/asakaev/leftpad"),
    "scm:git@github.com:asakaev/leftpad.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id = "asakaev",
    name = "Akhtiam Sakaev",
    email = "akhtiam.sakaev@gmail.com",
    url = url("https://github.com/asakaev")
  )
)
ThisBuild / licenses := List(
  "MIT License" -> url("https://www.opensource.org/licenses/mit-license")
)
ThisBuild / homepage := Some(url("https://github.com/asakaev/leftpad"))

lazy val leftpad = (project in file("."))
  .settings(publish / skip := true)
  .aggregate(core, refined)

lazy val core = (project in file("modules/core"))
  .settings(
    name := "leftpad-core",
    description := "leftpad core",
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.16.0" % "test"
  )

lazy val refined = (project in file("modules/refined"))
  .settings(
    name := "leftpad-refined",
    description := "leftpad refined",
    libraryDependencies += "eu.timepit" %% "refined" % "0.9.26"
  )
  .dependsOn(core)
