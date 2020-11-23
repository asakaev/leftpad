ThisBuild / scalaVersion := "2.13.4"

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

ThisBuild / description := "leftpad"
ThisBuild / licenses := List(
  "MIT License" -> url("https://www.opensource.org/licenses/mit-license")
)
ThisBuild / homepage := Some(url("https://github.com/asakaev/leftpad"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := (_ => false)

lazy val leftpad = (project in file("."))
  .aggregate(core, refined)

lazy val core = (project in file("modules/core"))
  .settings(
    name := "leftpad-core",
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.15.1" % "test"
  )

lazy val refined = (project in file("modules/refined"))
  .settings(
    name := "leftpad-refined",
    libraryDependencies += "eu.timepit" %% "refined" % "0.9.18"
  )
  .dependsOn(core)
