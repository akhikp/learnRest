package pojoClassesTest1;

import java.util.Date;
import java.util.List;

public class Root {
	public int id;
	public String brand;
	public String name;
	public String price;
	public Object price_sign;
	public Object currency;
	public String image_link;
	public String product_link;
	public String website_link;
	public String description;
	public double rating;
	public String category;
	public String product_type;
	public List<Object> tag_list;
	public Date created_at;
	public Date updated_at;
	public String product_api_url;
	public String api_featured_image;
	public List<ProductColor> product_colors;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Object getPrice_sign() {
		return price_sign;
	}

	public void setPrice_sign(Object price_sign) {
		this.price_sign = price_sign;
	}

	public Object getCurrency() {
		return currency;
	}

	public void setCurrency(Object currency) {
		this.currency = currency;
	}

	public String getImage_link() {
		return image_link;
	}

	public void setImage_link(String image_link) {
		this.image_link = image_link;
	}

	public String getProduct_link() {
		return product_link;
	}

	public void setProduct_link(String product_link) {
		this.product_link = product_link;
	}

	public String getWebsite_link() {
		return website_link;
	}

	public void setWebsite_link(String website_link) {
		this.website_link = website_link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public List<Object> getTag_list() {
		return tag_list;
	}

	public void setTag_list(List<Object> tag_list) {
		this.tag_list = tag_list;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getProduct_api_url() {
		return product_api_url;
	}

	public void setProduct_api_url(String product_api_url) {
		this.product_api_url = product_api_url;
	}

	public String getApi_featured_image() {
		return api_featured_image;
	}

	public void setApi_featured_image(String api_featured_image) {
		this.api_featured_image = api_featured_image;
	}

	public List<ProductColor> getProduct_colors() {
		return product_colors;
	}

	public void setProduct_colors(List<ProductColor> product_colors) {
		this.product_colors = product_colors;
	}

}
