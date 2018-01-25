scalaVersion := "2.12.4"
name := "compression"
organization := "org.lichess"
version := "1.0"
resolvers += "lila-maven" at "https://raw.githubusercontent.com/ornicar/lila-maven/master"
libraryDependencies += "org.specs2" %% "specs2-core" % "4.0.2" % "test"
scalacOptions in Test += "-Yrangepos"
publishTo := Some(Resolver.file("file", new File(sys.props.getOrElse("publishTo", ""))))
