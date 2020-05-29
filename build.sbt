ThisBuild / scalaVersion := "2.13.2"

lazy val leftpad = (project in file("."))
  .settings(
    name := "leftpad",
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.3" % "test"
  )

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
  "MIT License" -> new URL("https://www.opensource.org/licenses/mit-license")
)
ThisBuild / homepage := Some(url("https://github.com/asakaev/leftpad"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }

ThisBuild / publishTo := sonatypePublishToBundle.value
