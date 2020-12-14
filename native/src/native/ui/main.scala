package native.ui

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import javafx.scene.layout.VBox

/*
NOTE: This main class (with diff name) is needed because JavaFX will check to see
if class extends Application, and if it does, will enforce javafx.* classes be loaded
from modules, not from our "fat jar" (which means JavaFX SDK is needed)

https://stackoverflow.com/questions/52569724/javafx-11-create-a-jar-file-with-gradle/52571719#52571719
 */
object Main {
  def main(args: Array[String]): Unit = {
    Application.launch(classOf[MainUI], args: _*)
  }
}

class MainUI extends Application {
  override def start(stage: Stage): Unit = {
    stage.setTitle("Native Image Test")
    val loader = new FXMLLoader(classOf[MainUI].getResource("main.fxml"))
    val root: VBox = loader.load()

    stage.setScene(new Scene(root))
    stage.setResizable(false)
    stage.show()
  }
}
