package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "city")
@Entity
public class City implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "city_id", insertable = false, nullable = false)
  private Integer cityId;

  @Column(name = "city", nullable = false)
  private String city;

  @Column(name = "country_id", nullable = false)
  private Integer countryId;

  @Column(name = "last_update", nullable = false)
  private Timestamp lastUpdate;

  public Integer getCityId() {
    return cityId;
  }

  public void setCityId(Integer cityId) {
    this.cityId = cityId;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Integer getCountryId() {
    return countryId;
  }

  public void setCountryId(Integer countryId) {
    this.countryId = countryId;
  }

  public Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public String toString() {
    return "City{cityId=" + cityId + 
      ", city=" + city + 
      ", countryId=" + countryId + 
      ", lastUpdate=" + lastUpdate + 
      "}";
  }
}