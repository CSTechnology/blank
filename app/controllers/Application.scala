package controllers

import play.api._
import play.api.Play.current
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index(getTitle()))
  }
  
  def file = Action{
    val app = Play.application
    var file = new java.io.File("/Users/kengo1119jp/Documents/workspace/blank/app/data/favicon.png")
    val source = scala.io.Source.fromFile(file)(scala.io.Codec.ISO8859)
    val byteArray = source.map(_.toByte).toArray
    source.close()
    Ok(byteArray).as("image/png")
  }
  def getTitle() = "Your new blank application is ready."
}