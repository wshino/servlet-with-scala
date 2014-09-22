name := "servlet-with-scala"

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-feature", "-deprecation")

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided",
  "org.eclipse.jetty" % "jetty-webapp" % "9.1.0.v20131115" % "container",
  "org.eclipse.jetty" % "jetty-plus" % "9.1.0.v20131115" % "container"
)

host in container.Configuration := "0.0.0.0"

port in container.Configuration := 8080