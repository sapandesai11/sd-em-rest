/**
 * 
 */
package com.sd.em.rest.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author PC Doctor.com
 *
 */
@Entity
@Table(name="transactions")
public class Transactions implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_id")
	private int id;
	
	@Column(name="amount")
	private double amount;
	
	@ManyToOne()
	@JoinColumn(name="category_id")
	private Categories category;
	
	@ManyToOne
	@JoinColumn(name="currency_id")
	private Currency currency;
	
	@ManyToOne
	@JoinColumn(name="payment_id")
	private PaymentMethods paymentMode;
	
	@ManyToOne
	@JoinColumn(name="id")
	private User owner;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the category
	 */
	public Categories getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Categories category) {
		this.category = category;
	}

	/**
	 * @return the currency
	 */
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	/**
	 * @return the paymentMode
	 */
	public PaymentMethods getPaymentMode() {
		return paymentMode;
	}

	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(PaymentMethods paymentMode) {
		this.paymentMode = paymentMode;
	}

	/**
	 * @return the owner
	 */
	public User getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(User owner) {
		this.owner = owner;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transactions [id=" + id + ", amount=" + amount + ", category=" + category + ", currency=" + currency
				+ ", paymentMode=" + paymentMode + ", owner=" + owner + ", getId()=" + getId() + ", getAmount()="
				+ getAmount() + ", getCategory()=" + getCategory() + ", getCurrency()=" + getCurrency()
				+ ", getPaymentMode()=" + getPaymentMode() + ", getOwner()=" + getOwner() + "]";
	}
	
	
}
