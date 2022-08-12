
lazy val root = project
  .in(file("."))
  .settings(
    name := "$name;format="normalize"$",
    organization := "$package$",

    scalaVersion := "3.1.3",

    libraryDependencies ++= Seq(
      $munit_version$ % Test
    )
  )
