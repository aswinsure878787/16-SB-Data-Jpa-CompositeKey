package in.aswinit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="Bank_accounts")
@IdClass(AccountPK.class)
public class Account {
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accType=" + accType + ", holderName=" + holderName + ", branchName="
				+ branchName + ", minBal=" + minBal + "]";
	}

	@Id
	private Integer accId;
	@Id
	private String accType;
	@Id
	private String holderName;
	
	@Column(name="branch_name")
	private String branchName;
	
	@Column(name="min_bal")
	private Double minBal;

	public Integer getAccId() {
		return accId;
	}

	public void setAccId(Integer accId) {
		this.accId = accId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Double getMinBal() {
		return minBal;
	}

	public void setMinBal(Double minBal) {
		this.minBal = minBal;
	}
	
}
