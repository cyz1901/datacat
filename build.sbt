val scala3Version = "3.1.3"
val projectVersion = "0.1.0-SNAPSHOT"

lazy val root = project
  .in(file("."))
  .settings(
    name := "datacat",
    version := projectVersion,
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.0.0",
      "dev.zio" %% "zio-streams" % "2.0.0",
      "io.d11" %% "zhttp" % "2.0.0-RC10",
      "com.thesamet.scalapb.zio-grpc" %% "zio-grpc-codegen" % "0.5.0"
    )
  ).aggregate(datacat_core, datacat_java_agent)

lazy val datacat_core = (project in file("datacat_core")).settings(
  name := "datacat_core",
  version := projectVersion,
  scalaVersion := scala3Version
)

lazy val datacat_java_agent = (project in file("datacat_java_agent")).settings(
  name := "datacat_java_agent",
  version := projectVersion,
  scalaVersion := scala3Version
)
