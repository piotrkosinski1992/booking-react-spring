package com.project.domain;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {

  @Id
  @GeneratedValue
  private Integer id;
  @Column(name="reservation_from")
  private LocalDate from;
  @Column(name="reservation_to")
  private LocalDate to;
  private int offerId;
  private int total;

  public Reservation() {
  }

  public Reservation(int offerId, LocalDate from, LocalDate to, int total) {
    this.offerId = offerId;
    this.from = from;
    this.to = to;
    this.total = total;
  }


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDate getFrom() {
    return from;
  }

  public void setFrom(LocalDate from) {
    this.from = from;
  }

  public LocalDate getTo() {
    return to;
  }

  public void setTo(LocalDate to) {
    this.to = to;
  }

  public int getOfferId() {
    return offerId;
  }

  public void setOfferId(int offerId) {
    this.offerId = offerId;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }
}
