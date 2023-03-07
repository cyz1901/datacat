import zio.*
import zhttp.*

object Main extends ZIOAppDefault {

  val app: HttpApp[Any, Nothing] = Http.collect[Request] {
    case Method.GET -> !! / "text" => Response.text("Hello World!")
  }

  override def run = Server.serve(app).provide
}