ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"


lazy val root = (project in file("."))
  .settings(
    name := "zerobounce",
    idePackagePrefix := Some("com.zerobounce")
  )

// equivalent to `artifactId`
name := "zerobounce-sdk"

// equivalent to `groupId`
organization := "com.zerobounce.scala"

licenses := Seq("MIT" -> url("https://raw.githubusercontent.com/zerobounce/zero-bounce-scala/main/LICENSE"))

description := "The ZeroBounce SDK for Scala"

import xerial.sbt.Sonatype.GitHubHosting
sonatypeProjectHosting := Some(GitHubHosting("zerobounce", "zero-bounce-scala", "integrations@zerobounce.net"))

// error occurring from the following line
//publishTo := sonatypeProjectHosting.value
