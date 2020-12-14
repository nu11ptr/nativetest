import mill._, scalalib._, scalafmt._

object native extends ScalaModule with ScalafmtModule {
  def scalaVersion = "2.13.3"
  def javaFXVersion = "11.0.2"

  def scalacOptions = Seq("-feature", "-deprecation", "-Wunused:imports")

  def mainClass = Some("native.ui.Main")

  def ivyDeps = Agg(
    // Database
    //ivy"com.h2database:h2:1.4.200",
    //ivy"com.typesafe.slick::slick:3.3.3",
    // Logging
    //ivy"org.slf4j:slf4j-api:1.7.30",
    //ivy"ch.qos.logback:logback-classic:1.2.3",
    // Time series db
    // ivy"org.questdb:questdb:5.0.5",
    // JavaFX
    ivy"org.openjfx:javafx-controls:$javaFXVersion",
    ivy"org.openjfx:javafx-fxml:$javaFXVersion",
    ivy"org.openjfx:javafx-graphics:$javaFXVersion;classifier=win",
    ivy"org.openjfx:javafx-graphics:$javaFXVersion;classifier=linux",
    ivy"org.openjfx:javafx-graphics:$javaFXVersion;classifier=mac",
    // JavaFX additional
    ivy"org.controlsfx:controlsfx:11.0.3"
  )
}
