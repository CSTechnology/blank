import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "blank"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
		  "com.mongodb.casbah" %% "casbah" % "2.1.5-1",
	      "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT",
	      "org.scalatest" %% "scalatest" % "1.7.1" % "test",
	      "org.scala-tools.testing" % "specs_2.8.0" % "1.6.5"
     )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
          testOptions in Test := Nil,
          resolvers ++= Seq("repo.novus snaps" at "http://repo.novus.com/snapshots/",
          "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
          "Sonatype OSS groups" at "https://oss.sonatype.org/content/groups/scala-tools/")
    )

}
