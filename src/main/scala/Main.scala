import zio.ZIOAppDefault
import zio.Console.*
import zhttp.http._
import zhttp.http.Http
import zhttp.service.Server

object Main extends ZIOAppDefault {

  private val app: HttpApp[Any, Nothing] = Http.collect {
    case Method.GET -> !! / "hello" => Response.text("Hello, world!")
  }

  override def run = Server.start(8080, app)

}