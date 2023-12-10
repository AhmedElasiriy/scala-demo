
package controllers

import javax.inject._

import play.api.mvc._
import play.api.i18n._

@Singleton
class TaskList @Inject() (cc: ControllerComponents) extends AbstractController(cc)  {
def tasklist = Action {
    val tasks = List("go to the store", "clean the kitchen", "learn some scala")
Ok(views.html.tasklist(tasks))  
}
}