val scala3Version = "2.13.8"

lazy val root = project
  .in(file("."))
  .settings(
    name := "datacat",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.0.10",
      "dev.zio" %% "zio-streams" % "2.0.10",
      "io.d11" %% "zhttp" % "2.0.0-RC11"
    ) 
  )
