import sbt._
import Keys._
import ScalacOptions._

object Versions {
  val akka             = "2.6.10"
  val akkaAgent        = "2.5.31"
  val akkaContrib      = akkaAgent
  val akkaHttp         = "10.2.1"
  val betterMonadicFor = "0.3.1"
  val betterFiles      = "3.9.1"
  val cats             = "2.3.0"
  val catsCollections  = "0.9.0"
  val catsEffect       = "2.3.0"
  val catsMacros       = "2.1.1"
  val catsMtl          = "0.7.1"
  val catsTagless      = "0.11"
  val circe            = "0.13.0"
  val circeDroste      = "0.2.0"
  val contextual       = "1.2.1"
  val droste           = "0.8.0"
  val enumeratum       = "1.6.1"
  val fs2              = "2.4.4"
  val guava            = "30.0-jre"
  val http4s           = "0.21.13"
  val http4sJwtAuth    = "0.0.5"
  val kindProjector    = "0.11.1"
  val kittens          = "2.1.0"
  val logbackClassic   = "1.2.3"
  val meowMtl          = "0.4.1"
  val mockito          = "3.5.13"
  val monocle          = "2.1.0"
  val newtype          = "0.4.4"
  val pprint           = "0.6.0"
  val pureconfig       = "0.14.0"
  val refined          = "0.9.17"
  val rhoSwagger       = "0.21.0-RC1"
  val scalaCheck       = "1.14.3"
  val scalaTest        = "3.2.2"
  val servletApi       = "4.0.1"
  val simulacrum       = "1.0.0"
  val slf4j            = "1.7.30"
  val slick            = "3.3.3"
  val shapeless        = "2.3.3"
  val silencer         = "1.7.1"
  val upickle          = "1.2.2"
  val zio              = "1.0.3"
  val zioActors        = "0.0.7+34-6e140444-SNAPSHOT"
  val zioCats          = "2.2.0.1"
  val zioConfig        = "1.0.0-RC31"
  val zioQuery         = "0.2.5+29-b0711b81-SNAPSHOT"
  val zioLogging       = "0.5.4"
  val zioProcess       = "0.2.0"
}

object Dependencies {
  val akka: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-actor"          % Versions.akka,
    "com.typesafe.akka" %% "akka-agent"          % Versions.akkaAgent,
    "com.typesafe.akka" %% "akka-contrib"        % Versions.akkaContrib,
    "com.typesafe.akka" %% "akka-persistence"    % Versions.akka,
    "com.typesafe.akka" %% "akka-slf4j"          % Versions.akka,
    "com.typesafe.akka" %% "akka-stream"         % Versions.akka,
    "com.typesafe.akka" %% "akka-testkit"        % Versions.akka % "test",
    "com.typesafe.akka" %% "akka-stream-testkit" % Versions.akka % "test"
  )

  val akkaRemote: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-remote"             % Versions.akka,
    "com.typesafe.akka" %% "akka-multi-node-testkit" % Versions.akka % "test"
  )

  val akkaHttp: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-http"            % Versions.akkaHttp,
    "com.typesafe.akka" %% "akka-http-jackson"    % Versions.akkaHttp,
    "com.typesafe.akka" %% "akka-http-spray-json" % Versions.akkaHttp,
    "com.typesafe.akka" %% "akka-http-testkit"    % Versions.akkaHttp % "test"
  )

  val betterFiles: Seq[ModuleID] = Seq(
    "com.github.pathikrit" %% "better-files" % Versions.betterFiles
  )

  val cats: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-core"             % Versions.cats,
    "org.typelevel" %% "cats-kernel"           % Versions.cats,
    "org.typelevel" %% "cats-macros"           % Versions.catsMacros,
    "org.typelevel" %% "cats-free"             % Versions.cats,
    "org.typelevel" %% "cats-mtl-core"         % Versions.catsMtl,
    "org.typelevel" %% "cats-effect"           % Versions.catsEffect,
    "org.typelevel" %% "cats-tagless-macros"   % Versions.catsTagless,
    "org.typelevel" %% "cats-collections-core" % Versions.catsCollections,
    "org.typelevel" %% "cats-testkit"          % Versions.cats % "test"
  )

  val circe: Seq[ModuleID] = Seq(
    "io.circe" %% "circe-core"           % Versions.circe,
    "io.circe" %% "circe-literal"        % Versions.circe,
    "io.circe" %% "circe-generic"        % Versions.circe,
    "io.circe" %% "circe-generic-extras" % Versions.circe,
    "io.circe" %% "circe-optics"         % Versions.circe,
    "io.circe" %% "circe-parser"         % Versions.circe,
    "io.circe" %% "circe-refined"        % Versions.circe,
    "io.circe" %% "circe-testing"        % Versions.circe % "test"
  )

  val circeDroste: Seq[ModuleID] = Seq(
    "io.circe" %% "circe-droste" % Versions.circeDroste
  )

  val contextual: Seq[ModuleID] = Seq(
    "com.propensive" %% "contextual" % Versions.contextual
  )

  val droste: Seq[ModuleID] = Seq(
    "io.higherkindness" %% "droste-core" % Versions.droste
  )

  val enumeratum: Seq[ModuleID] = Seq(
    "com.beachape" %% "enumeratum"            % Versions.enumeratum,
    "com.beachape" %% "enumeratum-cats"       % Versions.enumeratum,
    "com.beachape" %% "enumeratum-circe"      % Versions.enumeratum,
    "com.beachape" %% "enumeratum-scalacheck" % Versions.enumeratum
  )

  val fs2: Seq[ModuleID] = Seq(
    "co.fs2" %% "fs2-core" % Versions.fs2,
    "co.fs2" %% "fs2-io"   % Versions.fs2
  )

  val guava: Seq[ModuleID] = Seq(
    "com.google.guava" % "guava" % Versions.guava
  )

  val http4s: Seq[ModuleID] = Seq(
    "org.http4s"     %% "http4s-blaze-server" % Versions.http4s,
    "org.http4s"     %% "http4s-blaze-client" % Versions.http4s,
    "org.http4s"     %% "http4s-circe"        % Versions.http4s,
    "org.http4s"     %% "http4s-dsl"          % Versions.http4s,
    "dev.profunktor" %% "http4s-jwt-auth"     % Versions.http4sJwtAuth
  )

  val kittens: Seq[ModuleID] = Seq(
    "org.typelevel" %% "kittens" % Versions.kittens
  )

  val logbackClassic: Seq[ModuleID] = Seq(
    "ch.qos.logback" % "logback-classic" % Versions.logbackClassic
  )

  val meowMtl: Seq[ModuleID] = Seq(
    "com.olegpy" %% "meow-mtl-core"    % Versions.meowMtl,
    "com.olegpy" %% "meow-mtl-effects" % Versions.meowMtl
  )

  val monocle: Seq[ModuleID] = Seq(
    "com.github.julien-truffaut" %% "monocle-core"    % Versions.monocle,
    "com.github.julien-truffaut" %% "monocle-generic" % Versions.monocle,
    "com.github.julien-truffaut" %% "monocle-macro"   % Versions.monocle,
    "com.github.julien-truffaut" %% "monocle-state"   % Versions.monocle,
    "com.github.julien-truffaut" %% "monocle-refined" % Versions.monocle,
    "com.github.julien-truffaut" %% "monocle-unsafe"  % Versions.monocle,
    "com.github.julien-truffaut" %% "monocle-law"     % Versions.monocle % "test"
  )

  val newtype: Seq[ModuleID] = Seq(
    "io.estatico" %% "newtype" % Versions.newtype
  )

  val pprint: Seq[ModuleID] = Seq(
    "com.lihaoyi" %% "pprint" % Versions.pprint
  )

  val pureconfig: Seq[ModuleID] = Seq(
    "com.github.pureconfig" %% "pureconfig" % Versions.pureconfig
  )

  val refined: Seq[ModuleID] = Seq(
    "eu.timepit" %% "refined"            % Versions.refined,
    "eu.timepit" %% "refined-cats"       % Versions.refined,
    "eu.timepit" %% "refined-eval"       % Versions.refined,
    "eu.timepit" %% "refined-jsonpath"   % Versions.refined,
    "eu.timepit" %% "refined-pureconfig" % Versions.refined,
    "eu.timepit" %% "refined-scalacheck" % Versions.refined,
    "eu.timepit" %% "refined-shapeless"  % Versions.refined
  )

  val rhoSwagger: Seq[ModuleID] = Seq(
    "org.http4s" %% "rho-swagger"    % Versions.rhoSwagger,
    "org.http4s" %% "rho-swagger-ui" % Versions.rhoSwagger
  )

  val slf4j: Seq[ModuleID] = Seq(
    "org.slf4j" % "slf4j-api" % Versions.slf4j
  ) ++ logbackClassic

  val servletAPI: Seq[ModuleID] = Seq(
    "javax.servlet" % "javax.servlet-api" % Versions.servletApi
  )

  val shapeless: Seq[ModuleID] = Seq(
    "com.chuusai" %% "shapeless" % Versions.shapeless
  )

  val silencer: Seq[ModuleID] = Seq(
    compilerPlugin("com.github.ghik" %% "silencer-plugin" % Versions.silencer),
    "com.github.ghik" %% "silencer-lib" % Versions.silencer % Provided
  )

  val simulacrum: Seq[ModuleID] = Seq(
    "org.typelevel" %% "simulacrum" % Versions.simulacrum
  )

  val slick: Seq[ModuleID] = Seq(
    "com.typesafe.slick" %% "slick"          % Versions.slick,
    "com.typesafe.slick" %% "slick-hikaricp" % Versions.slick,
    "com.typesafe.slick" %% "slick-testkit"  % Versions.slick % "test"
  )

  val testlibs: Seq[ModuleID] = Seq(
    "org.scalatest"  %% "scalatest"    % Versions.scalaTest,
    "org.scalacheck" %% "scalacheck"   % Versions.scalaCheck,
    "org.mockito"     % "mockito-core" % Versions.mockito
  ) map (_ % "test")

  val upickle: Seq[ModuleID] = Seq(
    "com.lihaoyi" %% "upickle" % Versions.upickle,
    "com.lihaoyi" %% "ujson"   % Versions.upickle,
    "com.lihaoyi" %% "upack"   % Versions.upickle
  )

  val zio: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio"              % Versions.zio,
    "dev.zio" %% "zio-streams"      % Versions.zio,
    "dev.zio" %% "zio-interop-cats" % Versions.zioCats,
    "dev.zio" %% "zio-macros"       % Versions.zio,
    "dev.zio" %% "zio-test"         % Versions.zio % "test",
    "dev.zio" %% "zio-test-sbt"     % Versions.zio % "test"
  )

  val zioActors: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio-actors"                  % Versions.zioActors,
    "dev.zio" %% "zio-actors-persistence"      % Versions.zioActors,
    "dev.zio" %% "zio-actors-persistence-jdbc" % Versions.zioActors
  )

  val zioConfig: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio-config"          % Versions.zioConfig,
    "dev.zio" %% "zio-config-refined"  % Versions.zioConfig,
    "dev.zio" %% "zio-config-magnolia" % Versions.zioConfig,
    "dev.zio" %% "zio-config-typesafe" % Versions.zioConfig
  )

  val zioLogging: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio-logging"       % Versions.zioLogging,
    "dev.zio" %% "zio-logging-slf4j" % Versions.zioLogging
  )

  val zioProcess: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio-process" % Versions.zioProcess
  )

  val zioQuery: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio-query" % Versions.zioQuery
  )
}

object Settings {
  lazy val commonSettings = Seq(
    scalaVersion := "2.13.4",
    scalacOptions ++= scalacFlags,
    scalacOptions in (Compile, console) ~= (_.filterNot(
      Set(
        "-Ywarn-unused:imports",
        "-Xfatal-warnings"
      )
    )),
    addCompilerPlugin("org.typelevel" %% "kind-projector"     % Versions.kindProjector cross CrossVersion.full),
    addCompilerPlugin("com.olegpy"    %% "better-monadic-for" % Versions.betterMonadicFor),
    fork in run := true,
    run / connectInput := true,
    updateOptions := updateOptions.value.withCachedResolution(true),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework"),
    resolvers ++= Seq(
      Resolver.typesafeRepo("releases"),
      Resolver.typesafeRepo("snapshots"),
      Resolver.sonatypeRepo("releases"),
      Resolver.sonatypeRepo("snapshots")
    )
  )
}
