package com.dz.kaiying.DTO;
// default package

/**
 * Authority entity. @author MyEclipse Persistence Tools
 */
public class ItemPurchaseSubmitDTO implements java.io.Serializable {
		private String recipient;
		private String idNumber;
		private int count;
		private int itemId;
		private String number;
		private	int num;
		private String carNumber;

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setRecipient(String recipient) {
			this.recipient = recipient;
		}
		public String getRecipient() {
			return recipient;
		}

		public void setIdNumber(String idNumber) {
			this.idNumber = idNumber;
		}
		public String getIdNumber() {
			return idNumber;
		}

		public void setCount(int count) {
			this.count = count;
		}
		public int getCount() {
			return count;
		}

		public void setItemId(int itemId) {
			this.itemId = itemId;
		}
		public int getItemId() {
			return itemId;
		}

}