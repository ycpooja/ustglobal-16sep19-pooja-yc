package com.ustglobal.ObjectClass;

public class Product {
int id;
String name;
String type;
double cost;
String brand;

public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	long temp;
	temp = Double.doubleToLongBits(cost);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	return result;
}

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	if (brand == null) {
		if (other.brand != null)
			return false;
	} else if (!brand.equals(other.brand))
		return false;
	if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (type == null) {
		if (other.type != null)
			return false;
	} else if (!type.equals(other.type))
		return false;
	return true;
}

public String toString() {
	return "Product [id=" + id + ", name=" + name + ", type=" + type + ", cost=" + cost + ", brand=" + brand + "]";
}

}
