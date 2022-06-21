ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.15"

libraryDependencies +="org.apache.spark" %% "spark-core" % "3.3.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.3.0"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "3.3.0"
libraryDependencies += "org.apache.spark" %% "spark-sql-kafka-0-10" % "3.3.0" % Test
libraryDependencies += "org.apache.kafka" % "kafka-clients" % "3.2.0"
libraryDependencies += "io.delta" %% "delta-core" % "1.2.1"
lazy val root = (project in file("."))
  .settings(
    name := "OLAPAnalysis"
  )
