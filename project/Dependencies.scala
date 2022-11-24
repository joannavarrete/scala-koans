import sbt._

object Dependencies {
  lazy val scalaTest = "3.2.14"

  lazy val backendDeps = Seq(
    "org.scalatest" %% "scalatest" % scalaTest % "test"
  )
}
