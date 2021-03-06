val dottyVersion = "0.21.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    organization := "com.phenan",
    name := "dotty-generic",
    version := "0.1.0",
    licenses += ("MIT", url("http://opensource.org/licenses/MIT")),

    scalaVersion := dottyVersion,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
