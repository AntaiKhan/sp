package controllers

  import javax.inject._
  import inputvalidator._
  import play.api.data.Forms._
  import play.api.data._
  import play.api.data.validation.Constraints._
  import play.api.mvc._

  /**
    * This controller creates an `Action` to handle HTTP requests to the
    * application's home page.
    */
  @Singleton
  class AuthController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    /**
      * Create an Action to render an HTML page with a welcome message.
      * The configuration in the `routes` file means that this method
      * will be called when the application receives a `GET` request with
      * a path of `/`.
      */
    def index = Action {
      Ok(views.html.index("Your new application is ready."))
    }
}
