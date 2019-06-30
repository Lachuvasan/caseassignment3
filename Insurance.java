package com;

public class Insurance {
  
	String policyNo;
    String costOfPolicy;
    String dateOfExpiry;
    String dateOfAdmission;
    String dateOfDischarge;
    String medicalSpecialist;
		public Insurance(String policyNo, String costOfPolicy, String dateOfExpiry, String dateOfAdmission,
			String dateOfDischarge, String medicalSpecialist) {
		super();
		this.policyNo = policyNo;
		this.costOfPolicy = costOfPolicy;
		this.dateOfExpiry = dateOfExpiry;
		this.dateOfAdmission = dateOfAdmission;
		this.dateOfDischarge = dateOfDischarge;
		this.medicalSpecialist = medicalSpecialist;
	}
		  public String getPolicyNo() {
				return policyNo;
			}

			public void setPolicyNo(String policyNo) {
				this.policyNo = policyNo;
			}

			public String getCostOfPolicy() {
				return costOfPolicy;
			}

			public void setCostOfPolicy(String costOfPolicy) {
				this.costOfPolicy = costOfPolicy;
			}

			public String getDateOfExpiry() {
				return dateOfExpiry;
			}

			public void setDateOfExpiry(String dateOfExpiry) {
				this.dateOfExpiry = dateOfExpiry;
			}

			public String getDateOfAdmission() {
				return dateOfAdmission;
			}

			public void setDateOfAdmission(String dateOfAdmission) {
				this.dateOfAdmission = dateOfAdmission;
			}

			public String getDateOfDischarge() {
				return dateOfDischarge;
			}

			public void setDateOfDischarge(String dateOfDischarge) {
				this.dateOfDischarge = dateOfDischarge;
			}

			public String getMedicalSpecialist() {
				return medicalSpecialist;
			}

			public void setMedicalSpecialist(String medicalSpecialist) {
				this.medicalSpecialist = medicalSpecialist;
			}
}
