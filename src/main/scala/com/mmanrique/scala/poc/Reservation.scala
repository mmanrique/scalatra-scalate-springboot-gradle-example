package com.mmanrique.scala.poc

import javax.persistence.{Entity, GeneratedValue, Id}

import scala.beans.BeanProperty

@Entity
case class Reservation(@BeanProperty name: String) {

  def this() = this(null)

  @Id
  @GeneratedValue
  var id: Long = _


}
