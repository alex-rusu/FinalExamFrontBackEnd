package com.sw409.FinalExamNew.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "covidvaccinatedresident")
public class CovidVaccinatedResident {
		String name;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		Integer id;
		Integer age;
		String vaccineProduct;
		String vaccineType;
		String date;
		public CovidVaccinatedResident(String name, Integer id, Integer age, String vaccineProduct, String vaccineType, String date) {
			this.name = name;
			this.id = id;
			this.vaccineProduct = vaccineProduct;
			this.vaccineType = vaccineType;
			this.date = date;
		}
		public CovidVaccinatedResident() {
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getVaccineProduct() {
			return vaccineProduct;
		}
		public void setVaccineProduct(String vaccineProduct) {
			this.vaccineProduct = vaccineProduct;
		}
		public String getVaccineType() {
			return vaccineType;
		}
		public void setVaccineType(String vaccineType) {
			this.vaccineType = vaccineType;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		
		
	}