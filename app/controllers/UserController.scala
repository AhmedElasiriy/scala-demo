// package controllers

// import javax.inject._
// import play.api._
// import play.api.mvc._
// import play.api.data._
// import play.api.data.Forms._

// case class UserData(password: String, email: String)

// @Singleton
// class UserController @Inject()(val controllerComponents: ControllerComponents) extends AbstractController(controllerComponents) {

//   val userForm = Form[UserData](
//     mapping(
//       "password" -> nonEmptyText,
//       "email" -> email
//     )(UserData.apply)(UserData.unapply)
//   )

//   def showRegistrationForm = Action {
//     Ok(views.html.register(userForm))
//   }

//   def processRegistration = Action {
//     // return ok if success
//     Ok("Registration successful")
//   }
// }
