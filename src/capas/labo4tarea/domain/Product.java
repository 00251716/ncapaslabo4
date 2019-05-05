package capas.labo4tarea.domain;

import java.util.Date;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Product {
		

		@Size(message="El nombre del producto debe tener, como máximo, 30 caracteres", max=30)
		@NotEmpty(message="El nombre del producto es un campo obligatorio")
		private String name;
		
		@Size(message="La marca del producto debe tener, como máximo, 30 caracteres", max=30)
		@NotEmpty(message="La marca del producto es un campo obligatorio")
		private String marca;
		
		@Size(message="La descripción del producto debe tener, como máximo, 30 caracteres", max=30)
		@NotEmpty(message="La descripción del producto es un campo obligatorio")
		private String description;
		
		@Size(message="La marca del producto debe tener, como máximo, 30 caracteres", max=30)
		@NotEmpty(message="La marca del producto es un campo obligatorio")
		private String category;
		
		@DecimalMin(message="El precio no puede ser un valor negativo", value="0.0", inclusive=true)
		private double price;
		
		@DateTimeFormat(pattern = "dd/mm/yyyy")
		@NotNull(message="La fecha de expiración es un campo obligatorio")
		private Date expirationDate;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public Date getExpirationDate() {
			return expirationDate;
		}
		public void setExpirationDate(Date expirationDate) {
			this.expirationDate = expirationDate;
		}
	
		
}
