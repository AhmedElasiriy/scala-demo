
package controllers

import javax.inject._

import play.api.mvc._
import play.api.i18n._

@Singleton
class TaskListC @Inject() (cc: ControllerComponents) extends AbstractController(cc)  {

    def login = Action {
        Ok(views.html.login())
    }

    def validateLogin(username: String, password: String) = Action {
        Ok(s"username: $username, password: $password")
    }
    
def tasklist = Action {
    val tasks = List("go to the store", "clean the kitchen", "learn some scala")
Ok(views.html.tasklist(tasks))  
}
}